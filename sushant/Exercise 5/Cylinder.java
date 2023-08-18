package Shape;
public class Cylinder extends Shape{
    public Cylinder(double radius, double height){
        super(radius, height);
    }
    public double area(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
}
