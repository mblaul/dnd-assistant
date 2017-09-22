package application;

import java.io.FileWriter;
import java.util.Arrays;


public class FileHandling {

    public static void main(String[] args) throws Exception {

    	String projectPath = System.getProperty("user.dir");
    	String csvFile = projectPath + "/files/weapons.csv";
        FileWriter writer = new FileWriter(csvFile);

        CSVUtils.writeLine(writer, Arrays.asList("a", "b", "c", "d"));
        
        writer.flush();
        writer.close();

    }

}