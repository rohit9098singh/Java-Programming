import java.util.Scanner;
public class Removing_dublicate {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j,k;
        System.out.println("enter the size of an array");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                  for(k=j;k<n-1;k++)
                  {
                    a[j]=a[j+1];
                    n--;
                    j--;
                  }
                }
                
            }
        }
        System.out.println("your modified aarray after the removal of the dubicates are");
         for(i=1;i<n;i++)
         {
            System.out.println(+a[i]);
         }        
    
         
    }
    
}
