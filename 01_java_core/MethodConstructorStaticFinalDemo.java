// Parent class
class Animal {
    String type;

    // Constructor
    public Animal(String type) {
        this.type = type;
    }

    // Method to override
    void makeSound() {
        System.out.println("Some generic animal sound.");
    }

    // Final method (cannot be overridden)
    final void breathe() {
        System.out.println(type + " is breathing.");
    }
}

// Child class
class Dog extends Animal {

    // Constructor Overloading
    public Dog() {
        super("Dog");  // Calls parent constructor
    }

    public Dog(String breed) {
        super("Dog - " + breed);
    }

    // Method Overriding
    @Override
    void makeSound() {
        System.out.println(type + " says: Woof!");
    }

    // Method Overloading
    void fetch() {
        System.out.println(type + " is fetching a stick.");
    }

    void fetch(String item) {
        System.out.println(type + " is fetching a " + item + ".");
    }
}

public class MethodConstructorStaticFinalDemo {

    // Static variable
    static int instanceCount = 0;

    // Final variable (constant)
    final double PI = 3.14159;

    // Constructor
    public MethodConstructorStaticFinalDemo() {
        instanceCount++; // Increments static variable for every object
    }

    // Static method
    static void showInstanceCount() {
        System.out.println("Instances created: " + instanceCount);
    }

    public static void main(String[] args) {

        // Constructors
        Dog d1 = new Dog();
        Dog d2 = new Dog("Labrador");

        // Method Overriding
        d1.makeSound();
        d2.makeSound();

        // Method Overloading
        d1.fetch();
        d2.fetch("ball");

        // Final method from parent class
        d1.breathe();

        // Final variable usage
        MethodConstructorStaticFinalDemo obj1 = new MethodConstructorStaticFinalDemo();
        MethodConstructorStaticFinalDemo obj2 = new MethodConstructorStaticFinalDemo();
        System.out.println("PI value: " + obj1.PI);
        // obj1.PI = 3.14; // This will cause a compile-time error
        // obj2 print statement
        System.out.println("PI value from obj2: " + obj2.PI);
        

        // Static method usage
        MethodConstructorStaticFinalDemo.showInstanceCount();
    }
}
