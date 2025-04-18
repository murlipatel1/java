import java.util.*;

class Student2 {
    int rollNo;
    String name;

    public Student2(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

// Custom comparator to sort by name
class NameComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2(102, "Alice"));
        students.add(new Student2(101, "Charlie"));
        students.add(new Student2(103, "Bob"));

        Collections.sort(students, new NameComparator()); // Uses Comparator

        System.out.println("Sorted by name (Comparator):");
        for (Student2 s : students) {
            System.out.println(s);
        }
    }
}

// Sort by name using lambda
// students.sort((a, b) -> a.name.compareTo(b.name));
