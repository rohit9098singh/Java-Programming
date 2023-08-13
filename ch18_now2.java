import java.util.*;
public class ch18_now2 {
    public static void main(String[] args) {
        int s1,s2,s3,s4,total;
        float per;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks in s1");
         s1=sc.nextInt();
        System.out.println("enter the marks in s2");
         s2=sc.nextInt();
        System.out.println("enter the marks in s3");
         s3=sc.nextInt();
        System.out.println("enter the marks in s4");
         s4=sc.nextInt();
         total=s1+s2+s3+s4;
         per=total/4;
         if(s1>=40&&s2>=40&&s3>=40&&s4>=40&&per>=50)
         {
            System.out.println("pass with a percentage of :"+per);
         }
         else
         {
            System.out.println("fail");
         }


    }
    
}
