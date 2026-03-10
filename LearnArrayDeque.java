import java.util.ArrayDeque;

/**
 * ArrayDeque (Double Ended Queue)
 * - No capacity restrictions (grows dynamically)
 * - Faster than Stack and LinkedList for most operations
 * - NOT thread-safe
 */
public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // 1. ADDING ELEMENTS (Offer)
        adq.offer(23);        // Adds to the tail (end)
        adq.offerFirst(12);   // Adds to the head (front)
        adq.offerLast(45);    // Same as offer()

        System.out.println("Initial Deque: " + adq);

        // 2. INSPECTING ELEMENTS (Peek)
        System.out.println("Peek (Default/First): " + adq.peek());
        System.out.println("Peek First: " + adq.peekFirst());
        System.out.println("Peek Last: " + adq.peekLast());

        // 3. BATCH ADDING FROM ARRAY
        Integer[] numbers = {1, 3, 23, 231, 33, 453, 67};
        for (Integer num : numbers) {
            adq.offer(num);
        }
        System.out.println("After Batch Add: " + adq);

        // 4. REMOVING ELEMENTS (Poll)
        // poll() removes from the front (head)
        System.out.println("Poll (Default): " + adq.poll());
        System.out.println("After poll: " + adq);

        // Explicit poll from front
        System.out.println("Poll First: " + adq.pollFirst());
        System.out.println("After poll first: " + adq);

        // Explicit poll from back
        System.out.println("Poll Last: " + adq.pollLast());
        System.out.println("After poll last: " + adq);

        System.out.println("Final Deque State: " + adq);
    }
}