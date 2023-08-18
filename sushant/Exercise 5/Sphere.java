

package Shape;
public class Sphere extends Shape {
    public Sphere(double radius){
        super(radius);
    }
    public double area(){
        return 4*Math.PI*radius*radius;
    }
}
