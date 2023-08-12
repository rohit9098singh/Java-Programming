class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class ch1_methodoverriding2{
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal1.makeSound(); // Output: Animal makes a sound
        dog.makeSound();     // Output: Dog barks
        cat.makeSound();     // Output: Cat meows
    }
}
