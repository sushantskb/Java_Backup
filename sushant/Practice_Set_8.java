package sushant;
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public void setName(String n){
        name = n;
    }
    public String name(){
        return name;
    }
}

class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vib(){
        System.out.println("Vibrating....");
    }
    public void callFriend(){
        System.out.println("Calling Suraj....");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hiting the enemey");
    }
    public void fire(){
        System.out.println("Firing the enemy");
    }
    public void run(){
        System.out.println("Running the fire");
    }
}

public class Practice_Set_8 {
    public static void main(String[] args) {
//        1.Create a class Employee with the following properties and methods:
//            Salary (property) (int)
//            getSalary (method returning int)
//            name (property) (String)
//            getName (method returning String)
//            setName (method changing name)
        Employee1 emp = new Employee1();
        emp.salary = 546644;
        emp.name = "Sushant";
        System.out.println(emp.salary + "\n" + emp.name);

        System.out.println();

//        2.Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
        cellphone Samsung = new cellphone();
        Samsung.ring();
        Samsung.vib();
        Samsung.callFriend();

        System.out.println();

//        3.Create a class Square with a method to initialize its side, calculating area, perimeter etc.
        Square sq = new Square();
        sq.side = 45;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        System.out.println();

//        4.Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
        Tommy f = new Tommy();
        f.fire();
        f.hit();
        f.run();



    }
}
