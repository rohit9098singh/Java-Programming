abstract class Sum {
    public abstract void sumTwo(int a, int b);

    public abstract void sumThree(int a, int b, int c);

    void display() {
        System.out.println("This is abstract Class ");
    }

}

class demo extends Sum {

    @Override
    public void sumTwo(int a, int b) {
       System.out.println(  a + b);
    }

    @Override
    public void sumThree(int a, int b, int c) {
        System.out.println( a + b + c);
    }

}

public class ch7_abstractclass {
    public static void main(String[] args) {
        demo de =new demo();
        de.sumTwo(2,66);
        de.display();
       de.sumThree(2,4,5);
       de.display();

}
}


