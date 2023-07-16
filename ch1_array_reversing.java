import java.util.Scanner;
public class ch1_array_reversing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element");
         for(int i=0;i<n;i++)
         {
            arr[i]=sc.nextInt();
         }
         System.out.println("your enterd array elements are as follow");
         for(int i=0;i<n;i++)
         {
            System.out.println(arr[i]);
         }
         System.out.println("your array in a reverse order is as follow");
         for(int i=n-1;i>=0;i--)
         {
            System.out.println(arr[i]);
         }
    }
    
}
