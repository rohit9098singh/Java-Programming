import java.util.Scanner;
public class ch1_array_linear_binary {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of the array you want");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int j=0;j<n;j++)
    {
        System.out.println("enter the %d elements");
       arr[j]=sc.nextInt();
    }
    
    while(true)
    {
        System.out.println("\nenter your choice\n1:linear\n2:binarysearch\n3:exit\n");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("enter the element to be searched");
                int search=sc.nextInt();
                for(int j=0;j<n;j++)
                {
                    if(arr[j]==search)
                    {
                        System.out.printf("element %d found at location %d ",search,j);
                        break;
                    }
                }
                break;
            }
            case 2:
            {
                int first=0;
                int last=n-1;
                int middle=(first+last)/2;
                System.out.println("eneter the element to be searched");
                int search=sc.nextInt();
                while(first<=last)
                {
                    middle =(first+last)/2;
                   if(search<middle)
                   {
                    last=middle-1;
                   }
                  else if(search>middle)
                   {
                    first=middle+1;
                   }
                  else if(search==middle)
                   {
                    System.out.printf("%d element found at location %d ",middle,search);
                    break;
                   }
                   else
                   {
                     System.out.println("your element does not exist in the list");
                   }
                

                }
            }
            
        }
    
          if(choice==3)
            {
                break;
            }
        }
    }
}
