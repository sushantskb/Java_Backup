package sushant;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian_Class {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        System.out.println("2020 was a leap year ? " + g.isLeapYear(2020));
        g.roll(Calendar.MONTH, true);
        g.roll(Calendar.YEAR, true);
        g.roll(Calendar.DATE, false);
        System.out.println("Date after rolling is : " + g.getTime());

        System.out.println("The hashcode of the Gregorian Calendar is : " + g.hashCode());

    }
}
