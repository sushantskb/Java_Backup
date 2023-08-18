package sushant;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date is : " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy--E H : m a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df);
        System.out.println(myDate);

        String myDate2 = dt.format(df2);
        System.out.println(myDate2);


        //ISO_WEEK_DATE
        DateTimeFormatter df3 = DateTimeFormatter.ISO_WEEK_DATE;
        String myDate3 = dt.format(df3);
        System.out.println(myDate3);

        //ISO_ORDINAL_DATE
        DateTimeFormatter df4 = DateTimeFormatter.ISO_ORDINAL_DATE;
        String myDate4 = dt.format(df4);
        System.out.println(myDate4);
    }
}
