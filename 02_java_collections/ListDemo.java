import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Common List Methods
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add(1, "Mango"); // insert at index

        System.out.println("ArrayList: " + arrayList);

        arrayList.set(1, "Orange");           // Replace element
        arrayList.remove("Apple");            // Remove by value
        arrayList.remove(0);                  // Remove by index

        System.out.println("After update: " + arrayList);
        System.out.println("Contains 'Banana'? " + arrayList.contains("Banana"));
        System.out.println("Size: " + arrayList.size());

        arrayList.clear();                    // Remove all
        System.out.println("Cleared: " + arrayList.isEmpty());

        // LinkedList Specific
        linkedList.add("First");
        // linkedList.addLast("Last");
        // linkedList.addFirst("New First");
        System.out.println("LinkedList: " + linkedList);
    }
}
