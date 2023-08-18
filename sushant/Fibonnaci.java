package sushant;
import java.util.Scanner;
public class Fibonnaci {
    static void fib_int(int count)
    {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2 );
        for (int i = 2; i <count ; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
    int fib(int count){
        if (count<=1){
            return count;
        }
        else {
            return fib(count-1) + fib(count-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Printing Fibonacci Using Iterative Approach");
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter your range: ");
        n = input.nextInt();
        fib_int(n);

        System.out.println();

        System.out.println("Fibonacci Series using Recursion");
        int n4;
        Fibonnaci obj = new Fibonnaci();
        System.out.print("Enter your range: ");
        n4 = input.nextInt();
        for (int i = 0; i < n4; i++) {
            System.out.print(obj.fib(i) + " ");
        }



    }
}
