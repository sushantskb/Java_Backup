package sushant;
public class recursion {
    static void fun2(int n){
        if (n>0){
            fun2(n-1);
            System.out.println(n);
        }
    }
    static void fun1(int x){
        if (x>0){
            System.out.println(x);
            fun1(x-1);

        }
    }
    static int factorial(int n){
        if(n == 0 || n ==1)
        {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int fact_it(int n){
        if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            int product = 1;
            for (int i = 1; i <=n ; i++) {
                product = product*i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        System.out.println("Recursion In Java");
        //Printing numbers from 1 to n
        int n = 3;
        fun2(n);
        System.out.println();
        //Printing numbers printing n to 1
        int x = 3;
        fun1(x);
        System.out.println();
        //Printing the factorial using recursion....
        int a = 5;
        System.out.println(factorial(a));
        System.out.println();
        //Printing the factorial iterative approach
        int f = 4;
        System.out.println(fact_it(f));

    }
}
