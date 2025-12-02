package AbstractANDToString;

abstract class Vehicle {

    String brand;
    String model;
    String vehicleNumber;
    String color;
    double price;
    int speed;
    String fuelType;
    double mileage;
    int yearOfManufacture;

    Vehicle() // default constructor
    {
        System.out.println("Vehicle default constructor");
        brand = "Unknown";
        model = "Unknown";
        vehicleNumber = "Not Registered";
        color = "White";
        price = 0.0;
        speed = 0;
        fuelType = "Unknown";
        mileage = 0.0;
        yearOfManufacture = 2025;
    }

    Vehicle(String brand, String model, String vehicleNumber, String color,
            double price, int speed, String fuelType, double mileage,
            int yearOfManufacture) // parameterized constructor
    {
        System.out.println("Vehicle parameterized constructor");
        this.brand = brand;
        this.model = model;
        this.vehicleNumber = vehicleNumber;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.yearOfManufacture = yearOfManufacture;
    }

    // abstract method
    abstract void brake();

    // **************** GETTERS – SETTERS ****************

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getVehicleNumber() {
        return vehicleNumber;
    }

    void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    String getFuelType() {
        return fuelType;
    }

    void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    double getMileage() {
        return mileage;
    }

    void setMileage(double mileage) {
        this.mileage = mileage;
    }

    int getYearOfManufacture() {
        return yearOfManufacture;
    }

    void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String toString() {
        return "\nBrand::" + brand + " Model::" + model + " Vehicle No::" + vehicleNumber +
               " Color::" + color + " Price::" + price + " Speed::" + speed +
               " Fuel::" + fuelType + " Mileage::" + mileage +
               " Year::" + yearOfManufacture;
    }
}

/////////////////////////////////////////////////////

class Car extends Vehicle {

    int seats;
    boolean sunroof;

    Car() {
        super();
        System.out.println("Car default constructor");
        seats = 4;
        sunroof = true;
    }

    Car(String brand, String model, String vehicleNumber, String color,
        double price, int speed, String fuelType, double mileage,
        int yearOfManufacture, int seats, boolean sunroof) {

        super(brand, model, vehicleNumber, color, price, speed,
              fuelType, mileage, yearOfManufacture);
        System.out.println("Car parameterized constructor");
        this.seats = seats;
        this.sunroof = sunroof;
    }

    void brake() {
        System.out.println("Car brake : Drum Brake");
    }

    // GETTERS – SETTERS  
    int getSeats() {
        return seats;
    }

    void setSeats(int seats) {
        this.seats = seats;
    }

    boolean isSunroof() {
        return sunroof;
    }

    void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public String toString() {
        return super.toString() + " Seats::" + seats + " Sunroof::" + sunroof;
    }
}

/////////////////////////////////////////////////////

class Bike extends Vehicle {

    int engineCC;
    boolean abs;

    Bike() {
        super();
        System.out.println("Bike default constructor");
        engineCC = 46;
        abs = true;
    }

    Bike(String brand, String model, String vehicleNumber, String color,
         double price, int speed, String fuelType, double mileage,
         int yearOfManufacture, int engineCC, boolean abs) {

        super(brand, model, vehicleNumber, color, price, speed,
              fuelType, mileage, yearOfManufacture);
        System.out.println("Bike parameterized constructor");
        this.engineCC = engineCC;
        this.abs = abs;
    }

    void brake() {
        System.out.println("Bike brake : Air Brake");
    }

    // GETTERS – SETTERS  
    int getEngineCC() {
        return engineCC;
    }

    void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    boolean isAbs() {
        return abs;
    }

    void setAbs(boolean abs) {
        this.abs = abs;
    }

    public String toString() {
        return super.toString() + " EngineCC::" + engineCC + " ABS::" + abs;
    }
}

/////////////////////////////////////////////////////

class Truck extends Vehicle {

    double loadCapacity;
    int noOfWheels;

    Truck() {
        super();
        System.out.println("Truck default constructor");
        loadCapacity = 4.8;
        noOfWheels = 12;
    }

    Truck(String brand, String model, String vehicleNumber, String color,
          double price, int speed, String fuelType, double mileage,
          int yearOfManufacture, double loadCapacity, int noOfWheels) {

        super(brand, model, vehicleNumber, color, price, speed,
              fuelType, mileage, yearOfManufacture);
        System.out.println("Truck parameterized constructor");
        this.loadCapacity = loadCapacity;
        this.noOfWheels = noOfWheels;
    }

    void brake() {
        System.out.println("Truck brake : Disk Brake");
    }

    // GETTERS – SETTERS  
    double getLoadCapacity() {
        return loadCapacity;
    }

    void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    int getNoOfWheels() {
        return noOfWheels;
    }

    void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String toString() {
        return super.toString() + " LoadCapacity::" + loadCapacity +
               " Wheels::" + noOfWheels;
    }
}

/////////////////////////////////////////////////////

class DemoVehicle {
    public static void main(String[] args) {

        Vehicle v1; // Generic Reference

        v1 = new Car("Tata", "Nexon", "MH12AB1234", "Blue",
                     1200000, 180, "Petrol", 18.5, 2024,
                     5, true); // Upcasting

        System.out.println(v1);
        System.out.println(v1.toString());
        System.out.println("\n");

        v1 = new Bike("Yamaha", "R15", "MH09XY4321", "Black",
                      165000, 150, "Petrol", 45.0, 2023,
                      155, true); // Upcasting

        System.out.println(v1);
        System.out.println(v1.toString());
        System.out.println("\n");

        v1 = new Truck("Ashok Leyland", "CargoX", "MH14TR9087", "White",
                       2500000, 120, "Diesel", 8.0, 2022,
                       16.5, 12); // Upcasting

        System.out.println(v1);
        System.out.println(v1.toString());
    }
}
