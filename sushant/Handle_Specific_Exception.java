package sushant;

import java.util.Scanner;

public class Handle_Specific_Exception {
    public static <Execption> void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 56;
        arr[1] = 96;
        arr[2] = 55;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = input.nextInt();
        System.out.println("Enter the number you want to divide with array: ");
        int num = input.nextInt();

        try{
            System.out.println("The array a the enterd index " + ind + " is " + arr[ind]);
            System.out.println("The resultant number after division is " + arr[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("Error occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error occured");
            System.out.println(e);;
        }
        catch (Exception e){
            System.out.println("The following error is " + e);
        }
    }
}
