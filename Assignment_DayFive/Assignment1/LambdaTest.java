package Assignment1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LambdaTest {

    Lambda test=new Lambda();
    public static String[] names = {"david", "erin", "ann"};
    public static Integer[] numbers = {2, 10,23};

    @Test
    public void ascendingLengthTest(){
        test.ascendingLength(names);
        assertArrayEquals(names,new String[]{"ann","erin","david"});
    }
    @Test
    public void descendingLengthTest(){
        test.descendingLength(names);
        assertArrayEquals(names,new String[]{"david","erin","ann"});
    }

    @Test
    public void alphabeticTest(){
        test.alphabetic(names);
        assertArrayEquals(new String[]{"ann","david","erin"},names);
    }
    @Test
    public void eFirstTest(){
        test.eFirst(names);
        assertArrayEquals(names,new String[]{"erin","david","ann"});
    }
    @Test
    public void eFirstHelperTest(){
        test.eFirstHelper(names);
        assertArrayEquals(names,new String[]{"erin","ann","david"});
    }

    @Test
    public void evenOddStringTest(){
        assertEquals(test.evenOddString(numbers),"e2,e10,o23");
    }

    @Test
    public void threeLetterATest(){
        assertArrayEquals(test.threeLetterA(Arrays.asList(names)).toArray(),new String[]{"ann"});
    }


}
