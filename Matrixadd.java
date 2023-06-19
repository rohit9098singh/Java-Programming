import java.util.Scanner;
public class Matrixadd {
    public static void main(String[] args)
    {
        int row,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the row");
        int r=sc.nextInt();
        System.out.println("enter  the column");
        int c=sc.nextInt();
        int mat1[][]=new int[r][c];
        int mat2[][]=new int[r][c];
        int res[][]=new int[r][c];
        System.out.println("enter the matrix one elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
           mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the matrix two elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
           mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("your first matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              System.out.printf("%d\t",mat1[i][j]);
            }
            System.out.println("");
        }
        System.out.println("your second matrix is");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              System.out.printf("%d\t",mat2[i][j]);

            }
            System.out.println("");
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              res[i][j]=mat1[i][j]+mat2[i][j];

            }
        }
        System.out.println("=====================");
        System.out.println("your resultant matrix is ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              System.out.printf("%d\t",res[i][j]);
            }
            System.out.println("");    
        }

    }
}            