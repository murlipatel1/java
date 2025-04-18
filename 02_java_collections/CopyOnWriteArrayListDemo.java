import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Thread-safe iteration (even during modification)
        for (String lang : list) {
            System.out.println("Reading: " + lang);

            if (lang.equals("Python")) {
                list.add("Go"); // Safe: doesn't cause ConcurrentModificationException
            }
        }

        System.out.println("Final List: " + list);
    }
}
