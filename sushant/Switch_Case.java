package sushant;
import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {
        System.out.println("This is a code for switch case");
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter the age : ");
        age = input.nextInt();
        switch (age) {
            case 18 -> System.out.println("Your are eligible for voting");
            case 29 -> System.out.println("You are much more responsible for choosing the right candidate");
            default -> System.out.println("You are under age");
        }
    }
}
