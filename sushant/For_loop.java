package sushant;
public class For_loop {
    public static void main(String[] args) {
        System.out.println("For loop in Java");
        //Printing number from 0 to 10
//        int n = 10;
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//        }

        //Printing all numbers from 1 to n number
//        int n = 10;
//        for (int i = 0; i < n; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//
//        }
//        System.out.println();
//        //Printing all odd number using 2n+1 concept
//        int m = 10;
//        for (int i = 0; i < m; i++) {
//            System.out.println(2*i + 1);
//        }
        for (int i = 0; i < 10; i++) {
            while (i%2 != 0){
                System.out.println(i);
                break;
            }

        }
    }
}
