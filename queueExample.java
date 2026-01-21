import java.util.PriorityQueue;
import java.util.Queue;

public class queueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of Strings
        Queue<String> pq = new PriorityQueue<>();

        // Adding elements to the queue
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        // Access the head element without removing
        System.out.println("Head using peek(): " + pq.peek());
        System.out.println("Head using element(): " + pq.element());

        // Display the queue to show elements are not removed
        System.out.println("Queue after accessing head: " + pq);
    }
}
