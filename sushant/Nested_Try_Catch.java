package sushant;

import java.util.Scanner;

public class Nested_Try_Catch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 8;
        marks[2] = 4;
        boolean flag = true;
        while (flag){
            System.out.println("Enter the value of a and b");
            int a = input.nextInt();
            int b = input.nextInt();
            // ^^ above program is the part of exiting from the loop from the first try-catch ^^
//            System.out.println("Enter the index value: ");
//            int ind;
//            ind = input.nextInt();
            try{
//                System.out.println("Welcome to the program");
                int c = a/b; // This is written to loop out of the program from the first level of try-catch
                try{
                    /* This one is done here, so that when the first try got executed then only it will come to this try block */
                    System.out.println("Enter the index value: ");
                    int ind;
                    ind = input.nextInt();
                    /* otherwise the above code willl not be executed */
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (Exception e){
                    System.out.println("Sorry you got an exception in level 2");
                    System.out.println(e);
                }
            }
            catch (Exception e){
                System.out.println("Sorry you got an exception in level 1");
                System.out.println(e);
                flag = true;
            }
        }
        System.out.println("Thanks for using the program");

    }


}
