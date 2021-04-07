package Assignment1;

/**
 * Assignment 1 adding together command line while checking for exception
 * @author Dai
 */
public class CommandLineAdd {

    /**
     * add numbers in command line and print the total also printing when exception is found.
     * @param args from command line
     */
    public static void main(String[] args){
        Integer sum=0;
        for (String s:args){
            try {
                sum += Integer.parseInt(s);
            }catch (Exception e){
                System.out.println("Not a number in command line");
            }
        }
        System.out.println(sum);
    }
}
