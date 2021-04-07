package Assignment3;
/**
 * Rectangle class that implements shape
 * @author Dai
 */
public class Rectangle implements Shape {

    public int length;
    public int height;
    public int area;
    /**
     * calculates area
     */
    @Override
    public void calculateArea() {
        area=length*height;
    }
    /**
     * display the area
     */
    @Override
    public void display() {
        System.out.println(area);
    }
}
