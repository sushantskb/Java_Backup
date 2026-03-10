import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * PriorityQueue stores elements based on their natural ordering or 
 * a custom Comparator. Under the hood, it uses a Binary Heap data structure.
 */
public class LearnPriorityQueue {
    public static void main(String[] args) {
        
        // 1. INITIALIZATION
        // Default: Min-Heap (Smallest element has highest priority)
        // Queue<Integer> pq = new PriorityQueue<>();

        // Custom: Max-Heap (Largest element has highest priority)
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // 2. ADDING ELEMENTS (Offer)
        pq.offer(22);
        pq.offer(12);
        pq.offer(62);
        pq.offer(39);

        // NOTE: Printing a PriorityQueue directly may not show elements in sorted order.
        // It shows the internal "Heap" storage. Only poll() guarantees the priority.
        System.out.println("Internal Heap Array: " + pq);

        // 3. PEEK: Look at the head (the highest priority element)
        System.out.println("Highest Priority Element (Peek): " + pq.peek());

        // 4. POLL: Remove and return the head
        System.out.println("Removing (Poll): " + pq.poll());
        
        // 5. AFTER POLL
        System.out.println("Remaining Heap: " + pq);
        System.out.println("New Highest Priority: " + pq.peek());
    }
}