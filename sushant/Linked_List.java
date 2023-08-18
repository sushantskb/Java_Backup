package sushant;
import java.util.*;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(23);
        l1.add(25);
        l1.add(45);
        l1.add(66);
        l1.add(23);
        l1.add(89);
        l1.add(5, 18);
        System.out.println(l1);

        System.out.println("After editing");

        l1.set(2, 19);
        System.out.println("the element change is " + l1);

        System.out.println("After editing");

        l1.addLast(69);
        System.out.println("The array is " + l1);

        System.out.println("After editing");

        l1.addFirst(96);
        System.out.println("The array is " + l1);

    }
}
