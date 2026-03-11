import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(15);
        list.add(25);
        list.add(25);

        System.out.println("min element" + Collections.min(list));

        System.out.println("max element" + Collections.max(list));

        System.out.println(Collections.frequency(list, 25));

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Reverse Sorted List: " + list);
    }
}
