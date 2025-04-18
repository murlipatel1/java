import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Natural ordering by rollNo
    @Override
    public int compareTo(Student other) {
        return this.rollNo - other.rollNo;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(102, "Alice"));
        students.add(new Student(101, "Bob"));
        students.add(new Student(103, "Charlie"));

        Collections.sort(students);  // Uses compareTo()

        System.out.println("Sorted by roll number (Comparable):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
