package sushant;
import java.util.*;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(122);
        l1.add(16);
        l1.add(123);
        l1.add(15);
        l1.add(18);
        l1.add(45);
        l1.add(456);
        l1.add(127);
        System.out.println(l1); //This one is preferred
        //Another way of printing
//        for (int i = 0; i < l1.size(); i++){
//            System.out.print(l1.get(i));
//            System.out.print(", ");
//        }

        System.out.println("After editing");

        l1.add(0, 25);
        System.out.println(l1);

        System.out.println("After editing");

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(45);
        l2.add(669);
        l2.add(69);
        System.out.println("New array is l2: ");
        System.out.println(l2);

        System.out.println("After editing");

        System.out.println("Merging at last");
        l1.addAll(l2);
        System.out.println("After merging the l1 array with l2 is: " + l1);

        System.out.println("Merging from first");
        l1.addAll(0, l2);
        System.out.println("After merging the l1 array with l2 is: " + l1);

        System.out.println("After editing");

        System.out.println("If the array contians the given element");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.println("The given number is present in the array: " + l1.contains(number));

        System.out.println("After editing");

        System.out.println("Lets find the index of the given number: ");
        System.out.println("The index of " + number + " is " + l1.indexOf(number)); //It returns the first occurrence for example if input 45 then the first occurrence of the number is at 0 th index

        //Similarly for the last occurrence
        System.out.println("The index of the given number is: " + l1.lastIndexOf(number));
    }
}
