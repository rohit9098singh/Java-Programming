    class fib{
    public  int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
public class ch1_fibonacci {

    public static void main(String[] args) {
        fib f=new fib();
        int n = 10;
        System.out.println("Fibonacci sequence up to " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(f.fibonacci(i) + " ");
        }
    }
}    