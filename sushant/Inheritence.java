package sushant;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Dervied extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritence {
    public static void main(String[] args) {
        System.out.println("Here is the inheritance program");
        //Base class program
        Base b = new Base();
        b.setX(45);
        System.out.println("The value of x is " + b.getX());

        //Derived class program
        Dervied d = new Dervied();
        d.setY(65);
        d.setX(33); //Here we can set the value of x as the all the operation that was performed in the "Base" class can now be performed in the Derived class as we have inherited the functions of Base class in the Derived class
        System.out.println("The value of x in derived class is " + d.getX());
        System.out.println("The value of y is  " + d.getY());
    }
}
