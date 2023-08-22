import java.util.Scanner;
class simpleInterest
{
    Scanner sc=new Scanner(System.in);
    int principal,time;
    float interest,totalAmount=0.0f;
    simpleInterest()
    {
        getdetails();
    }
    public void getdetails()
    {
        System.out.println("enter the principal ");
        principal=sc.nextInt();
        System.out.println("enter the time period");
        time=sc.nextInt();
        System.out.println("enter the ineterest rate of the principal");
        interest=sc.nextFloat();
    }
    public void calculate_SI()
    {
       float totalAmount=(principal*interest*time)/100;
       System.out.println("ORiginal principal of yours is ="+principal);
       System.out.printf("the total interest amount after %d year is %f",time,totalAmount);

    }
   /*   public void display()
    {
        System.out.printf("the total amount after %d year is %f",time,totalAmount);
    }*/
}
public class ch18_now17 {
    public static void main(String[] args) {
        simpleInterest s=new simpleInterest();
        s.calculate_SI();
       // s.display();

        
    }
    
}
