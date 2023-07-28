public class ch3_thiskeyword_5 {
    private int value;
    public ch3_thiskeyword_5(int value) {
        this.value = value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
    public void addValue(int number) {
        this.value = this.value+number;
    }
    public void printValue() {
        System.out.println("Value: " + this.value);
    }

    public static void main(String[] args) {
        
        ch3_thiskeyword_5 obj = new ch3_thiskeyword_5(10);

    
        obj.printValue(); 

        obj.setValue(25);
        obj.printValue(); // Output: Value: 25

        
        obj.addValue(5);
        obj.printValue(); // Output: Value: 30

        int currentValue = obj.getValue();
        System.out.println("Current Value: " + currentValue); 
    }
}


