package sushant;
class MainEmployee{
    int id;
    String name;
    MainEmployee(){
        id = 0;
        name = "Default";
    }
    MainEmployee(int n, String i){
        id = n;
        name = i;
    }
}
public class Constructors {
    public static void main(String[] args) {
//        1 way of using the constructor
        MainEmployee temp = new MainEmployee();
//        temp.id = 123;
//        temp.name = "Sushant";
        System.out.println(temp.id);
        System.out.println(temp.name);

//        2nd way of using the constructor
//        MainEmployee temp = new MainEmployee();
//        System.out.println(temp.id + " " + temp.name);
//        MainEmployee temp2 = new MainEmployee(427, "Sushant");
//        System.out.println(temp2.id + " " + temp2.name);

    }
}
