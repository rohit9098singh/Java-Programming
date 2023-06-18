import java.util.Scanner;
public class Matrixadd {
    public static void main(String[] args)
    {
        int p,q,m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows of first mat");
        p=sc.nextInt();
        System.out.println("eneter the number of column of first mat");
        q=sc.nextInt();
        System.out.println("enter the number of rows of second mat");
        m=sc.nextInt();
        System.out.println("enter the number of column of second matrix");
         n=sc.nextInt();
        if(p==m && q==n)
        {
            int a[][]=new int[p][q];
            int b[][]=new int[m][n];
            int c[][]=new int [m][n];
            System.out.println("enter all the elements of the 1st matrix");
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<q;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
              System.out.println("");
            System.out.println("enter the elements of your second matrix");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            System.out.println("");
            System.out.println("your first matrix");

            for(int i=0;i<p;i++)
            {
                for(int j=0;j<q;j++)
                {
                    System.out.println(a[i][j]+"");
                }
                System.out.println("");
            }
            System.out.println("your second matrix is");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.println(b[i][j]+"");
                }
               System.out.println(""); 
            }
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<n;j++)
                {
                    for(int k=0;k<q;k++)
                    {
                     c[i][j]=a[i][j]+b[i][j];   
                    }
                }
            }
            System.out.println("matrix after addition---");
            for( int i=0;i<p;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.println(c[i][j]+"");
                }
            System.out.println("");
            }

        }
        else{
            System.out.println("invalid choice");
        }



    }
}