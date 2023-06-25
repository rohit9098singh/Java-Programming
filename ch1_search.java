import java.util.Scanner;
public class ch1_search {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        int search,c=0;
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array element");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("eneter the element to be searched");
        search=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==search)
            {
                System.out.printf("element found at index %d and the element is %d\n",i+1,search);
                c=1;
            }
        }    
            if(c==0)
            {
                System.out.println("element not found in the list");
            }
        

    }
    
}
