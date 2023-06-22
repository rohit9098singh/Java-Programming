import java.util.Scanner;
public class ch1_Practice {
   int add(int...arr)
   {
    int sum =0;
    for(int a:arr)
    {
        sum=sum+a;
    }
    return sum;
   } 
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("eneter the size of an array");
    int size =sc.nextInt();
    int arr[]=new int[size];
    System.out.println("enter the array elements");
    for(int i=0;i<size;i++)
    {
       arr[i]=sc.nextInt();
    }
    ch1_Practice p=new ch1_Practice();
    int res=p.add(arr);
    System.out.println("the sum of the enterd number are as follow\n"+res);

    
   }
}
