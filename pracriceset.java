import java.util.Scanner;
import java.util.Scanner;

public class pracriceset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first_no = sc.nextInt();
        System.out.println("Enter the second number");
        int second_no = sc.nextInt();

        int quotient = second_no / first_no;
        int remainder = second_no % first_no;

        if (remainder == 0) {
            System.out.println("The first number is a multiple of the second.");
            System.out.println("The first number divides the second number exactly " + quotient + " times.");
        } else {
            int smallestMultiple = (quotient + 1) * first_no;
            int timesDivided = quotient + 1;
            System.out.println("The first number is not a multiple of the second.");
            System.out.println("The smallest multiple greater than the second number is: " + smallestMultiple);
            System.out.println("The first number divides the second number " + timesDivided + " times.");
        }
    }
}

