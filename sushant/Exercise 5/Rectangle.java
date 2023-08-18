

package Shape;
public class Rectangle extends Shape {

    public Rectangle(double lenght, double breadth) {
        super(lenght, breadth);
    }
    public double area(){
        return lenght*breadth;
    }
}
