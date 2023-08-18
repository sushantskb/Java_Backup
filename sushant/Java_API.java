package sushant;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Java_API {
    public static void main(String[] args) {
        //Clock Class
        Clock c1 = Clock.systemDefaultZone();
        System.out.println(c1.getZone());

        Clock c2 = Clock.systemUTC();
        System.out.println(c1.instant());

        //Duration Class
        Duration d1 = Duration.between(LocalTime.MIN, LocalTime.MIDNIGHT);
        System.out.println(d1.isNegative());
        Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIDNIGHT);
        System.out.println(d2.isNegative());

        System.out.println(d1.isZero());
        System.out.println(d2.isZero());

        //Local Date Class
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDate ld = LocalDate.parse("2022-05-27");
        LocalDate ld1 = LocalDate.parse("2022-05-17");
        LocalDate ld2 = LocalDate.parse("2022-05-17");

        System.out.println(ld1.equals(ld));
        System.out.println(ld1.equals(ld2));

        System.out.println(ld.withYear(2003));

        //Local Time Class
        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalTime t1 = LocalTime.of(13,18,29);
        System.out.println("Time before " + t1);
        LocalTime t2 = t1.plusHours(5);
        System.out.println("Time after 5 hours : " + t2);

        LocalTime lt = LocalTime.of(15, 38, 20);
        System.out.println("Time before : " + t);

        LocalTime lt1 = lt.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes " + lt1);
    }
}
