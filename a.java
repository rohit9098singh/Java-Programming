import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String VIN;
    private String brand;
    private String model;
    private boolean isRented;

    public Vehicle(String VIN, String brand, String model) {
        this.VIN = VIN;
        this.brand = brand;
        this.model = model;
        this.isRented = false;
    }

    public String getVIN() {
        return VIN;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentVehicle() {
        isRented = true;
    }

    public void returnVehicle() {
        isRented = false;
    }

    public abstract double calculateRentalCost();
    public abstract String getVehicleType();
}

class Car extends Vehicle {
    private int seatingCapacity;
    private String fuelType;

    public Car(String VIN, String brand, String model, int seatingCapacity, String fuelType) {
        super(VIN, brand, model);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public double calculateRentalCost() {
        // Implement the specific calculation for car rental cost
        return 0.0;
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}

class Motorcycle extends Vehicle {
    private int engineDisplacement;
    private String motorcycleType;

    public Motorcycle(String VIN, String brand, String model, int engineDisplacement, String motorcycleType) {
        super(VIN, brand, model);
        this.engineDisplacement = engineDisplacement;
        this.motorcycleType = motorcycleType;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    @Override
    public double calculateRentalCost() {
        // Implement the specific calculation for motorcycle rental cost
        return 0.0;
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }
}

class Bicycle extends Vehicle {
    private int frameSize;
    private String gearType;

    public Bicycle(String VIN, String brand, String model, int frameSize, String gearType) {
        super(VIN, brand, model);
        this.frameSize = frameSize;
        this.gearType = gearType;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public String getGearType() {
        return gearType;
    }

    @Override
    public double calculateRentalCost() {
        // Implement the specific calculation for bicycle rental cost
        return 0.0;
    }

    @Override
    public String getVehicleType() {
        return "Bicycle";
    }
}

class VehicleRentalSystem {
    private List<Vehicle> vehicles;

    public VehicleRentalSystem() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (!vehicle.isRented()) {
                availableVehicles.add(vehicle);
            }    
        }

        return availableVehicles;
    }

    public List<Vehicle> getRentedVehicles() {
        List<Vehicle> rentedVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isRented()) {
                rentedVehicles.add(vehicle);
            }
        }
        return rentedVehicles;
    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0.0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isRented()) {
                totalRevenue += vehicle.calculateRentalCost();
            }
        }
        return totalRevenue;
    }

    // Other methods for rental management and reporting can be implemented here
}

class Main {
    public static void main(String[] args) {
        // Create an instance of the VehicleRentalSystem
        VehicleRentalSystem rentalSystem = new VehicleRentalSystem();

        // Add vehicles to the rental system
        rentalSystem.addVehicle(new Car("VIN001", "Toyota", "Corolla", 5, "Petrol"));
        rentalSystem.addVehicle(new Motorcycle("VIN002", "Honda", "CBR300", 300, "Sports"));
        rentalSystem.addVehicle(new Bicycle("VIN003", "Trek", "Mountain Bike", 18, "MTB"));

        // Rent a vehicle
        Vehicle vehicle = rentalSystem.getAvailableVehicles().get(0);
        vehicle.rentVehicle();

        // Return a vehicle
        rentalSystem.getRentedVehicles().get(0).returnVehicle();

        // Generate reports
        List<Vehicle> availableVehicles = rentalSystem.getAvailableVehicles();
        List<Vehicle> rentedVehicles = rentalSystem.getRentedVehicles();
        double totalRevenue = rentalSystem.calculateTotalRevenue();

        // Print reports
        System.out.println("Available Vehicles:");
        for (Vehicle availableVehicle : availableVehicles) {
            System.out.println(availableVehicle.getVIN() + " - " + availableVehicle.getBrand()
                    + " " + availableVehicle.getModel() + " (" + availableVehicle.getVehicleType() + ")");
        }

        System.out.println("\nRented Vehicles:");
        for (Vehicle rentedVehicle : rentedVehicles) {
            System.out.println(rentedVehicle.getVIN() + " - " + rentedVehicle.getBrand()
                    + " " + rentedVehicle.getModel() + " (" + rentedVehicle.getVehicleType() + ")");
        }

        System.out.println("\nTotal Revenue: $" + totalRevenue);
    }
}

