package sushant;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am a String";
    }
    @Override
    public String getMessage(){
        return "I am a message";
    }
}
public class Exception_in_Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a > 9){
            try {
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.toString()); //we  can also call the method
                System.out.println(e.getMessage());
                System.out.println(e); //it returns the toString() method....
                e.printStackTrace();
            }
        }

    }
}
