import java.util.*;

public class ComparetoInterface {
    public static void main(String[] args) {
        List<Student> lists = new ArrayList<>();

        lists.add(new Student("Sushant", 2));
        lists.add(new Student("Rohit", 3));
        lists.add(new Student("Ankit", 1));
        lists.add(new Student("Aniket", 10));

        System.out.println("Original: " + lists);

        // 1. Using your Comparator to sort by NAME
        // This overrides the 'Natural' RollNo sorting temporarily
        Collections.sort(lists, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        System.out.println("Sorted by Name: " + lists);

        // 2. Sorting by ROLL NO (Back to default)
        // Since Student implements Comparable, we don't need a second argument here
        Collections.sort(lists);
        System.out.println("Sorted by RollNo: " + lists);
    }
}