
package VehicleMSystem;

public class Car extends Vehicle{
    
    @Override
    void start() {
        System.out.println("The car starts with a key!");
    }
    
     void displayInfo(String name, int speed, int fuelCapacity) {
        this.name = name;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        System.out.println("Vehicle: " + name);
        System.out.println("Speed: " + speed + "km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + "liters");

    }
}
