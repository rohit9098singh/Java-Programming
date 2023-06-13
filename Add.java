import java.util.Scanner;
public class Add {
    public static void main(String[] args)
    {
        System.out.println(" taking three input  from user ");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= sc.nextInt();
        System.out.println("enter the value of b");
        int b= sc.nextInt();
        int c= a+b;
        System.out.println("the sum of three number is\n"+c);
        sc.close();
    }    


    

    
}
