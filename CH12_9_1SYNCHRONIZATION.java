class bookmyticket 
{
    int no_of_seat=10;
    void bookticket(int seats)
    {
        if(no_of_seat>=seats)
        {
            System.out.println(+seats+ " seat is booked successfully");
            no_of_seat=no_of_seat-seats;
            System.out.println("total seats left now-"+no_of_seat);
        }
        else{
            System.out.println("no you cannot book the ticket out of bound");
            System.out.println("seat left is :"+no_of_seat);
        }
    }
}
class mybookapp extends Thread{
     static bookmyticket myticket;//HERE WE ARE CREATING THE REFERENCE OF THE BOOKMYTICKET SO THAT WE CAN WE CALL THE
     //BOOKTICKET METHOS SO TAHT IT CAN BE CALLED  BY THE MULTIPLE THREAD AT A TIME FROM MAIN
     int seat;
    public void run()
    {
         myticket.bookticket(seat);
    }
}
public class CH12_9_1SYNCHRONIZATION {
    public static void main(String[] args) {
        mybookapp.myticket= new bookmyticket();//REFERENCE WE HAVE CREATED OBOVE AND OBJECT IS HERE SO THAT MAIN CAN PUT THE VALUES
        mybookapp n=new mybookapp();
        n.seat=7;
        n.start();
        mybookapp o=new mybookapp();
        o.seat=9;
        o.start();

    }
    
}
/*AS HERE BOTH THE THREAD EXECUTE SIMULTENIOUSLY THERE MAY BE A SITUATION WHEN BOTH THE THREAD EK SATH RUN METHOD KO
 * EXCESS KAR LE OR US TIME DONO THREAD KE LIYE SEAT AVAILABLE REHEGA DATA INCONSISTANY AAYEG ISE SE BACHNE KE LIYE WE USE
 * SYNCRONIZATION SO THAT ONE THREAD WAITS TILL THE OTHER FINISHES THE TASK
 */