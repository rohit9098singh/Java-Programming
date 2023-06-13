import java.util.Scanner;
public class Prime {
    public static void main(String[] args)
    {
        int i,c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value to be checked for prime");
        int n=sc.nextInt();
        for(i=2;i<n;i++)
        {
          if(n%i==0)
          {
            System.out.println("enterd numebr is not a prime number");
            c=1;
          }

        }
        if(c==0)
        {
            System.out.println("enterd number is a prime number");

        }
        sc.close();

    }

}
