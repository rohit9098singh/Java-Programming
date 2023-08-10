import java.util.Scanner;
class flight{
    private String flightno;
    private String bording;
    private String destination;
    private String originalseat;
    private int availableseats;
    public String time;

    public flight(String flightno, String bording,String destination,String time,int i)
    {
        this.flightno=flightno;
        this.bording=bording;
        this.destination=destination;
        this.originalseat=originalseat;
        this.time=time;
    }
  public  String getFlightDetails()
    {
      return("flight no:"+flightno+"bording point is from::"+bording+"destination popint is:: "+destination+"with seat availablity is:"+originalseat);
    }
    public void make_reservation(int seats)
    {
        if(seats<=availableseats)
        {
            System.out.println("your:"+seats+":are booked successfully");
            availableseats=availableseats-seats;
          
        }
        else
        {
            System.out.println("you are trying to book ticket which is not in the range please enter the ticket number within "+availableseats);
        }
    }
    public void cancel_resevation(int seats)
    {
        availableseats=availableseats+seats;
    }
    
}
class kingfisher
{
    flight[] flights;
    public void view_availableFlights()
    {
        flights=new flight[]{new flight("F101","banglore","chennai","8:00 am", 200),new flight("F102", "patna", "jharkad", "2:30pm", 231)};
    }
    void show_flights()
    {
        System.out.println("AVAILABLE FLIGHTS ARE AS FOLLOW");
        for(flight flight:flights)
        {
            System.out.println(flight.getFlightDetails());
        }
    }

}
public class p {
    public static void main(String[] args) {
        kingfisher plane=new kingfisher();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1: View available flights\n2: Make a reservation\n3: Cancel a reservation\n4: Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                         plane.show_flights();
                         break;
                case 2:
                        System.out.println("Enter the flight number for your fligh booking");
                        String flightnumber=sc.nextLine();

                        System.out.println("enter the number of seats that you want to book for your journey");
                        int seatsbooked=sc.nextInt();

                        for(Flight flight:flight)
                        {
                            if
                        }

                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("thanks for using our system we are really glad to have your presence over here");
                    sc.close(); 
                    return;      
                default:
                    System.out.println("Invalid choice, please enter a valid option.");
            }

            System.out.println("\nChoose an option");
        }
        
        
    }
}
