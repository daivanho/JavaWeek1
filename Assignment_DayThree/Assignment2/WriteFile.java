package Assignment2;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/**
 * Assignment 2 append text to existing file
 * @author Dai
 */
public class WriteFile {
    /**
     * Writes Hello to AllHello text file
     *
     */
    public static void main(String[] args){
        WriteFile s=new WriteFile();
        s.writeToFile("Hello");
    }
    /**
     * Writes data to text file
     * @param data string to write to file
     */
    public void writeToFile(String data){
        try{
            Files.write(Paths.get("resources/in/AllHello"),data.getBytes(), StandardOpenOption.APPEND);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
