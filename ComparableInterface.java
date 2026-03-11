import java.util.*;

// Implementing Comparable tells Java: "This class can be sorted naturally"
class Student implements Comparable<Student> {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" + name + ", #" + rollNo + "}";
    }

    // NATURAL SORTING LOGIC
    @Override
    public int compareTo(Student that) {
        // Ascending Order: this - that
        // Descending Order: that - this
        return this.rollNo - that.rollNo;
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Sushant", 2));
        list.add(new Student("Rohit", 3));
        list.add(new Student("Ankit", 1));

        // Before Sort: [Sushant #2, Rohit #3, Ankit #1]
        System.out.println("Before: " + list);

        // Collections.sort() ONLY works if the class implements Comparable
        Collections.sort(list);

        // After Sort: [Ankit #1, Sushant #2, Rohit #3]
        System.out.println("After:  " + list);
    }
}