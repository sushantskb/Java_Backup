

package Shape;
public class Circle extends Shape {

    public Circle(double radius) {
        super(radius);
    }
    
    public double area(){
        return Math.PI*radius*radius;
    }
}
