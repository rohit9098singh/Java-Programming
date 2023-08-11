import java.util.Scanner;
public class ch18_now5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int first_no=sc.nextInt();
        System.out.println("enter the second number");
        int second_no=sc.nextInt();
        int remainder=second_no/first_no;
        if(second_no%first_no==0)
        {
            System.out.println("the first number divides the second by::" +remainder+"::times ");
            System.out.println("first number is :"+first_no+"\n"+"second number :"+second_no);
        }
        else 
        {

            System.out.println("no  the first number is not the multiple of the second number because first number is bigger than secand it should be small");
        }
    }
    
}
