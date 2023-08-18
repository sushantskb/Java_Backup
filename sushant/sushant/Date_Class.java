package sushant.sushant;
import java.util.*;
public class Date_Class {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        System.out.println("The value of current time in ms : " + System.currentTimeMillis());
        Date d1 = new Date(1670434184452l);
        System.out.println(d1);

        System.out.println(d1.compareTo(d));

        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getYear());
    }
}
