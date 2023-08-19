import java.util.*;
 class payout_out_of_bound extends Exception{
    payout_out_of_bound(String msg)
    {
        System.out.println("out of bound exception"+msg);
    }
}
public class l4 {
    public static void main(String[] args) throws payout_out_of_bound{
        int pay;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the salary");
        pay=sc.nextInt();
        if(pay<10000||pay>50000)
        {
          throw new payout_out_of_bound("salry not in a valid range");
        }
        else{
            System.out.println("employee is ready for 30 percent hike");
        }
    }
    
}
