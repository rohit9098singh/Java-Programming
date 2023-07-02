abstract class Sum {
    public abstract int sumTwo(int a, int b);

    public abstract int sumThree(int a, int b, int c);

    void display() {
        System.out.println("This is abstract Class");
    }

}

class demo extends Sum {

    @Override
    public int sumTwo(int a, int b) {
        return a + b;
    }

    @Override
    public int sumThree(int a, int b, int c) {
        return a + b + c;
    }

}

public class ch7_abstractclass {
    public static void main(String[] args) {
        demo de =new demo();
        System.out.println(de.sumTwo(2,66));
        de.display();
       //System.out.println(de.sumthree(2,4,5));
}
}


