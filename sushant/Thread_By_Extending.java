package sushant;
class Mythread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i < 10){
            System.out.println("My Thread 1 is running");
            System.out.println("This is first priority");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 10){
            System.out.println("My Thread 2 is running");
            System.out.println("This should be the second priority");
            i++;
        }
    }
}
public class Thread_By_Extending {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
