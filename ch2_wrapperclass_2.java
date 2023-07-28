 class IntegerWrapper {
    private int value;

    public IntegerWrapper (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
} 
public class ch2_wrapperclass_2 {
    public static void main(String[] args) {
        IntegerWrapper myInteger = new IntegerWrapper(42);
        System.out.println("Initial value: " + myInteger.getValue());

        myInteger.setValue(99);
        System.out.println("Updated value: " + myInteger.getValue());
    }
}
