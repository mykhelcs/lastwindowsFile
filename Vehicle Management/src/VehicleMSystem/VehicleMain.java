package VehicleMSystem;

import java.util.Scanner;

public class VehicleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        Bike bike = new Bike();
        ElectricTruck truck = new ElectricTruck();
        boolean repeat;
        do {
            boolean exit = false;
            while (!exit) {
                System.out.println("\nChoose the type of Vehicle:\n1. Fueled Vehicle \n2. Pedal Vehicle \n3. Electric Vehicle \n4. None");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (option) {

                    case 1:
                        System.out.print("Enter the Vehicle Name:");
                        String fname = scanner.nextLine();
                        System.out.print("Enter the Vehicle Speed:");
                        int fspeed = scanner.nextInt();
                        System.out.print("Enter the Vehicle's Fuel Capacity: ");
                        int fcapacity = scanner.nextInt();

                        car.displayInfo(fname, fspeed, fcapacity);
                        car.calculateRange();
                        car.start();
                        break; // Exit Case 1 and return to menu
                    case 2:
                        System.out.print("Enter the Vehicle Name:");
                        String pname = scanner.nextLine();
                        System.out.print("Enter the Vehicle Speed:");
                        int pspeed = scanner.nextInt();
                        System.out.print("Enter the Vehicle's Fuel Capacity: ");
                        int pfcapacity = scanner.nextInt();

                        bike.displayInfo(pname, pspeed, pfcapacity);
                        bike.calculateRange();
                        bike.start();
                        break;

                    case 3:
                        System.out.print("Enter the Vehicle Name:");
                        String vname = scanner.nextLine();
                        System.out.print("Enter the Vehicle Speed:");
                        int vspeed = scanner.nextInt();
                        System.out.print("Enter the Vehicle's Fuel Capacity: ");
                        int vfcapacity = scanner.nextInt();

                        truck.displayInfo(vname, vspeed, vfcapacity);
                        truck.calculateRange();
                        truck.start();
                        truck.chargeBattery();
                        break;

                    case 4:
                        System.exit(0);
                        break;

                }

            }
            System.out.println("Are you sure you want to exit? (Yes/No)");
            String response = scanner.next().trim();
            repeat = response.equalsIgnoreCase("yes");
        } while (repeat);

    }
}
