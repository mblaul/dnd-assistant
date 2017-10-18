/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd_inventory_mng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.opencsv.CSVWriter;
import java.io.BufferedWriter;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.Scanner;





/**
 *
 * @author Matt
 */

public class CSVHandling {
   
    //Delimiters used in the CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String ITEM_FILE_DIR = System.getProperty("user.dir")+"/src/dnd_inventory_mng/files/";
    
    String[] itemType = {"Armor","Melee","Ranged","Potion","Adventure"};
    List<Item> itemList = new ArrayList<Item>();
    List<Armor> armorItemList = new ArrayList<Armor>();
    List<Melee> meleeItemList = new ArrayList<Melee>();
    List<Ranged> rangedItemList = new ArrayList<Ranged>();
    List<Potion> potionItemList = new ArrayList<Potion>();
    List<Adventure> adventureItemList = new ArrayList<Adventure>();
    
    public void readFromCSV(){
        BufferedReader br = null;
        
        try
        {
            for(int i = 0; i+1 <= itemType.length; i++){
                String itemTypeFile = ITEM_FILE_DIR + itemType[i] + ".csv";
                String itemCase = itemType[i];
                
                //Opening the individual csv files
                br = new BufferedReader(new FileReader(itemTypeFile));

                //Create List for holding Item objects
                

                String line = "";
                //Read to skip the header
                br.readLine();
                //Reading from the second line
                while ((line = br.readLine()) != null) 
                {
                    String[] itemDetails = line.split(COMMA_DELIMITER);

                    if(itemDetails.length > 0 )
                    {
                        switch(itemCase){
                            
                            case "Armor":
                            //Add the item details in Armor object
                            Armor itemTemp0 = new Armor(Integer.parseInt(itemDetails[0]),
                                    itemDetails[1],Integer.parseInt(itemDetails[2]),
                                    Double.parseDouble(itemDetails[3]),Integer.parseInt(itemDetails[4]));
                            armorItemList.add(itemTemp0);
                            break;
                            
                            case "Melee":
                            //Add the item details in Melee object
                            Melee itemTemp1 = new Melee(Integer.parseInt(itemDetails[0]),
                                    itemDetails[1],Integer.parseInt(itemDetails[2]),
                                    Double.parseDouble(itemDetails[3]),Integer.parseInt(itemDetails[4]),
                                    Integer.parseInt(itemDetails[5]),Integer.parseInt(itemDetails[6]));
                            meleeItemList.add(itemTemp1);
                            break;
                            
                            case "Ranged":
                            //Add the item details in Ranged object
                            Ranged itemTemp2 = new Ranged(Integer.parseInt(itemDetails[0]),
                                    itemDetails[1],Integer.parseInt(itemDetails[2]),
                                    Double.parseDouble(itemDetails[3]),Integer.parseInt(itemDetails[4]),
                                    Integer.parseInt(itemDetails[5]),Integer.parseInt(itemDetails[6]));
                            rangedItemList.add(itemTemp2);
                            break;
                            
                            case "Potion":
                            //Add the item details in Potion object
                            Potion itemTemp3 = new Potion(Integer.parseInt(itemDetails[0]),
                                    itemDetails[1],Integer.parseInt(itemDetails[2]),
                                    Double.parseDouble(itemDetails[3]),Boolean.parseBoolean(itemDetails[4]));
                            potionItemList.add(itemTemp3);
                            break;
                            
                            case "Adventure":
                            //Add the item details in Adventure object
                            Adventure itemTemp4 = new Adventure(Integer.parseInt(itemDetails[0]),
                                    itemDetails[1],Integer.parseInt(itemDetails[2]),
                                    Double.parseDouble(itemDetails[3]),Boolean.parseBoolean(itemDetails[4]));
                            adventureItemList.add(itemTemp4);
                            break;
                        }        
                    }
                }
            }

            //Lets print the Item List
            for(Armor e : armorItemList)
            {
                System.out.println(e.getItemID()+"   "+e.getName()+"   "
                                +e.getCost()+"   "+e.getWeight()+"   "
                                +e.getDefense());
            }
            for(Melee e : meleeItemList)
            {
                System.out.println(e.getItemID()+"   "+e.getName()+"   "
                                +e.getCost()+"   "+e.getWeight()+"   "
                                +e.getStrength()+"   "+e.getStamina());
            }
            for(Ranged e : rangedItemList)
            {
                System.out.println(e.getItemID()+"   "+e.getName()+"   "
                                +e.getCost()+"   "+e.getWeight()+"   "
                                +e.getRange()+"   "+e.getStamina());
            }
            
            //Example of how to look up the name of an item.
            System.out.println(meleeItemList.get(0).getName());

            
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
    }
    
    


 public void WriteCSV() throws IOException {


        String idFile = "Merged Files";
        int numFiles = 5;

        try {
            mergeCsvFiles(idFile, numFiles);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void mergeCsvFiles(String idFile, int numFiles) throws IOException {

        // Variables
        ArrayList<File> files = new ArrayList<File>();
        Iterator<File> iterFiles;
        File fileOutput;
        BufferedWriter fileWriter;
        BufferedReader fileReader;
        String csvFile = null;
        String csvFinal = ITEM_FILE_DIR + idFile + ".csv";
        String[] headers = null;
        String header = null;

        // Files: Input
        for (int i = 1; i <= numFiles; i++){
            
            if (i == 1)
            csvFile = ITEM_FILE_DIR + "Adventure.csv" ;
            files.add(new File(csvFile));
            
            if (i == 2)
            csvFile = ITEM_FILE_DIR + "Armor.csv" ;
            files.add(new File(csvFile));
            
            if (i != 3)
            csvFile = ITEM_FILE_DIR + "Melee.csv" ;
            files.add(new File(csvFile));
       
            if (i != 4)
            csvFile = ITEM_FILE_DIR + "Potion.csv" ;
            files.add(new File(csvFile));
            
            if (i != 5)
            csvFile = ITEM_FILE_DIR + "Ranged.csv" ;
            files.add(new File(csvFile));
            
           
        }

        // Files: Output
        fileOutput = new File(csvFinal);
        if (fileOutput.exists()) {
            fileOutput.delete();
        }
        try {
            fileOutput.createNewFile();
            // log
            // System.out.println("Output: " + fileOutput);
        } catch (IOException e) {
            // log
        }

        iterFiles = files.iterator();
        fileWriter = new BufferedWriter(new FileWriter(csvFinal, true));

        // Headers
        Scanner scanner = new Scanner(files.get(0));
        if (scanner.hasNextLine())
            header = scanner.nextLine();
        // if (scanner.hasNextLine()) headers = scanner.nextLine().split(";");
        scanner.close();

        /*
         * System.out.println(header); for(String s: headers){
         * fileWriter.write(s); System.out.println(s); }
         */

        fileWriter.write(header);
        fileWriter.newLine();

        while (iterFiles.hasNext()) {

            String line;// = null;
            String[] firstLine;// = null;

            File nextFile = iterFiles.next();
            fileReader = new BufferedReader(new FileReader(nextFile));

            if ((line = fileReader.readLine()) != null)
                firstLine = line.split(";");

            while ((line = fileReader.readLine()) != null) {
                fileWriter.write(line);
                fileWriter.newLine();
            }
            fileReader.close();
        }

        fileWriter.close();

    }
 }
