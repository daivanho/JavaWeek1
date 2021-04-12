package Assignment1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

    public static String[] names = {"David", "John", "Tim", "Scott", "Rachel", "Madi", "Erin", "ann"};
    public static Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        Lambda test = new Lambda();

        List<String> temp = test.threeLetterA(Arrays.asList(names));
        for (String name : temp) {
            System.out.print(name + ' ');
        }
        System.out.println();
        System.out.println(test.evenOddString(numbers));
        Integer num = 1;

        System.out.println(test.checker(test.isPalindrome(),4114));


    }

    public static boolean checker(PerformOperation p, int num) {
        return p.operation(num);
    }

    public void ascendingLength(String[] s) {
        Arrays.sort(s, (o1, o2) -> (o1.length() - o2.length()));
    }

    public void descendingLength(String[] s) {
        Arrays.sort(s, (o1, o2) -> (o2.length() - o1.length()));
    }

    public void alphabetic(String[] s) {
        Arrays.sort(s, (o1, o2) -> (o1.charAt(0) - o2.charAt(0)));
    }

    public void eFirst(String[] s) {
        Arrays.sort(s, (o1,o2) -> {
            if (o1.charAt(0) == 'e' || o1.charAt(0) == 'E') {
                return -1;
            }
            return 0;
        });
    }

    public void eFirstHelper(String[] s) {
        Arrays.sort(s, (Lambda::helper));
    }

    public static int helper(String s1, String s2) {
        if (s1.charAt(0) == 'e' || s1.charAt(0) == 'E') {
            return -1;
        }
        return 0;
    }

    public String evenOddString(Integer[] s) {
        return Arrays.stream(s).map(i -> {
            if (i % 2 == 0) {
                return 'e' + i.toString();
            } else {
                return 'o' + i.toString();
            }
        }).collect(Collectors.joining(","));

    }

    public List<String> threeLetterA(List<String> s) {
        return s.stream()
                .filter(i -> i.startsWith("a") && i.length() == 3)
                .collect(Collectors.toList());
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
