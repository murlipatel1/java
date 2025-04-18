// Abstract class (Abstraction)
abstract class Animal {
    private String name;  // Encapsulation

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter and Setter (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract Method (Abstraction)
    abstract void makeSound();

    // Normal Method
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Inheritance
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Method Overriding (Polymorphism - runtime)
    @Override
    void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    // Method Overloading (Polymorphism - compile time)
    void fetch() {
        System.out.println(getName() + " is fetching a stick.");
    }

    void fetch(String item) {
        System.out.println(getName() + " is fetching a " + item + ".");
    }
}

// Another child class
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}

// Main class (with main method)
public class OOPConceptsDemo {
    public static void main(String[] args) {

        // Object creation (Class & Object)
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Calling methods (Encapsulation + Inheritance)
        dog.makeSound();     // Overridden
        cat.makeSound();     // Overridden

        dog.sleep();         // Inherited from abstract class
        cat.sleep();

        // Method Overloading
        dog.fetch();
        dog.fetch("ball");

        // Demonstrate Abstraction (can't instantiate abstract class)
        Animal a = new Dog("Rocky");
        a.makeSound();  // Runtime polymorphism (based on object type)

        // Accessing private variable via getters/setters
        cat.setName("Kitty");
        System.out.println("Cat's new name is: " + cat.getName());
    }
}
