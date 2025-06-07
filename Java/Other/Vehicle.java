public class Vehicle {
    String engineType;
    int numberOfWheels;
    String color;

    public Vehicle() {
        System.out.println("Vehicle: Default constructor called");
        this.engineType = "Generic";
        this.numberOfWheels = 4;
    }

    public Vehicle(String engineType) {
        this(); // Calls the default constructor first
        System.out.println("Vehicle: Constructor with engineType called, Engine type: " + engineType);
        this.engineType = engineType;
    }

    public Vehicle(String engineType, int numberOfWheels, String color) {
        this(engineType); // Calls the constructor with engineType first
        System.out.println("Vehicle: Constructor with engineType, numberOfWheels and color called, Wheels: " + numberOfWheels + ", Color: " + color);
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }

    public static void main(String[] args) {
        System.out.println("Creating a default Vehicle:");
        Vehicle vehicle1 = new Vehicle();
        System.out.println("Vehicle 1 - Engine: " + vehicle1.engineType + ", Wheels: " + vehicle1.numberOfWheels + ", Color: " + vehicle1.color);
        System.out.println();

        System.out.println("Creating a Vehicle with engine type:");
        Vehicle vehicle2 = new Vehicle("Electric");
        System.out.println("Vehicle 2 - Engine: " + vehicle2.engineType + ", Wheels: " + vehicle2.numberOfWheels + ", Color: " + vehicle2.color);
        System.out.println();

        System.out.println("Creating a Vehicle with all details:");
        Vehicle vehicle3 = new Vehicle("Petrol", 2, "Red");
        System.out.println("Vehicle 3 - Engine: " + vehicle3.engineType + ", Wheels: " + vehicle3.numberOfWheels + ", Color: " + vehicle3.color);
    }
}