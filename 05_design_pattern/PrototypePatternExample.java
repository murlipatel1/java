// Prototype Interface
interface Prototype {
    Prototype clone();
}

// Concrete Prototype
class Car implements Prototype {
    private String model;
    private String engineType;

    public Car(String model, String engineType) {
        this.model = model;
        this.engineType = engineType;
    }

    @Override
    public Prototype clone() {
        return new Car(this.model, this.engineType); // Cloning the car object
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", engineType=" + engineType + "]";
    }
}

public class PrototypePatternExample {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model 3", "Electric");
        Car car2 = (Car) car1.clone(); // Cloning car1
        
        System.out.println(car1);
        System.out.println(car2);
    }
}
