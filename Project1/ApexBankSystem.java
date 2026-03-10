package Project1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class ApexBankSystem {
    public static void main(String[] args) {
        Random random = new Random();

        // --Task 1: Customer List --
        List<String> customers = new ArrayList<>();
        customers.add("Sushant");
        customers.add("Rahul");
        customers.add("Amit");
        customers.add("Sneha");
        customers.add("Vikram");

        // Task 2: Blacklisted PIns (Hardcoded Array)
        int[] blackListedPINs = { 1111, 1234, 0000, 9999 };
        System.out.println("Security: System initialized with " + blackListedPINs.length + " blacklisted PINs. ");

        // Task 3: Loan Service Counter
        Queue<String> serviceQueue = new LinkedList<>();
        serviceQueue.offer("Rahul");
        serviceQueue.offer("Sneha");
        serviceQueue.offer("Sushant");
        System.out.println("Serving Customer: " + serviceQueue.poll());

        // Task 4: App Navigation
        Stack<String> navHistory = new Stack<>();
        navHistory.push("Dashboard");
        navHistory.push("Settings");
        navHistory.push("Security Page");
        System.out.println("User clicked back. Returning to: " + navHistory.pop());

        // Task 5: Transaction IDs (HashSet - Uniquness)
        Set<Integer> transactionIDs = new HashSet<>();
        while (transactionIDs.size() < 5) {
            transactionIDs.add(random.nextInt(11) + 100);
        }
        System.out.println("Unique Transaction IDs Generated: " + transactionIDs);

        // Task 6: Fraud Alert
        PriorityQueue<Double> fraudCheck = new PriorityQueue<>(Comparator.reverseOrder());
        fraudCheck.offer(120.50);
        fraudCheck.offer(5000.00);
        fraudCheck.offer(45.00);
        fraudCheck.offer(1200.00);

        System.out.println("Highest risk amount to review: $" + fraudCheck.peek());

        // final
        Transaction t1 = new Transaction("Withdraw", 2000.00, "TXN101");
        System.out.println("\nFinal Audit Log Entry: ");
        System.out.println(t1.toString());
    }
}
