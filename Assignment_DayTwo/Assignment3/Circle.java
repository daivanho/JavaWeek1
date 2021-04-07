package Assignment3;

/**
 * Circle class that implements shape
 * @author Dai
 */
public class Circle implements Shape {

    public int diameter;
    public int area;

    /**
     * calculates area
     */
    @Override
    public void calculateArea() {
        area= (int) (diameter * diameter * Math.PI);
    }

    /**
     * display the area
     */
    @Override
    public void display() {
        System.out.println(area);
    }
}
