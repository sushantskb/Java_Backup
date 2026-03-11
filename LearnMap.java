import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    public static void main(String[] args) {
        // String is the Key, Integer is the Value
        Map<String, Integer> numbers = new HashMap<>();

        // 1. ADDING DATA
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        // putIfAbsent prevents overwriting existing data
        numbers.putIfAbsent("Two", 23); 
        
        System.out.println("Map Content: " + numbers);

        // 2. ITERATION (3 Ways)
        System.out.println("\n--- Iterating Entry Sets ---");
        // Best way: gives you both Key and Value at once
        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " maps to " + entry.getValue());
        }

        System.out.println("\n--- Iterating Keys Only ---");
        for (String key : numbers.keySet()) {
            System.out.println("Key: " + key);
        }

        System.out.println("\n--- Iterating Values Only ---");
        for (Integer value : numbers.values()) {
            System.out.println("Value: " + value);
        }

        // 3. CHECKING & UTILITY
        System.out.println("\nContains Value 23? " + numbers.containsValue(23));
        System.out.println("Contains Key 'Two'? " + numbers.containsKey("Two"));
        System.out.println("Is Map Empty? " + numbers.isEmpty());
        
        // Bonus: Get a value by key
        System.out.println("Value for 'Three': " + numbers.get("Three"));
    }
}