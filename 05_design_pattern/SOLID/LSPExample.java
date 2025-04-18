// // Violating LSP: A `Square` is a type of `Rectangle`, but it cannot be substituted correctly.
// class Rectangle {
//     private int width, height;

//     public void setWidth(int width) {
//         this.width = width;
//     }

//     public void setHeight(int height) {
//         this.height = height;
//     }

//     public int getArea() {
//         return width * height;
//     }
// }

// class Square extends Rectangle {
//     @Override
//     public void setWidth(int width) {
//         super.setWidth(width);
//         super.setHeight(width); // Square should maintain both sides equal
//     }

//     @Override
//     public void setHeight(int height) {
//         super.setWidth(height);
//         super.setHeight(height);
//     }
// }

// Using an abstract class for Shape and separating Square and Rectangle as independent entities
abstract class Shape {
    abstract int getArea();
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

// Main class to demonstrate Liskov Substitution Principle
public class LSPExample {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 6);
        Shape square = new Square(4);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Square Area: " + square.getArea());
    }
}
