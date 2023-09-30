// Define an interface called Animal// polymorphism using interfaces;
interface Animal {
    void makeSound();
}

// Create two classes that implement the Animal interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class exam2 {
    public static void main(String[] args) {
        // Create objects of different classes that implement the Animal interface
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the makeSound method on each object
        myDog.makeSound();
        myCat.makeSound();
    }
}

