import java.util.Scanner;
class Vehicle {
    protected double mileage;
    protected double price;
    public Vehicle(double mileage, double price) {
        this.mileage = mileage;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
    }
}
class Car extends Vehicle {
    protected double owner_Cost;
    protected int warranty;
    protected int seat_Cap;
    protected String fuel_Type;

    public Car(double mileage, double price, double owner_Cost, int warranty, int seat_Cap, String fuel_Type) {
        super(mileage, price);
        this.owner_Cost = owner_Cost;
        this.warranty = warranty;
        this.seat_Cap = seat_Cap;
        this.fuel_Type = fuel_Type;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ownership Cost:" + owner_Cost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seat_Cap);
        System.out.println("Fuel Type: " + fuel_Type);
    }
}

class Maruthi extends Car {
    private String modelType;
    public Maruthi(double mileage, double price, double owner_Cost, int warranty, int seat_Cap, String fuel_Type, String modelType) {
        super(mileage, price, owner_Cost, warranty, seat_Cap, fuel_Type);
        this.modelType = modelType;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Model Type: " + modelType);
        System.out.println("******");
    }
}

public class Mainc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Maruthi cars: ");
        int n = scanner.nextInt();
        Maruthi[] cars = new Maruthi[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Car " + (i + 1) + ":");
            System.out.print("Mileage: ");
            double mileage = scanner.nextDouble();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Ownership Cost: ");
            double owner_Cost = scanner.nextDouble();
            System.out.print("Warranty: ");
            int warranty = scanner.nextInt();
            System.out.print("Seating Capacity: ");
            int seat_Cap = scanner.nextInt();
            scanner.nextLine();             
	    System.out.print("Fuel Type: ");
            String fuel_Type = scanner.nextLine();
            System.out.print("Model Type: ");
            String modelType = scanner.nextLine();

            cars[i] = new Maruthi(mileage, price, owner_Cost, warranty, seat_Cap, fuel_Type, modelType);
        }

        System.out.println("\nMaruthi Car Details:");
        for (Maruthi car : cars) {
            car.displayInfo();
        }

        scanner.close();
    }
}
