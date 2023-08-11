import java.util.Scanner;
public class ch18_now4 {
    public static void main(String[] args) {
        float a,b,c;
        float r1,r2,disc;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a,b,c");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        disc=b*b-(4*a*c);
        if(disc>=0)
        {
            if(disc>0)
            {
            System.out.println("you have an real and unequal roots :: your roots are as follow ");
            r1 = (-b + (float) Math.sqrt(disc)) / (2 * a);
            r2 = (-b - (float) Math.sqrt(disc)) / (2 * a);
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
            }
            else{
                System.out.println("you have an equal roots:: and the roots are as follow ");
                r1=r2=-b/(2*a);
            }
            
        }
        else
        {
            System.out.println("you have an immaginary roots");
        }
        
    }
    
}
