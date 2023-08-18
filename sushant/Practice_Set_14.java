package sushant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Practice_Set_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Question 1: Create an ArrayList and store the names of ten students inside it. Print it using a for each loop.
//        ArrayList name = new ArrayList();
//        for (int i = 0; i < 11; i++) {
//            System.out.print("Enter your name: ");
//            name.add(sc.nextLine());
//        }
//        System.out.println("Printing the names: ");
//        for (Object na : name){
//            System.out.println(na);
//        }

        //    Question 2: Use the Date class in Java to print the time in the following format : 21:47:02.
//        Date d = new Date();
//        System.out.println(d.getHours() + " : " + d.getMinutes() + " : " + d.getSeconds());

//        Question 3: Repeat question number 2 using the Calendar class.
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));

//        Question 4: Repeat question number 2 using java.time API.
//        LocalDateTime dt = LocalDateTime.now();
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
//        String myDate = dt.format(df);
//        System.out.println(myDate);

//         Question 5: Create a Set in java. Try to store the duplicate values elements inside this set and  verify that only one instance is                     stored.

        HashSet<Integer> h = new HashSet<>();
        h.add(12);
        h.add(45);
        h.add(60);
        h.add(45);
        h.add(15);
        h.add(60);
        System.out.println(h);


    }
}
