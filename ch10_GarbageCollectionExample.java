class MyClass {
    // Constructor
    public MyClass() {
        System.out.println("Object created");
    }

    // Destructor (finalize method)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}

public class ch10_GarbageCollectionExample {
    public static void main(String[] args) {
        // Create an object
        MyClass obj = new MyClass();

        // Set the reference to null
        obj = null;

        // Request garbage collection
        System.gc();
    }
}

