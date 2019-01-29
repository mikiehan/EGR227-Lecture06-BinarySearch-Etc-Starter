package binarysearch;

/**
 * Created by mhan on 2/2/2017.
 */
public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius){
        this.center = new Point(center.getX(), center.getY()); //create a separate instance
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "(c:" + center + ", r:" + radius + ")";
    }
}
