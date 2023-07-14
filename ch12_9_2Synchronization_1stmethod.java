class book
{
    int no_of_seat=10;
   synchronized void bookticket(int seats)/*JUSTY BY WRIITING THE synchronized HERE THE PRREVIOUS PROBLEM SOLVES HERE BECAUSE 
   THERE TEHRE EXIST A LOCK SYSTEM FOR AN OBJECT SO AT A TIME ONLY ONE THREAD WILL HAVA THE ACCESS OF THE LOCK*/
    {
        if(no_of_seat>=seats)
        {
            System.out.println(+seats+" seat is booked successfully");
            no_of_seat=no_of_seat-seats;
            System.out.println("total seats left now-"+no_of_seat);
        }
        else{
            System.out.println("no you cannot book the ticket out of bound");
            System.out.println("seat left is -:"+no_of_seat);
        }
    }
}
class myapp extends Thread{
     static book myticket;
     int seat;
    public void run()
    {
         myticket.bookticket(seat);
    }
}
public class ch12_9_2Synchronization_1stmethod {
    public static void main(String[] args) {
        myapp.myticket= new book();
        myapp n=new myapp();
        n.seat=7;
        n.start();
        myapp o=new myapp();
        o.seat=6;
        o.start();

    }
    
}
/*NOTE-THERE MAY BE SITUATION WHEN WE WE WOULD WANT ONLY A PARTICULAR PART TO BE synchronized AS  IN ABOVE THERE WAS ONLY IF ELSE
BLOCK NOW SEE THERE MAY BE 1000 IF LINE THAT CAN EXIST IN ABOVE AND BELOW THE IF ELSE BLOCK SO IT WILL UNNESSESARILY INCREASE THE 
WAITING TIME FOR THE OTHER THREAD BECAUSE UNLESSS AND UNTIL 1ST THREAD EXECUTES ALL THE LINE THE NEXT THREAD IS NOT GOING TO COME
INSIDE SO THIS  PROBLEM IS RESOLVED IN THE NEXT PROGRMME 
 */