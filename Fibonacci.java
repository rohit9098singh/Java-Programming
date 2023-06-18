import java.util.Scanner;
public class Fibonacci
{
   static int fib(int n)
   {
    if(n==1||n==2)
    {
        return 1;
    }
    else 
    {
        return fib(n-1)+fib(n-2);
    }

   } 
   public static void main(String[] args)
   {
      int i;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number for which fibonaccci is  to be calculated");
      int a=sc.nextInt();
      System.out.println("result of the enterd number is as follow\n"+fib(a));
      
   }
}