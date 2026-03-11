import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        // int[] numbers = { 1, 2, 3, 4, 5 };
        // int index = Arrays.binarySearch(numbers, 4);
        // System.out.println("Index of 4: " + index); // Output: Index of 4: 3

        Integer[] numbers = { 10, 2, 32, 12, 5 };
        Arrays.sort(numbers);

        Arrays.fill(numbers, 12);

        for (int i : numbers) {
            System.out.println(i + " ");
        }
    }
}
