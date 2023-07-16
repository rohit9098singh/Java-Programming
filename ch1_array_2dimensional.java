import java.util.Scanner;
public class ch1_array_2dimensional{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
       System.out.println("enter the number of rows of your choice");
       int r=sc.nextInt();
       System.out.println("enter the number of column of your choice");
       int c=sc.nextInt();
       int a[][]=new int[r][c];
       System.out.println("enter the array element of your choice");
       for(int i=0;i<r;i++)
       {
        for( int j=0;j<c;j++)
        {
           a[i][j]=sc.nextInt();

        }
       }
       System.out.println("your entetrd array is");
       System.out.println("=====================");
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            System.out.println(a[i][j]+"\t");
        }
            System.out.print("\n");
       }

    }
    
}
