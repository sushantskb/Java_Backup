import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        
        // 1. INITIALIZATION
        Stack<String> animals = new Stack<>();

        // 2. PUSH: Adding elements to the top
        animals.push("Lion");
        animals.push("Dog");
        System.out.println("Initial Stack: " + animals);

        // 3. INTEGRATING A HARDCODED ARRAY
        // Using what you learned about arrays to batch-add items
        String[] animalNames = { "Horse", "Cat", "Zebra" };
        for (String animal : animalNames) {
            animals.push(animal);
        }
        System.out.println("After Push All: " + animals);

        // 4. PEEK: Look at the top element without removing it
        // Note: Peek throws an exception if the stack is empty!
        if (!animals.isEmpty()) {
            System.out.println("Top Animal (Peek): " + animals.peek());
        }

        // 5. POP: Remove and return the top element
        String removedAnimal = animals.pop(); 
        System.out.println("Popped: " + removedAnimal);
        
        // 6. SEARCH: Find the position of an element
        // Returns 1-based position from the top, or -1 if not found
        int position = animals.search("Lion");
        System.out.println("Position of Lion from top: " + position);

        System.out.println("Final Stack: " + animals);
    }
}