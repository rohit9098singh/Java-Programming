import java.util.Scanner;
public class ch1_primechecking{
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println("enter the lower limit number to find the prime");
        int n1=sc.nextInt();
        System.out.println("enter the upper limit to find the prime in between");
        int n2=sc.nextInt();
        System.out.println("enter the number to be checked wheather it is a prime number or not");
        int n=sc.nextInt();
        if(n>n1&&n<n2)
        {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("it is not a prime number ");
                c=1;
                break;
            }
        }
        {
        if(c==0)
        {
            System.out.println("the enterd number is a prime number");
        }
        }
    }
        else{
            System.out.println("the number within the range you have provided as a parameter");
        
    }
}    
}   

    
