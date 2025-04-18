import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.offer(5); // Similar to add(), returns false if it fails

        System.out.println("PriorityQueue (natural order): " + pq);

        // Peek (head of the queue)
        System.out.println("Peek: " + pq.peek());

        // Remove elements
        System.out.println("Poll: " + pq.poll()); // removes and returns head
        System.out.println("After poll: " + pq);

        // Remove specific element
        pq.remove(20);
        System.out.println("After removing 20: " + pq);

        System.out.println("Is Empty? " + pq.isEmpty());
        System.out.println("Size: " + pq.size());
    }
}
