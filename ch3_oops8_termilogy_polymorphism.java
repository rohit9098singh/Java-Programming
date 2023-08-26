//METHOD OVERLOADING AND OVERRIDING IS AN EXAMPLE OF POLYMORPHISM and method overloading is an example of compile time polymorphism
//and method overriding is called as a runtime polymorphism
                     //METHOD OVERLOADING
public class ch3_oops8_termilogy_polymorphism {
    public void print(int num) {
        System.out.println("Printing an integer: " + num);
    }

    public void print(String text) {
        System.out.println("Printing a string: " + text);
    }

    public static void main(String[] args) {
       ch3_oops8_termilogy_polymorphism example = new ch3_oops8_termilogy_polymorphism();
        example.print(42);       // Output: Printing an integer: 42
        example.print("Hello");  // Output: Printing a string: Hello
    }
}   
                  //METHOD OVERRIDING
/*class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.draw();  // Output: Drawing a circle
        shape2.draw();  // Output: Drawing a square
    }
}
 */
