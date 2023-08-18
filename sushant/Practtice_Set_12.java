package sushant;
class ques1 extends Thread{
    public void run(){
//        try {
//            Thread.sleep(200);
//        }
//        catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        while(true){
            System.out.println("Welcome");
        }
    }
}
class ques2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
public class Practtice_Set_12 {
    public static void main(String[] args) {
//       1. Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
//        ques1 q1 = new ques1();
//        ques2 q2 = new ques2();
//        q1.start();
//        q2.start();

//        2.Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
//        ques1 q1 = new ques1();
//        ques2 q2 = new ques2();
//        q1.start();
//        q2.start();

//        3.Demonstrate gerPriority() and setPriority() methods in Java threads.
        ques1 q1 = new ques1();
        ques2 q2 = new ques2();
        q1.start();
        q2.start();
        q1.setPriority(5);
        q2.setPriority(1);
        System.out.println(q1.getPriority());
        System.out.println(q2.getPriority());
    }
}
