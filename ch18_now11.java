import java.util.Scanner;
public class ch18_now11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a and b which is to be swapped");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("the present value of a ,b is :"+a+" "+b);
        if(a!=b)
        {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("the swapped value of a ,b is as follow :"+a+" "+b);
        }
        else{
            System.out.println("both the values are same try for differenet values");
        }

        
    }
    
}
