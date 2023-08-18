package sushant;
//import java.util.Scanner;
//public class Practice_Set_7 {
//    static void mul(int n){
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.printf("%d x %d = %d\n", n, i, n*i);
//        }
//    }
//    static void pattern1(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static  int sumRec(int n){
//        if(n == 1){
//            return 1;
//        }
//        else{
//            return n + sumRec(n-1);
//        }
//    }
//    static  void rev_patt1(int n){
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static  int fib(int n)
//    {
//        if(n<=1)
//        {
//            return n;
//        }
//        else{
//            return fib(n-1) + fib(n-2);
//        }
//    }
//    int avg_seat(int ...a)
//    {
//        int result = 0;
//        int avg = 0;
//        for(int element : a){
//            result = result + element;
//
//        }
//        return avg = (result / a.length);
//    }
//    static void pattern_Rec(int n)
//    {
//        if (n > 0){
//            pattern_Rec(n-1);
//            for (int i = 0; i < n; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern2_Rec(int n)
//    {
//        if (n>0){
//            for (int i = n; i > 0; i--) {
//                System.out.print("*");
//            }
//            System.out.println();
//            pattern2_Rec(n-1);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        //Write a Java method to print the multiplication table of a number n.
//       int n;
//        System.out.print("Enter the number to get desired table: ");
//        n = input.nextInt();
//        mul(n);
//
//        //Write a program using functions to print the following pattern:
//        // *
//        // **
//        // ***
//        //****
//        int n;
//        System.out.print("Enter your range");
//        n = input.nextInt();
//        pattern1(n);
//
//        //Write a recursive function to calculate the sum of first n natural numbers.
//        System.out.print("Enter your last range:");
//        int n = input.nextInt();
//        System.out.println("The sum of n number values is " + sumRec(n));
//
//        //Write a function to print the following pattern:
//        //****
//        //***
//        //**
//        //*
//        System.out.print("Enter the last range: ");
//        int n = input.nextInt();
//        rev_patt1(n);
//
//        //Write a function to print the nth term of the Fibonacci series using recursion.
//        System.out.print("Enter the value of n: ");
//        int n = input.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.print(fib(i) + " ");
//        }
//
//        //Write a function to find the average of a set of numbers passed as arguments.
//        /*Practice_Set_7 ob = new Practice_Set_7();
//        System.out.println(ob.avg_seat(35, 66));*/
//
//        //Repeat problem 2 using Recursion.
//        pattern_Rec(5);
//
//        //Repeat problem 2 using Recursion.
//        pattern2_Rec(5);
//
//
//    }
//}
