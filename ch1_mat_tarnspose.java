import java.util.Scanner;
public class ch1_mat_tarnspose {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of rows of your matrix");
        int r=sc.nextInt();
        System.out.println("enter the number of rows of your matrix");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("enter your matrix element");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("enterd matrix is");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              System.out.printf("%d\t",mat[i][j]);
            }
            System.out.println("");
        }
        System.out.println("transpose of the enterd matrix");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.printf("%d\t",mat[j][i]);
            }
            System.out.println("");
        }
        
    }


    
}
