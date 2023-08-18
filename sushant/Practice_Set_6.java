package sushant;
//import java.util.Scanner;
//public class Practice_Set_6 {
//    public static void main(String[] args) {
//        System.out.println("Array practice set");
//        Scanner input = new Scanner(System.in);
//        //Create an array of 5 floats and calculate their sum.
//        float marks[] = {1.1f, 2.5f,3.3f};
//        float sum = 0;
//
//        for (int i = 0; i< marks.length; i++){
//           sum = sum + marks[i];
//        }
//        System.out.println(sum);
//
//        //Write a program to find out whether a given integer is present in an array or not.
//        float marks[] = {1.1f, 2.5f,3.3f};
//        float element = 1.0f;
//        float found = 0;
//        for (int i = 0; i< marks.length; i++){
//            if (element == marks[i])
//            {
//                found = 1;
//            }
//        }
//        if (found == 1){
//            System.out.println("Element found");
//        }
//        else {
//            System.out.println("Element not found");
//        }
//
//        //Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
//        float marks[] = {98.5f, 99.0f, 100f, 71.5f, 61.5f};
//        float sum = 0, avg = 0;
//        for(float element : marks){
//            sum = sum + element;
//        }
//        avg = sum / marks.length;
//        System.out.println("The average marks of the student in physics is: " + avg);
//
//        //Create a Java program to add two matrices of size 2x3
//        int mat1 [] [] = new int [2] [3];
//        int mat2 [] [] = new int [2] [3];
//        int res [] [] = new int[2][3];
//        System.out.println("Enter the elements of the matrix 1");
//        for (int i = 0; i < 2; i++){
//            for (int j = 0; j<3; j++){
//                mat1[i][j] = input.nextInt();
//            }
//        }
//        System.out.println("Enter the elements of the matrix 2");
//        for (int i = 0; i < 2; i++){
//            for (int j = 0; j<3; j++){
//                mat2[i][j] = input.nextInt();
//            }
//        }
//        for (int i = 0; i < 2 ; i++) {
//            for (int j = 0; j < 3 ; j++) {
//                res[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        System.out.println("The result is: ");
//        for (int i = 0; i < 2 ; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(res[i][j] + " ");
//                res[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println();
//        }
//
//        //Write a Java program to reverse an array
//        int arr [] = new int[10];
//        for (int i = 0; i<3; i++)
//        {
//            arr[i] = input.nextInt();
//        }
//        System.out.println("The array in original order is: ");
//        for (int i = 0; i < 3 ; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        System.out.println("The array in reverse order: ");
//        for (int i = 3-1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        //Write a Java program to find the maximum element in an array.
//        int arr [] = new int[10];
//        int max = Integer.MAX_VALUE;  //Or we can got to the traditional method of storing the arr[0] in max... amd for
//        System.out.print("Enter the number of elements of the array: ");
//        int n = input.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = input.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > max)
//            {
//                max = arr[i];
//            }
//        }
//        System.out.println("The maximum element of the array is " + max);
//
//        //Write a Java program to find whether an array is sorted or not.
//        boolean isSorted = true;
//        System.out.println("Enter the number of elements in the array: ");
//        int n = input.nextInt();
//        int arr [] = new int[10];
//        System.out.println("Enter th elements of the array: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = input.nextInt();
//        }
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i+1])
//            {
//                isSorted = false;
//                break;
//            }
//        }
//        if (isSorted){
//            System.out.println("The array is sorted");
//        }
//        else {
//            System.out.println("The array is not sorted");
//        }
//
//        int a[] = {1,3,2,5};
//        int min = a[0];
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < min)
//            {
//                min = a[i];
//            }
//        }
//        System.out.println("The minimum value in the array is " + min);
//
//    }
//
//
//}
