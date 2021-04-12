package Assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * All lambda test put to there for both assignments
 */
public class Lambda {

    public static String[] names = {"David", "John", "Tim", "Scott", "Rachel", "Madi", "Erin", "ann"};
    public static Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) throws FileNotFoundException {
        Lambda run=new Lambda();
        File file=new File("resources/in/LambdaStuff");
        Scanner reader= new Scanner(file);
        int temp;
        while(reader.hasNext()) {
            temp=reader.nextInt();
            if (temp == 1) {
                System.out.println(run.checker(run.isOdd(), reader.nextInt()));
            } else if (temp == 2) {
                System.out.println(run.checker(run.isPrime(), reader.nextInt()));
            } else {
                System.out.println(run.checker(run.isPalindrome(), reader.nextInt()));
            }
        }
    }

    /**
     * Sort given array in ascending length
     * @param s array to be sorted
     */
    public void ascendingLength(String[] s) {
        Arrays.sort(s, (o1, o2) -> (o1.length() - o2.length()));
    }

    /**
     * Sort given array in descending length
     * @param s array to be sorted
     */
    public void descendingLength(String[] s) {
        Arrays.sort(s, (o1, o2) -> (o2.length() - o1.length()));
    }

    /**
     * Sort given array alphabetically with the first character
     * @param s array to be sorted
     */
    public void alphabetic(String[] s) {
        Arrays.sort(s, (Comparator.comparingInt(o -> (int) o.charAt(0))));
    }

    /**
     * Sort given array with e or E letter first
     * @param s array to be sorted
     */
    public void eFirst(String[] s) {
        Arrays.sort(s, (o1,o2) -> {
            if (o1.charAt(0) == 'e' || o1.charAt(0) == 'E') {
                return -1;
            }
            return 0;
        });
    }

    /**
     * Same as above with a helper function
     * @param s array to be sorted
     */
    public void eFirstHelper(String[] s) {
        Arrays.sort(s, (Lambda::helper));
    }

    /**
     * helper function
     * @param s1 strings to compare
     * @param s2 Strings to compare
     */
    public static int helper(String s1, String s2) {
        if (s1.charAt(0) == 'e' || s1.charAt(0) == 'E') {
            return -1;
        }
        return 0;
    }

    /**
     * converts Interger array to string and attaches e or o for even and odd
     * @param s Array of integers
     */
    public String evenOddString(Integer[] s) {
        return Arrays.stream(s).map(i -> {
            if (i % 2 == 0) {
                return 'e' + i.toString();
            } else {
                return 'o' + i.toString();
            }
        }).collect(Collectors.joining(","));

    }

    /**
     * Gives list of strings
     * @param s array to be sorted
     * @return List of 3 letter strings starting with a
     */
    public List<String> threeLetterA(List<String> s) {
        return s.stream()
                .filter(i -> i.startsWith("a") && i.length() == 3)
                .collect(Collectors.toList());
    }
    public static boolean checker(PerformOperation p, int num) {
        return p.operation(num);
    }
    public static PerformOperation isOdd() {
        return i -> i % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return i -> BigInteger.valueOf(i).isProbablePrime(100);
    }

    public static PerformOperation isPalindrome() {
        return i ->Integer.toString(i).contentEquals(new StringBuffer(Integer.toString(i)).reverse());
    }

}
