package sushant;
class Circle{
    public int radius;
    Circle(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        this.height = h;
    }
    public double volume(){
        return  Math.PI*this.radius*this.radius*this.height;
    }
}
public class Practice_Set_10 {
    public static void main(String[] args) {
//        Create a class circle and use inheritance to create another class cylinder from it
//         Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible
//        Create a method for area and volume in 1
//        create methods for area & volume in 2 also create getters and setters
//        What is the order of constructor execution for the following inheritance hierarchy
//        Base
//
//        Derived 1
//
//        Derived 2
//
//        Derived obj = new Derived 2( );
//        Which constructor(s) will be executed & in what order?



        Circle a = new Circle(8);
        System.out.println("The area of the circle is : " + a.area());

        Cylinder1 cy = new Cylinder1(8, 12);
        System.out.println("The volume of the cylinder is: " + cy.volume());

    }
}
