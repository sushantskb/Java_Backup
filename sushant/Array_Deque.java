package sushant;
import java.util.*;
public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(45);
        ad1.add(21);
        ad1.add(56);
        ad1.add(89);
        ad1.add(78);
        ad1.add(69);
        System.out.println(ad1);

        System.out.println("After editing");

        ad1.addFirst(96);
        System.out.println(ad1);

        System.out.println("After editing");

        ad1.offerFirst(49);
        System.out.println(ad1);

        System.out.println("After editing");

        ad1.addLast(56);
        System.out.println(ad1);

        System.out.println("After editing");

        ad1.offerLast(41);
        System.out.println(ad1);


        System.out.println("After editing");

        System.out.println("Getting the first element " + ad1.getFirst());
        //or
        System.out.println("Getting the first element " + ad1.peekFirst());

        System.out.println("Getting the last element " + ad1.getLast());
        //or
        System.out.println("Getting the last element " + ad1.peekLast());



    }
}
