import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A comprehensive guide to ArrayList operations in Java.
 * ArrayLists are part of the Collections Framework and provide dynamic sizing,
 * unlike standard Arrays.
 */
public class LearnArrayList {
    public static void main(String[] args) {

        // 1. INITIALIZATION
        // List is the interface, ArrayList is the implementation.
        List<Integer> list = new ArrayList<>();

        // 2. ADDING ELEMENTS
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
        
        // Adding at a specific index (index, value)
        // This shifts existing elements to the right.
        list.add(1, 15); 

        // Adding a whole collection to the existing list
        List<Integer> newList = new ArrayList<>(); 
        newList.add(150);
        newList.add(160);
        list.addAll(newList);

        System.out.println("Initial List: " + list);

        // 3. ACCESSING & UPDATING
        // .get(index) retrieves the element
        System.out.println("Element at index 1: " + list.get(1));

        // .set(index, value) updates the value at a specific index
        list.set(2, 1000); 
        System.out.println("After updating index 2: " + list);

        // 4. CHECKING PROPERTIES
        // .contains(value) returns a boolean
        System.out.println("Does list contain 50? " + list.contains(50));
        System.out.println("List size: " + list.size());

        // 5. REMOVING ELEMENTS
        // Remove by index
        list.remove(1); 

        // Remove by specific value (requires wrapping primitive in Integer object)
        list.remove(Integer.valueOf(30)); 

        System.out.println("After removals: " + list);

        // 6. ITERATION (Three common ways)
        System.out.println("\n--- Iteration Methods ---");

        // A. Classic For Loop (Useful if you need the index 'i')
        for (int i = 0; i < list.size(); i++) {
            System.out.println("For Loop (Index " + i + "): " + list.get(i));
        }

        // B. Enhanced For-Each Loop (Most common for readability)
        for (Integer element : list) {
            System.out.println("For-Each: " + element);
        }

        // C. Iterator (Safest way to remove elements while looping)
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }

        // 7. CLEARING THE LIST
        list.clear();
        System.out.println("\nList after clear(): " + list);
    }
}