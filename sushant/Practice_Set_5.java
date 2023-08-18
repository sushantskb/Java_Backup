package sushant;
public class Practice_Set_5 {
    public static void main(String[] args) {
        //Star pattern program....
        System.out.println("Printing the star pattern");
        int n = 4;
        for (int i = n; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Write a program to sum first n even numbers using a while loop.
        System.out.println("Printing the first n even numbers");
        int e = 4;
        int i = 0;
        int sum = 0;
        while (i<e){
            sum = sum + (2*i);
            i++;
        }
        System.out.println("The sum of n even numbers is " + sum);

        System.out.println();

        //Write a program to print the multiplication table of a given number n.
        System.out.println("Printing the multiplication table");
        int t = 5;
        for (int k = 1; k <= 10  ; k++) {
            System.out.printf("%d x %d = %d\n", n, k, n*k);
        }

        System.out.println();

        //Write a program to print a multiplication table of 10 in reverse order.
        System.out.println("Multiplication Table in Reverse Order");
        int t1 = 5;
        for (int l = 10; l >= 1 ; l--) {
            System.out.printf("%d x %d = %d\n", t1, l, t1*l);
        }
        System.out.println();

        System.out.println();

        //Write a program to find the factorial of a given number using for loops.
        System.out.println("Printing the factorial");
        int f = 5;
        int m =1;
        int factorial = 1;
        while(m<=f){
            factorial = factorial*m;
            m++;
        }
        System.out.println("The factorial of " + f + " is " + factorial);

        System.out.println();


        // Repeat problem 5 using a for loop.
        System.out.println("Printing the factorial using for loop");
        int f1 = 5;
        int m1;
        int factorial1 = 1;
        for (m1 = 1; m1<=f1; m1++){
            factorial1 = factorial1*m1;
        }
        System.out.println("The factorial of " + f1 + " is " + factorial1);

        System.out.println();


        // Repeat problem 1 using for/while loop.
        System.out.println("Printing the star pattern using for/while loop");
        int s1 = 5;
        int p = s1;
        while(p>0){
            for (int o = 0; o<p; o++){
                System.out.print("*");
            }
            System.out.println();
            p--;
        }

        //Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        int t2 = 8;
        int sum1 = 0;
        for(int q = 1; q <= 10; q++)
        {
            sum1 = sum1  + (t1 * q);
        }
        System.out.println("The sum of " + t2 + " element is " + sum1);

        System.out.println();

        // Repeat problem 2 using for loop.
        System.out.println("Printing the first n even numbers using for loop");
        int even = 4;
        int sum2 = 0;
        for (int r = 0; r < even; r++)
        {
            sum2 = sum2 + (2*r);
        }
        System.out.println("The sum of first n even number is " + sum2);










    }
}
