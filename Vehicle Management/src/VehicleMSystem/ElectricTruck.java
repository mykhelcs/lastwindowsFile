package VehicleMSystem;

public class ElectricTruck extends Vehicle implements ElectricVehicle {

    @Override
    void start() {
        System.out.println(name +" starts with a button!");
    }

    @Override
    public void chargeBattery() {
        System.out.println(name + "is charging with a button!");
    }

    @Override
    public void calculateRange() {
        System.out.println("Estimated Range of " + name + " is 150km in a full charge.");
        
    }
    
    @Override
     void displayInfo(String name, int speed, int fuelCapacity) {
        this.name = name;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        System.out.println("Vehicle: " + name);
        System.out.println("Speed: " + speed + "km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + "liters");

    }

}
