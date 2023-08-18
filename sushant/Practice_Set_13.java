package sushant;

import java.util.Scanner;

//public class Practice_Set_13 {
//    public static void main(String[] args) {
////        1.Write a java program to demonstrate syntax, logical 2 runtime errors.
////        int a = 7 //Synatx Error
//        int age = 78;
//        int year_age = 2000-78; //Logical Error
////        System.out.println(6/0);
//
////        2.Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int a = input.nextInt();
//        try{
//            int c = a/0;
//        }
//        catch (ArithmeticException e){
//            System.out.println("HaHa");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("HeHe");
//        }
//
////        Write a program that allows you to given. If max retries exceed 5 print "errors".
//        boolean flag = true;
//        int marks[] = new int[3];
//        marks[0] = 12;
//        marks[1] = 22;
//        marks[2] = 2;
//        int index;
//        int i = 0;
//        while(flag && i < 5){
//            try{
//                System.out.println("Enter the index: ");
//                index = input.nextInt();
//                System.out.println("The value of marks[index] is " + marks[index]);
//                break;
//            }
//            catch (Exception e){
//                System.out.println("Invalid index");
//                i++;
//            }
//        }
//        if (i >= 5){
//            System.out.println("Error");
//        }
//    }
//}
class Custom_Extension extends Exception{
    public String toString(){
        return "You got an Exception";
    }
    public String getMessage(){
        return "You got an exception";
    }
}
public class Practice_Set_13 {
    public static int index(int index) throws Custom_Extension{
        if (index < 0){
            throw new Custom_Extension();
        }
        return index;
    }

    public static void main(String[] args) {
//        Modify program in Q3 to throw a custom Exception if max retries are reached
        Scanner input = new Scanner(System.in);
        int marks[] = new int[3];
        marks[0] = 12;
        marks[1] = 121;
        marks[2] = 122;
        boolean flag = true;
        int index;
        int i = 0;
        while (flag && i < 5){
            try{
                System.out.println("Enter the index");
                int in = input.nextInt();
                int ind = index(in);
                System.out.println("The value at marks[index] is " + marks[ind]);
                break;
            }
            catch (Exception e){
                System.out.println(e);
                i++;
            }
            if (i >= 5){
                System.out.println("You 5 trails are over");
            }
        }
    }
}
