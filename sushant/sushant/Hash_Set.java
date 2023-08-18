package sushant.sushant;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> myHs = new HashSet<>(6, 0.5f);
        myHs.add(16);
        myHs.add(22);
        myHs.add(17);
        myHs.add(18);
        myHs.add(18);
        System.out.println(myHs);

        System.out.println("After Editing");

        myHs.remove(18);
        System.out.println(myHs);

        System.out.println("After Editing");

        System.out.println("The Hash Set is empty? " + myHs.isEmpty());

        System.out.println("After Editing");

        System.out.println("The size of the Hash Set is " + myHs.size());

        System.out.println("After Editing");

        myHs.clear();
        System.out.println("The Hash Set is empty? " + myHs.isEmpty());
    }
}
