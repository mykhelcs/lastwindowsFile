package VehicleMSystem;

abstract class Vehicle {

    protected String name;
    protected int speed;
    protected int fuelCapacity;

    void start() {

    }

    void displayInfo(String name, int speed, int fuelCapacity) {


    }

    void calculateRange() {
        int estimate = fuelCapacity * 10;
        System.out.println("Estimated Range: " + estimate);
    }

}
