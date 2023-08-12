public class ch1_methodoverloading_3 {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        ch1_methodoverloading_3 mathObj = new ch1_methodoverloading_3();

        System.out.println(mathObj.add(5, 7));           // Output: 12
        System.out.println(mathObj.add(2.5, 3.5));       // Output: 6.0
        System.out.println(mathObj.add("Hello, ", "World")); // Output: Hello, World
    }
}

