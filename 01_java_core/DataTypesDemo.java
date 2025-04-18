public class DataTypesDemo {
    public static void main(String[] args) {

        // ✅ Primitive Data Types
        int age = 25;
        float height = 5.9f;
        char grade = 'A';
        boolean isPassed = true;
        double salary = 45000.50;
        long population = 7900000000L;
        byte level = 5;
        short year = 2024;

        // ✅ Non-Primitive Data Types
        String name = "Alice";
        int[] scores = {90, 85, 78};  // Array
        Person p = new Person("Bob", 30); // Object (custom class)

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Is Passed: " + isPassed);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Level: " + level);
        System.out.println("Scores[0]: " + scores[0]);
        System.out.println("Person: " + p.getName() + ", Age: " + p.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
