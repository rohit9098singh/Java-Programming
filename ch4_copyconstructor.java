class Person {
    String name;
    int age;

    public Person() {
        name = "John Doe";
        age = 30;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person anotherPerson) {
        this.name = anotherPerson.name;
        this.age = anotherPerson.age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ch4_copyconstructor {
    public static void main(String[] args) {
        // Using the default constructor
        Person person1 = new Person();
        System.out.println("Person 1 (Default Constructor) Details:");
        person1.displayDetails();
        System.out.println();

        // Using the parameterized constructor
        Person person2 = new Person("Alice", 25);
        System.out.println("Person 2 (Parameterized Constructor) Details:");
        person2.displayDetails();
        System.out.println();

        // Using the copy constructor to create a new object based on person2
        Person person3 = new Person(person2);
        System.out.println("Person 3 (Copy Constructor) Details:");
        person3.displayDetails();
        System.out.println();
    }
}

