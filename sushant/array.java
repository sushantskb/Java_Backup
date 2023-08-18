package sushant;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        /* Program to take an array of 10 elements and displaying the square of all even numbers and displaying the cube of all odd numbers... */
//        --> 1st way of declaring array
//        int [] marks = {1,2,3,4,7,6,8};
//        for (int i = 0; i<marks.length; i++)
//        {
//            if (marks[i]%2 == 0)
//            {
//                System.out.print(marks[i]*marks[i] + " ");
//            }
//            else {
//                System.out.print(marks[i] * marks[i] * marks[i] + " ");
//            }
//        }
//        --> 2nd way of declaring
        Scanner input = new Scanner(System.in);
        int n;
        int marks[];
        marks = new int[100];
        System.out.println("Enter no of elements: ");
        int element = input.nextInt();
        System.out.println("Enter the array elements");
        for (int i = 0; i<=element; i++){
            marks[i] = input.nextInt();
        }
        System.out.print("The array is: ");
//        for (int i =0; i<=element; i++){
//            System.out.print( marks[i]  + " ");
//        }
//        System.out.println();
//        for (int i = 0; i<=element; i++)
//        {
//            if (marks[i] % 2 == 0){
//                System.out.print((int)Math.pow(marks[i], 2) + " ");
//            }
//            else {
//
//                System.out.print((int)Math.pow(marks[i], 3) + " ");
//
//            }
//        }


    }
}
