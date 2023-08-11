public class ch18_now {
    public static void main(String[] args) {
        int a = 20, b = 30, c = 5;
        if (a > b) {//return type of if statement are boolean because it checks for true or fale
            if (a > c) {
                System.out.println("a is bigger");

            } else {
                System.out.println("c is greater");
            }
        } else {
            if (b > c) {
                System.out.println("b is greater");
            } else {
                System.out.println("c is greater");
            }
        }

    }
}
