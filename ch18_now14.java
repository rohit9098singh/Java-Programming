import java.util.Scanner;
public class ch18_now14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the value of n to find the sum of first n natural numbers");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.printf("sum of the %d natural number is = %d",n,sum);

    }
    
}
