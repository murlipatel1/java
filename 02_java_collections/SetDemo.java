import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        // HashSet - unordered
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Banana"); // duplicate ignored

        System.out.println("HashSet: " + hashSet);

        // TreeSet - sorted order
        treeSet.addAll(hashSet);
        treeSet.add("Cherry");

        System.out.println("TreeSet (Sorted): " + treeSet);

        // Common Set methods
        System.out.println("Contains 'Mango'? " + treeSet.contains("Mango"));
        treeSet.remove("Apple");
        System.out.println("After removal: " + treeSet);
        System.out.println("Is Empty? " + treeSet.isEmpty());
        System.out.println("Size: " + treeSet.size());

        treeSet.clear();
        System.out.println("Cleared TreeSet: " + treeSet);
    }
}
