import javax.swing.*;
public class pracriceset
{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "welocome to the gui buddy !");

         String userinput=JOptionPane.showInputDialog(null,"enter your name please");
         JOptionPane.showMessageDialog(null,"welocome :"+ userinput +"!" );

         int choice=JOptionPane.showConfirmDialog(null,
         "do u want to continue or exit ",
         "configuration",
         JOptionPane.YES_NO_CANCEL_OPTION);

         if(choice==JOptionPane.YES_OPTION)
         {
        
        JOptionPane.showMessageDialog(null, "you choce to proceed !");

         }
         else if(choice==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "you choice exit");
         }
         else
         {
            
        JOptionPane.showMessageDialog(null, "cancelled");

         }

        
    }
}
/*View Available Flights: You should add code to fetch and display the list of available flights from your data source. 
This could involve reading from a file, a database, or any other relevant data storage.

Make a Reservation: You should prompt the user for necessary information, like flight details and passenger information,
 and then implement the logic to create a reservation. You might need to store this information somewhere (such as a list or database) for future reference.

Cancel a Reservation: Similar to making a reservation, prompt the user for the reservation details to be canceled. Then implement
 the logic to remove or mark the reservation as canceled in your data storage.

Remember that these templates provide the structure for each function. You'll need to fill in the details according to your program's
 requirements, which may involve interacting with databases, handling user input, and implementing data management logic.
 
import java.util.Scanner;
class reservationSystem{
    public void menubar()
    {
        System.out.println("\n1:view available flights\n2:make a reservation\n3:cancel a reservation\n4exit");
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        choice=sc.nextInt();
        while(choice!=4)
        {
            switch(choice)
            {
                case 1:
                {
                  break;
                }
                case 2:
                {
                  break;
                }
                case 3:
                {
                  break;
                }
                default :
                {
                  System.out.println("choose correct option to preceed1:view available flights\n2:make a reservation\n3:cancel a reservation\n4exit\"");
                }
            } 
          System.out.println("\nchoose an option");     
        }
        System.out.println("thanks for using our service we are glade with your involvement");
        
    }
    
}

public class p {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        reservationSystem s=new reservationSystem();
        s.menubar();

        
    }
}
        

         */