class avon
{
    int no_of_seat=10;
    void bookticket(int seats)
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        synchronized(this)/*BY DOING THIS WE ARE ESPECIALLY MAKING THIS AS synchronized THEREFORE THE ANOTHER THREAD WILL NOT WAIT 
        FOR THE REST OF THE CODE TO EXECUTE EXCEPT THE IF ELSE PART SINCE IT IS synchronized */
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
         System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }
}
class yourapp extends Thread{
     static avon am;
     int seat;
    public void run()
    {
         am.bookticket(seat);
    }
}
public class ch12_9_3Synchronization_3stmethod {
    public static void main(String[] args) {
        yourapp.am= new avon();
        yourapp n=new yourapp();
        n.seat=7;
        n.start();
        yourapp o=new yourapp();
        o.seat=6;
        o.start();

    }
    
}