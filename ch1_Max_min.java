import java.util.Scanner;

public class ch1_Max_min {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("eneter the size of an array");
       int size=sc.nextInt();
       int a[]=new int [size];
       System.out.println("eneter the array elements");
       for(int i=0;i<size;i++)
       {
             a[i]=sc.nextInt();
       }
       int max=a[0],min=a[0];
        for(int i=1;i<size;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            { 
                min=a[i];
            }
          
        }
              
        System.out.println("minimum number in the array is"+min);
        System.out.println("maximum number of  the array is"+max);

    }
    
}
