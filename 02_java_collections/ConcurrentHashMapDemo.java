import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new ConcurrentHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Thread-safe iteration and update
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

            if (entry.getKey().equals("B")) {
                map.put("D", 4); // Safe modification
            }
        }

        System.out.println("Final Map: " + map);
    }
}
