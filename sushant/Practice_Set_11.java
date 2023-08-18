package sushant;
abstract class Pen{
    abstract void write();
    abstract void fill();
}
class FountenPen extends Pen{
    @Override
    void write() {
        System.out.println("Writing");
    }

    @Override
    void fill() {
        System.out.println("Filling the refil");
    }
    void chnageNib(){
        System.out.println("Changing the nib");
    }
}

class Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("biting...");
    }

}
interface Basic_Animal{
    public void eat();
    public void sleep();
}
class Human extends Monkey implements Basic_Animal{
    public void speak(){
        System.out.println("Speaking");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

abstract class telephone{
    abstract void with();
    abstract void lift();
    abstract void disconnected();
}
class smartphone1 extends telephone{
    @Override
    void with() {
        System.out.println("With...");
    }

    @Override
    void lift() {
        System.out.println("Lifiting...");
    }

    @Override
    void disconnected() {
        System.out.println("Dissconnected...");
    }
}

interface tvRemote{
    public void control();
}
interface smartTvRemote extends tvRemote{
    public void smart_control();
}
class Tv implements smartTvRemote{
    @Override
    public void control() {
        System.out.println("Control");
    }

    @Override
    public void smart_control() {
        System.out.println("Smart Control");
    }
}
public class Practice_Set_11 {
    public static void main(String[] args) {
//    1. Create an abstract class pen with methods write () and refill () as abstract methods
//    2. Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()

//    Q1 + Q2
        FountenPen f = new FountenPen();
        f.chnageNib();
        f.fill();
        f.write();

        System.out.println();

//        3.Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class and implements basic animal                interface with eat ( ) and sleep methods
        Human h = new Human();
        h.eat();
        h.sleep();
        h.speak();
        h.bite();
        h.jump();

        System.out.println();

//        4. Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism

        telephone t = new smartphone1();
        t.disconnected();
        t.lift();
        t.with();

        System.out.println();

//        5. Demonstrate polymorphism using  monkey  class from Q3

        Monkey m = new Human();
        m.bite();
        m.jump();

        System.out.println();

//        6. Create an interface TVremote and use it to inherit another interface smart TVremote
//        7. Create a class TV which implements TVremote interface from Q6

//        Q6 + Q7
        Tv tv = new Tv();
        tv.control();
        tv.smart_control();
    }

}
