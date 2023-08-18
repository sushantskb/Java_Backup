package sushant;
class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i < 10){
            System.out.println(getName());
            i++;
        }
    }
}

public class Constructor_In_Thread {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Sushant");
        Mythr t2 = new Mythr("Suraj");
        t1.start();
        t2.start();
//        System.out.println("The id of the thread is " + t1.getId());
//        System.out.println("The name of the thread is " + t1.getName());
//        System.out.println("The id of the thread is " + t2.getId());
//        System.out.println("The name of the thread is " + t2.getName());


    }
}
