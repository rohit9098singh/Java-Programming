import java.util.Scanner;
public class ch18_now10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of choice of which multiplication table is to be found out");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d*%d=%d\n",n,i,(n*i));
        }
    }
    
}
