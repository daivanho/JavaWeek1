package Assignment2;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guesser<userGuess> {
    Random rand=new Random();
    private static int number= ThreadLocalRandom.current().nextInt(1,101);

    public static void main(String[] args){
        Scanner guess=new Scanner(System.in);
            System.out.println("Guess a Number 1-100:");
            String userGuess;
            boolean failed=true;
            int tries = 0;
            do {
                userGuess=guess.nextLine();
                tries++;
                if(Integer.parseInt(userGuess)>=number-10&&Integer.parseInt(userGuess)<=number+10) {
                    System.out.println("Congrats! number is " + number);
                    failed=false;
                    break;
                }
            }
        while (tries <5);
        if(failed){
            System.out.println("Sorry number is "+number);
        }

    }
}
