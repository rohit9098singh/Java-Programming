import java.util.Scanner;
public class ch1_array_no_of_oddeven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int even=0;
        int odd=0;
        System.out.println("enter the size of the array you want");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.printf("enter your %d array elements\n",n);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("no of even elements enterd is ="+even);
        System.out.println("no of odd elements you enterd is="+odd);
    }
    
}
