/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd_inventory_mng;

import java.io.BufferedReader;
import java.io.FileReader;
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
    
    public static void main(String args[])
    {
        BufferedReader br = null;
        try
        {
            //Reading the csv file
            br = new BufferedReader(new FileReader("Items.csv"));
            
            //Create List for holding Items objects
            List<Items> itemList = new ArrayList<Items>();
            
            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while ((line = br.readLine()) != null) 
            {
                String[] itemDetails = line.split(COMMA_DELIMITER);
                
                if(itemDetails.length > 0 )
                {
                    //Save the employee details in Items object
                    Items item = new Items(Integer.parseInt(itemDetails[0]),
                            itemDetails[1],itemDetails[2],
                            Integer.parseInt(itemDetails[3]));
                    itemList.add(item);
                }
            }
            
            //Lets print the Items List
            for(Items e : itemList)
            {
                System.out.println(e.getEmpId()+"   "+e.getFirstName()+"   "
                		+e.getLastName()+"   "+e.getSalary());
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
