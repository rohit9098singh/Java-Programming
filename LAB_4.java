import java.util.*;
class payOutOfBounds extends Exception
{
    payOutOfBounds(String msg)
    {
        System.out.println("pay out of bound exception "+msg);
    }
}
public class LAB_4 {
    public static void main(String[] args) throws payOutOfBounds  {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the employee salary");
        int pay=sc.nextInt();
        if(pay<10000||pay>50000)
        {
            throw new payOutOfBounds("=== ");
            
        }
        else{
            System.out.println("employee is eligible for 30 percent hike");
        }
        
        
        
    }
    
}
