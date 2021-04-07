package Assignment3;
/**
 * Triangle class that implements shape
 * @author Dai
 */
public class Triangle implements Shape{

    public int base;
    public int height;
    public int area;
    /**
     * calculates area
     */
    @Override
    public void calculateArea() {
        area=base*height/2;
    }
    /**
     * display the area
     */
    @Override
    public void display() {
        System.out.println(area);

    }
}
