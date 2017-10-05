/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd_inventory_mng;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Matt
 */

public class CSVHandling {
   
    //Delimiters used in the CSV file
    private static final String COMMA_DELIMITER = ",";
    
    public void readFromCSV(){
        BufferedReader br = null;
        try
        {
            //Reading the csv file
            
            br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/dnd_inventory_mng/files/test.csv"));
            
            //Create List for holding Item objects
            List<Item> itemList = new ArrayList<Item>();
            
            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while ((line = br.readLine()) != null) 
            {
                String[] itemDetails = line.split(COMMA_DELIMITER);
                
                if(itemDetails.length > 0 )
                {
                    //Save the employee details in Item object
                    Item itemTemp = new Item(Integer.parseInt(itemDetails[0]),
                            itemDetails[1],Integer.parseInt(itemDetails[2]),
                            Integer.parseInt(itemDetails[3]));
                    itemList.add(itemTemp);
                }
            }
            
            //Lets print the Item List
            for(Item e : itemList)
            {
                System.out.println(e.getItemID()+"   "+e.getName()+"   "
                		+e.getCost()+"   "+e.getWeight());
            }
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
    
    public void writeToCSV() throws IOException{
        BufferedReader br = null;
        try
        {
            //Reading the csv file
            br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/dnd_inventory_mng/files/test.csv"));
            //Create List for holding Item objects
            List<Item> itemList = new ArrayList<Item>();
            
            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while((line = br.readLine()) != null){
                
            } 
            
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
        
        
}
    
    