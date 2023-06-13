import java.util.Scanner;
public class Fun {
    static void prime(int n)
    {
        int c=0;
      for(int i=2;i<n;i++)
      {
        if(n%i==0)
        {
            System.out.println("entered number is not a prime number");
            c=1;
        }
      }  
      
      if(c==0)
        {
          System.out.println("enterd number is a prime number");
        }
      
    }
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        a= sc.nextInt();
        prime(a);
        sc.close();
   }
    
}