import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        // String[] studentName = new String[30];
        // studentName[0] = "Sushant";

        // //
        // // studentName[1]....studentName[28];
        // //
        // studentName[29] = "Rahul";

        // for (int i = 0; i < studentName.length; i++) {
        // System.out.println(studentName[i]);
        // }

        // the problem with the above approach is we cannot increase the size of an
        // array dynamically....

        List<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // System.out.println(list);

        // list.add(4); // this will add 4 at the end of the list....
        // System.out.println(list);

        // list.add(1, 50);
        // System.out.println(list);

        // List<Integer> newList = new ArrayList(); // creating a new array list...
        // newList.add(150);
        // newList.add(160);

        // list.addAll(newList); // this will add all the elements to old list
        // System.out.println(list);

        // System.out.println(list.get(1));

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        System.out.println(list);

        // Removing
        // list.remove(1); // this will remove the element from the specified index

        // list.remove(Integer.valueOf(30)); // this will remove the exact element...

        // list.clear();
        // System.out.println(list);

        // set function

        // list.set(2, 1000);
        // System.out.println(list);

        // // contains method
        // System.out.println(list.contains(50));

        // iterating
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println("The element is " + list.get(i));
        // }

        for (Integer integer : list) {
            System.out.println("For each element is: " + integer);
        }
    }
}