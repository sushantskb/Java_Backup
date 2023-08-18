package sushant;
import java.util.Random;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter\n0 for Rock\n1 for Paper\n2 for Scissor");
        System.out.println("Enter your choice");
        int choice = input.nextInt();

        Random rand = new Random();
        int comp_choice = rand.nextInt(3);

        String temp;
        if (choice == 0){
            temp = "Rock";
        }
        else if (choice == 1)
        {
            temp = "Paper";
        }
        else
        {
            temp = "Scissor";
        }
        //Computer....
        String temp1;
        if (comp_choice == 0){
            temp1 = "Rock";
        }
        else if (comp_choice == 1)
        {
            temp1 = "Paper";
        }
        else
        {
            temp1 = "Scissor";
        }

        System.out.println("You have choosen " + temp);

        System.out.println("System cointains " + temp1);

        if (choice == comp_choice){
            System.out.println("Its a draw");
        }
        else if (choice == 0 && comp_choice == 2 || choice == 1 && comp_choice == 0 || choice == 2 && comp_choice == 1)
        {
            System.out.println("You Win");
        }
        else {
            System.out.println("You Loose");
        }


    }

}
