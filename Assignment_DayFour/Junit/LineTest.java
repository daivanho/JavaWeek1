package Junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {

    Line line = new Line(0, 10, 5, 0);

    /**
     * Testing slope
     */
    @Test
    public void lineSlopeTest() {
        assertEquals(-2, line.getSlope(), 0.0001);
        assertNotEquals(5, line.getSlope());
    }

    /**
     * Testing distance
     */
    @Test
    public void lineDistanceTest() {
        assertEquals(11.18034, line.getDistance(), 0.0001);
        assertNotEquals(1, line.getDistance());
    }

    /**
     * Testing parallel
     */
    @Test
    public void parallelToTest() {
        Line line2 = new Line(-1, 9, 4, -1);
        Line line3 = new Line(1, -9, 4, -1);
        assertTrue(line.parallelTo(line2));
    }
}
