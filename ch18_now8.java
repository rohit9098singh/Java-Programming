import java.util.Scanner;
public class ch18_now8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lastdigit,value,sum=0,reverse=0;
        System.out.println("enter atleast three digit number to check wheather the number is palindrom or not");
        int num=sc.nextInt();
        while(num!=0)
        {
          lastdigit=num%10;
          sum=sum+lastdigit;
          reverse=reverse*10+lastdigit;
          num=num/10;

        }
        
    }
    
}
