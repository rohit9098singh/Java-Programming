import java.util.Scanner;
public class ch1_factorial {
   static int fact(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        else
        {
           return n*fact(n-1);
        }
    }
    public static void main(String[] args)
    {
         System.out.println("enter the value of n");
         Scanner sc=new Scanner(System.in);
         int n = sc.nextInt();
         System.out.println("factorial of the enterd number is\n"+fact(n));
         sc.close();


    }
    
}
