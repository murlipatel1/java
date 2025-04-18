// // Violating ISP: One large interface forces clients to implement unnecessary methods
interface Worker {
    void work();
    void eat();
}

// class Employee implements Worker {
//     @Override
//     public void work() {
//         System.out.println("Employee is working");
//     }

//     @Override
//     public void eat() {
//         System.out.println("Employee is eating");
//     }
// }

// class Robot implements Worker {
//     @Override
//     public void work() {
//         System.out.println("Robot is working");
//     }

//     @Override
//     public void eat() {
//         // Robots don't eat, so this is unnecessary
//         throw new UnsupportedOperationException();
//     }
// }


// Separate interfaces to avoid forcing implementations of unnecessary methods
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Employee implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }
}

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}

// Client code demonstrating the use of the interfaces
// This class demonstrates the Interface Segregation Principle (ISP) by separating the interfaces
public class ISPExample {
    public static void main(String[] args) {
        Worker employee = (Worker) new Employee();
        Worker robot = (Worker)new Robot();
        
        employee.work();
        robot.work();
    }
}
