package sushant;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i =34;
        while(i > 0){
            System.out.println("The name is " + this.getName());
            i--;
        }
    }
}
public class Thread_priority {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("SUSHANT");
        MyThr1 t2 = new MyThr1("Suraj");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
