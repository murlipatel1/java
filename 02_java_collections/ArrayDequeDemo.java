import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding to both ends
        deque.add("Center");
        deque.addFirst("Start");
        deque.addLast("End");

        System.out.println("Deque: " + deque);

        // Removing from both ends
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removeFirst & removeLast: " + deque);

        // Peek from both ends
        deque.addFirst("New Start");
        deque.addLast("New End");
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        // Stack behavior (LIFO)
        deque.push("Top");
        System.out.println("After push: " + deque);
        System.out.println("Pop: " + deque.pop()); // removes from front

        System.out.println("Final Deque: " + deque);
    }
}
