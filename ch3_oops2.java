class MyEmployee {
    int id;
    String name;

     void printdetails() {

        System.out.println(id);
        System.out.println(name);
    }
}

public class ch3_oops2 {
    public static void main(String[] args) {
        MyEmployee rohit = new MyEmployee();
        MyEmployee ram = new MyEmployee();
        rohit.id = 20;
        rohit.name = "rohit singh";
        ram.id = 21;
        ram.name = "ram mehta";
        rohit.printdetails();
        ram.printdetails();
    }
}
