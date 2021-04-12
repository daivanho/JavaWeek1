package Assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Functionals {
    public static void main(String[] args) {
        Functionals func = new Functionals();
        List<Integer> test = Arrays.asList(11, 12, 13, 14, 14, 15);
        System.out.println(func.rightDigit(test));
        System.out.println(func.groupSumClump(0, new int[]{2, 4, 8}, 10));
        System.out.println(func.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14));
        System.out.println(func.groupSumClump(0, new int[]{2, 4, 4, 8}, 14));
    }

    public List<Integer> rightDigit(List<Integer> s) {
        return s.stream()
                .map(i -> i % 10)
                .collect(Collectors.toList());
    }

    public List<Integer> doubling(List<Integer> s) {
        return s.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
    }

    public List<String> noX(List<String> s) {
        return s.stream()
                .map(i -> i.replaceAll("x", ""))
                .collect(Collectors.toList());
    }

    public boolean groupSumClump(int start, int[] group, int target) {
        if (start == group.length) {
            return target == 0;
        }
        int i = start + 1;
        for (; i < group.length && group[start] == group[i]; i++) ;//checking for how long same int is
        if (groupSumClump(i, group, target - ((i - start) * group[start])))
            return true;
        return groupSumClump(i, group, target);
    }
}

