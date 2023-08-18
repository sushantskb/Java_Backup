package sushant;
class Base1 {
    Base1()
    {
        System.out.println("This is a default constructor");
    }
    Base1(int x)
    {
        System.out.println("The value of x is: " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a default class constructor from derived class");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("The value of y is: " + y);
    }
}
class Child_class extends Derived1{
    Child_class(){
        System.out.println("This is a default class constructor of Child Class");
    }
    Child_class(int x, int y, int z){
        super(x, y);
        System.out.println("The value of z is: " + z);
    }
}
public class Constructors_In_Inheritence {
    public static void main(String[] args) {
//        Base1 b = new Base1(12);
//        Derived1 d = new Derived1();
//        Child_class cd1 = new Child_class();
        Child_class cd = new Child_class(12, 13 , 14);
    }
}
