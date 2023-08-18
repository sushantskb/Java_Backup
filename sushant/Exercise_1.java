package sushant;
import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("Program To calculate CBSE board percentage");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks secured in Mathematics: ");
        float m = sc.nextFloat();
        System.out.print("Enter marks secured in Physics: ");
        float p = sc.nextFloat();
        System.out.print("Enter marks secured in Chemistry: ");
        float c = sc.nextFloat();
        System.out.print("Enter marks secured in English: ");
        float e = sc.nextFloat();
        System.out.print("Enter marks secured in Computer Science: ");
        float cs = sc.nextFloat();
        float sum = m + p + c + e + cs;
        float per = (sum)/500f;
        float perc = per*100f;
        System.out.println("The percentage you got is " + perc + "%");

    }
}