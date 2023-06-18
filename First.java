import java.util.Scanner;
public class First {
   static int factorial(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        else
        {
            factorial=n*factoraial(n-1);
        }
    }
    public static void main(String[] args)
    {
        
         System.out.println("enter the value of n");
         Scanner sc=new Scanner(System.in);
         int n = sc.nextInt();
         System.out.println("factorial of the enterd number is"+factorial(n));


    }
    
}
