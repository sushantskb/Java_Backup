package sushant;

import java.util.Calendar;

public class Calender_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());

        System.out.println("After Editing");

        System.out.println("Current year is : "+ c.get(Calendar.YEAR));
        System.out.println("Current month is : "+ c.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]
        System.out.println("Current day is : "+ c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is : "+ c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is : "+ c.get(Calendar.MINUTE));
        System.out.println("Current second is : "+ c.get(Calendar.SECOND));

        System.out.println("After Editing");

        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years the date will be : " + c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years the date will be : " + c.getTime());

        System.out.println("After Editing");

        System.out.println(c.getWeeksInWeekYear());

        System.out.println("After Editing");

        System.out.println("The maximum no. of the weeks in a Year : " + c.getMaximum(Calendar.WEEK_OF_YEAR));



    }
}
