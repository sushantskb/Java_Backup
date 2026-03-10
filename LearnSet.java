import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Random;

public class LearnSet {
    public static void main(String[] args) {
        Random random = new Random();

        // 1. HashSet: Best performance, but order is totally random/unpredictable.
        // Set<Integer> set = new HashSet<>();

        // 2. LinkedHashSet: Maintains the order in which elements were inserted.
        // Set<Integer> set = new LinkedHashSet<>();

        // 3. TreeSet: Elements are stored in a sorted tree structure (Natural Order).
        Set<Integer> set = new TreeSet<>();

        System.out.println("Generating random numbers...");
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(50);
            set.add(num);
        }

        // Because you used TreeSet, this will print in ascending order (e.g., [2, 15, 22...])
        System.out.println("Set Elements: " + set);

        // Standard Set Operations
        System.out.println("Contains 25? " + set.contains(25));
        set.remove(10); // Removes the number 10, not the 10th index!
        
        System.out.println("Size after removal: " + set.size());
    }
}