package Assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 * Assignment 3 Counts a character that appears in a a file.  Character is specified in command line
 * @author Dai
 */
public class CountingChar {
    /**
     * Displays the number of times a character is in AllHello
     * @param args First character in command line
     */
    public static void main(String[] args){
        CountingChar s = new CountingChar();
        System.out.println(s.countChar(args[0].charAt(0)));
    }
    /**
     * Opens and counts the number of times a character is used in AllHello
     * @param c Character to be counted
     */
    public int countChar(char c) {
        int count=0;
        try(BufferedReader file=new BufferedReader(new FileReader("resources/in/AllHello"))){
            int cnt;
            do {
                cnt = file.read();
                if (cnt == (int) c) {
                    count++;
                }
            }while(cnt!=-1);

        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }
}
