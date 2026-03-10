import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        
        // 1. INITIALIZATION
        // We use Queue (Interface) as the type and LinkedList as the implementation.
        Queue<Integer> queue = new LinkedList<>();

        // 2. ENQUEUE (Add to Rear)
        // .offer() returns false if it fails (safer than .add() which throws an exception)
        queue.offer(12);
        queue.offer(72);
        queue.offer(32);
        queue.offer(24);

        System.out.println("Current Queue: " + queue);

        // 3. DEQUEUE (Remove from Front)
        // .poll() returns null if the queue is empty (safer than .remove())
        Integer removedElement = queue.poll(); 
        System.out.println("Removed (Poll): " + removedElement);
        System.out.println("Queue after poll: " + queue);

        // 4. PEEK (Look at Front)
        // .peek() returns null if empty (safer than .element())
        System.out.println("Next in line (Peek): " + queue.peek());
        
        // 5. CHECKING SIZE/EMPTY
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Size of queue: " + queue.size());
    }
}