import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * A Set is a collection that contains NO duplicate elements.
 * HashSet uses a Hash Table for storage, meaning order is NOT guaranteed.
 */
public class LearnSet {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();

        // 1. ADDING (With Randomness)
        System.out.println("Generating random numbers...");
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(10);
            boolean isAdded = set.add(num);
            System.out.println("Generated: " + num + " | Added successfully? " + isAdded);
        }

        // 2. OBSERVING UNIQUENESS
        // Notice the size might be less than 5 if duplicates were generated!
        System.out.println("Initial Set (Unique values only): " + set);

        // 3. REMOVING
        // In Sets, you remove by VALUE, not index (because there are no indices!)
        set.remove(0); 
        System.out.println("After removing '0' (if it existed): " + set);

        // 4. CHECKING PROPERTIES
        System.out.println("Does set contain 2? " + set.contains(2));
        System.out.println("Is set empty? " + set.isEmpty());
        System.out.println("Current size: " + set.size());

        // 5. CLEARING
        set.clear();
        System.out.println("After clear(), is it empty? " + set.isEmpty());
    }
}