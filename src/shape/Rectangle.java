package shape;

/**
 *
 * @author
 */
public class Rectangle {

    private int length; 
    private int breadth; 
    
    public Rectangle(int x, int b) {
        length = x;
        breadth = b;
    }
    
    public int getArea(int x, int y) { 
        return x*y; // write code to calculate area here
    } 
    public int getPerimeter(int length, int width){
    int perimeter = 2 * (length + width);
    return perimeter;
    }
    
    // write code to calculate perimeter here
    // getPerimeter()
    
}