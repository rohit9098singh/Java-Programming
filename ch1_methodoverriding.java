class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14159 * radius * radius;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

public class ch1_methodoverriding {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);

        System.out.println("Circle Area: " + circle.area());   // Output: Circle Area: 78.53975
        System.out.println("Square Area: " + square.area());   // Output: Square Area: 16.0
    }
}

