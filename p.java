import java.util.Scanner;
class Flight {
    public  int flightNumber; // Flight number as an integer
    public String flightCode; // Flight code (e.g., "F123")
    public String destination;
    public String departureTime;

    public Flight(int flightNumber, String flightCode, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.flightCode = flightCode;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight " + flightCode + " to " + destination + " at " + departureTime;
    }
}

class ReservationSystem extends Flight {
    private Flight[] availableFlights;

    public ReservationSystem() {
        // Initialize the available flights
        super(101, "AO90", "MUMBAI TO PATNA",9.45);
        availableFlights = new Flight[]{
            new Flight(1, "F123", "New York", "10:00 AM"),
            new Flight(2, "F456", "Los Angeles", "11:30 AM"),
            new Flight(3, "F789", "Chicago", "12:45 PM")
        };
    }

  public void menubar() {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1: View available flights\n2: Make a reservation\n3: Cancel a reservation\n4: Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                      int flightnumber;
                      String flightname;
                      int timing;
                      System.out.println("the available flights are as follow");
                      
                
                    
                    break;
                case 2:
                    
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

public class p {
    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem();
        system.menubar();
        system.
    }
}
