/*System: Yes, you can think of System as a class in Java. But instead of saying "method called out," it's more accurate to say 
"a special thing called 'out'."

out: This "out" is not exactly a method, but rather a special object called a "PrintStream." 
It's like a printer that can print text to your screen (the console).

println: This part is correct! println is a method that belongs to the "out" object. 
It's a way to tell the "printer" to print a line of text. */
import java.util.Scanner;

class Flight {
    String flightNumber;
    String origin;
    String destination;
    String departureTime;
    int availableSeats;

    public Flight(String flightNumber, String origin, String destination, String departureTime, int availableSeats) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
    }

    public String getFlightDetails() {
        return "Flight " + flightNumber + " from " + origin + " to " + destination +
               ", Departure Time: " + departureTime + ", Available Seats: " + availableSeats;
    }

    public boolean makeReservation(int seats) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            return true;
        }
        return false;
    }

    public void cancelReservation(int seats) {
        availableSeats += seats;
    }
}

class ViewAvailableFlights {
    Flight[] flights;

    public ViewAvailableFlights() {
        flights = new Flight[] {
            new Flight("F101", "New York", "Los Angeles", "08:00 AM", 150),
            new Flight("F102", "Chicago", "Miami", "09:30 AM", 120),
            // Add more flights as needed
        };
    }

    void showFlights() {
        System.out.println("Available Flights:");
        for (Flight flight : flights) {/*for (Flight flight : flights) {: This is a for-each loop. It iterates over each Flight 
            object in the flights collection (assuming flights is a collection of Flight objects). The loop variable flight is 
            declared within the loop and represents the current Flight object being processed in each iteration. */
            System.out.println(flight.getFlightDetails());
        }
    }
}

public class FlightReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        ViewAvailableFlights availableFlights = new ViewAvailableFlights();

        while (true) {
            System.out.println("\n1: View available flights\n2: Make a reservation\n3: Cancel a reservation\n4: Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    availableFlights.showFlights();
                    break;
                case 2:
                    System.out.println("Enter the flight number for reservation:");
                    sc.nextLine(); // Consume the newline left by previous nextInt()
                    String flightNumber = sc.nextLine();

                    System.out.println("Enter the number of seats to reserve:");
                    int seatsToReserve = sc.nextInt();

                    for (Flight flight : availableFlights.flights) {
                        if (flight.flightNumber.equals(flightNumber)) {
                            if (flight.makeReservation(seatsToReserve)) {
                                System.out.println("Reservation successful!");
                            } else {
                                System.out.println("Not enough available seats for reservation.");
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the flight number for cancellation:");
                    sc.nextLine(); // Consume the newline left by previous nextInt()
                    String cancelFlightNumber = sc.nextLine();

                    System.out.println("Enter the number of seats to cancel:");
                    int seatsToCancel = sc.nextInt();

                    for (Flight flight : availableFlights.flights) {
                        if (flight.flightNumber.equals(cancelFlightNumber)) {
                            flight.cancelReservation(seatsToCancel);
                            System.out.println("Cancellation successful!");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Thanks for using our system. We are glad to have your presence!");
                   // sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, please enter a valid option.");
            }

            System.out.println("\nChoose an option");
        }
    }
}
