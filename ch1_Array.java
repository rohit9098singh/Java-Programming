
import java.util.Scanner;
public class ch1_Array {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of an array");
         int n=sc.nextInt();
         int [] a=new int[n];
         System.out.println("Enter the array elements");
         for(int i=0;i<n;i++)
         {
            a[i]=sc.nextInt();
         }
         System.out.println("your enterd array is as follow");
         System.out. println("------------------------------");
         for(int i=0;i<a.length;i++)
         {
            System.out.println(+a[i]);
         }
         sc.close();
    }

    
}
