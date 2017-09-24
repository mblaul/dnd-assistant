/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd_inventory_mng;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Matt
 */

public class CSVHandling {
    public static void main(String[] args) throws FileNotFoundException {
        Integer i = 0;
        
        String appDir = System.getProperty("user.dir");
        String csvFile = appDir + "/src/dnd_inventory_mng/files/test.csv";
        
        Scanner scanner = new Scanner(new File(csvFile));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+",");
        }
        scanner.close();
    }
}