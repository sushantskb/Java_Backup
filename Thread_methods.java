class MyNewThr1 extends Thread{
    public void run() {
        int i = 0;
//        while (true){
//            System.out.println("Hello World");
//            try {
//                Thread.sleep(4);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//        this is the while loop for the join() method
        while (i<5989990) {
            System.out.println("Hello World");
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    public void run(){
        while (true){
            System.out.println("This is the last");
        }
    }
}
public class Thread_methods {
    public static void main(String[] args)  {
        MyNewThr1 m = new MyNewThr1();
        MyNewThr2 n = new MyNewThr2();

        m.start();
        try {
            m.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        n.start();

    }
}
