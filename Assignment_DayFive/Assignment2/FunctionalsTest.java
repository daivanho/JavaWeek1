package Assignment2;

import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.*;
import static org.junit.Assert.*;
public class FunctionalsTest {
    public Functionals func=new Functionals();
    @Test
    public void doublingTest(){
        assertEquals(Arrays.asList(4,1), func.doubling(Arrays.asList(2,1)));
    }

    @Test
    public void noXTest(){
        assertEquals(Arrays.asList("Hello","World"),func.noX(Arrays.asList("xHexllxo","xWxoxrxlxdx")));
    }
}
