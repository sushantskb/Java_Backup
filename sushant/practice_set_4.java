package sushant;
import java.util.Scanner;
public class practice_set_4 {
    public static void main(String[] args) {
        System.out.println("Practice Set 4");
        Scanner input = new Scanner(System.in);
        //Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
        System.out.print("Enter the marks you have score in maths: ");
        float a = input.nextFloat();
        System.out.print("Enter the marks you have score in English");
        float b = input.nextFloat();
        System.out.print("Enter the marks you have scored in Computer Science: ");
        float c = input.nextFloat();
        float avg = (a + b + c) / 3.0f;
        System.out.println("Your average marks in the total subjects " + avg);
        if (avg > 75) {
            System.out.println("You are eligible for admission in Dav Public school");
        } else if (avg < 55 && a < 33 && b < 33 && c < 33) {
            System.out.println("Sorry you have failed");
        } else {
            System.out.println("You have passed but not eligible for admission");
        }
//         Question 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if (income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);

//        Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("You have entered wrong choice");

//                Write a program to find out the type of website from the URL
//                    .com – commercial website
//                    .org – organization website
//                    .in – Indian website
                System.out.print("Enter the url here: ");
                String st = input.next();
                if (st.endsWith(".org")) {
                    System.out.println("This is a organisational website");
                } else if (st.endsWith(".com")) {
                    System.out.println("This is a commercial website");
                } else if (st.endsWith(".in")) {
                    System.out.println("This is a Indian Website");
                } else {
                    System.out.println("The website is unknown");
                }

        }
    }
}






