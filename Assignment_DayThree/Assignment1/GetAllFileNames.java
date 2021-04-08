package Assignment1;

import java.io.File;
import java.util.Scanner;

/**
 * Assignment 1 displays a list of all file/directory names under a given directory
 * @author Dai
 */
public class GetAllFileNames {
    /**
     * User input directory to display all files and folder
     *
     */
    public static void main(String[] args){
        GetAllFileNames s=new GetAllFileNames();
        Scanner getDir=new Scanner(System.in);
        System.out.println("Enter Directory:  ");
        String dir=getDir.nextLine();
        s.displayAll(dir);
    }
    /**
     * displays files and folder from path
     * @param path directory path
     */
    public void displayAll(String path){
        File directory = new File(path);
        File[] all= directory.listFiles();
        if (all != null) {
            for(File e: all){
                if(e.isDirectory()) {
                    System.out.println(e.getName());
                    displayAll(e.getAbsolutePath());
                }else {
                    String[] list = directory.list();
                    if (list != null) {
                        for (String s : list) {
                            System.out.println(s);
                        }
                    }
                }
            }
        }
    }
}
