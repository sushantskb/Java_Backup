import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // This tells Java what to print when we do System.out.println(student)
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }

    // Step 1: Check if the objects are logically equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo; // Equality based on ID/RollNo
    }

    // Step 2: Generate a numeric 'bucket' ID based on the same field
    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}

public class CustomClasses {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        
        // This won't be added! 
        // Even though the name is "Alice duplicate", the rollNo is 1.
        students.add(new Student("Alice duplicate", 1)); 

        System.out.println("Student Set: " + students);
        System.out.println("Total Students: " + students.size()); // Should be 2
    }
}