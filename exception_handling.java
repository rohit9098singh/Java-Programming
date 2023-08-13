import java.io.*;

public class exception_handling{
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }

        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e);
        }

        try {
            int arr[] = { 1, 2, 3 };
            System.out.println("Number at index 10 is " + arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        }
        try {
            String text = "Hello";
            char character = text.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e);
        }
        finally {
            System.out.println("Finally block executed");
        }

    }
}
