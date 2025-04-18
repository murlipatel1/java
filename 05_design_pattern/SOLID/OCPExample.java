// Violating Open Close Principle : The method is modified each time we add a new shape.
// class AreaCalculator {
//     public double calculateArea(Object shape) {
//         if (shape instanceof Circle) {
//             Circle circle = (Circle) shape;
//             return Math.PI * Math.pow(circle.getRadius(), 2);
//         } else if (shape instanceof Rectangle) {
//             Rectangle rectangle = (Rectangle) shape;
//             return rectangle.getWidth() * rectangle.getHeight();
//         }
//         return 0;
//     }
// }

// class Circle {
//     private double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return radius;
//     }
// }

// class Rectangle {
//     private double width, height;

//     public Rectangle(double width, double height) {
//         this.width = width;
//         this.height = height;
//     }

//     public double getWidth() {
//         return width;
//     }

//     public double getHeight() {
//         return height;
//     }
// }



interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle implements Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea(); // Now the method is closed for modification but open for extension
    }
}

public class OCPExample {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
    }
}
