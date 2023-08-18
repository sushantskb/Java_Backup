package sushant;
class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Cylinder_Const{
    public int radius;
    public int height;
    Cylinder_Const(){
        System.out.println("No input");
    }
    Cylinder_Const(int r, int h){
        radius = r;
        height = h;
    }
}

public class Practice_Set_9 {
    public static void main(String[] args) {
        //1.create a class cylinder and use getter and setters to set its radius and height
        /*Cylinder mycylinder = new Cylinder();
        mycylinder.setHeight(12);
        int h = mycylinder.getHeight();
        mycylinder.setRadius(45);
        int r = mycylinder.getRadius();
        System.out.println("The height and radius of the cylinder is " + h + " and " + r);*/

        //2.use ➊ to calculate surface and volume of the cylinder
        /*Cylinder mycylinder = new Cylinder();
        mycylinder.setRadius(4);
        mycylinder.setHeight(10);
        int r = mycylinder.getRadius();
        int h = mycylinder.getHeight();
        double sa = (2*3.14*r*r*h) + (2*3.14*r*r);
        double vol = 3.14*r*r*h;
        System.out.println("The surface area of the cylinder is " + sa + " and the volume of the cylinder is " + vol);*/

        //3.Use a constructor and repeat ➊
        /*Cylinder_Const myclinder = new Cylinder_Const();
        myclinder.radius = 4;
        myclinder.height = 10;
        System.out.println("The height and radius of the cylinder is " + myclinder.radius + " and " + myclinder.height);*/
    }
}
