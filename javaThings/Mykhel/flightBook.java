
package mykhel;

import java.util.LinkedList;
import java.util.Scanner;


public class flightBook {
    public static Scanner flightBooking(Scanner scan) {
        LinkedList<String> flightReceipts = new LinkedList<>();
        int distanceTravel, classTraveltype;
        int roundTrip;
        double total, discountedTotal, rate, discount;
        System.out.println("You're in Flight Booking; \nwhat type of class do you want to travel?\n");
        System.out.println("1. Economy");
        System.out.println("2. Business");
        System.out.println("3. First Class");
        System.out.println("4. Back");

        classTraveltype = scan.nextInt();

        switch (classTraveltype) {
            case 1:
                rate = 5000;
                discount = 0.05;
                System.out.println("How much distance do you want to travel?");
                distanceTravel = scan.nextInt();
                total = distanceTravel * rate;
                System.out.println("Is this round trip? \n1. Yes \n2. No");
                roundTrip = scan.nextInt();
                if (roundTrip == 1) {
                    discountedTotal = rate * discount;
                    total = total - discountedTotal;
                    flightReceipts.add("Car Type: Economy\n" + "Number of days to rent: " + distanceTravel + "\nTotal Amount: " + total);
                    System.out.println(flightReceipts);
                } else {
                    flightReceipts.add("Car Type: Economy\n" + "Number of days to rent: " + distanceTravel + "\nTotal Amount: " + total);
                    System.out.println(flightReceipts);

                }
                break;
            case 2:
                rate = 10000;
                discount = 0.05;
                System.out.println("How much distance do you want to travel?");
                distanceTravel = scan.nextInt();
                total = distanceTravel * rate;
                System.out.println("Is this round trip? type Yes/No");
                roundTrip = scan.nextInt();
                if (roundTrip == 1) {
                    discountedTotal = rate * discount;
                    total = total - discountedTotal;
                    flightReceipts.add("Car Type: Business\n" + "Number of days to rent: " + distanceTravel + "\nTotal Amount: " + total);
                    System.out.println(flightReceipts);
                } else {
                    flightReceipts.add("Car Type: Business\n" + "Number of days to rent: " + distanceTravel + "\nTotal Amount: " + total);
                    System.out.println(flightReceipts);

                }
                break;
            case 3:
                rate = 15000;
                discount = 0.05;
                System.out.println("How much distance do you want to travel?");
                distanceTravel = scan.nextInt();
                total = distanceTravel * rate;
                System.out.println("Is this round trip? type Yes/No");
                roundTrip = scan.nextInt();
                if (roundTrip == 1) {
                    discountedTotal = rate * discount;
                    total = total - discountedTotal;
                    flightReceipts.add("Car Type: First Class\n" + "Number of days to rent: " + distanceTravel + "\nTotal Amount: " + total);
                    System.out.println(flightReceipts);
                } else {
                    flightReceipts.add("Car Type: First Class\n" + "Number of days to rent: " + distanceTravel + "\nTotal Amount: " + total);
                    System.out.println(flightReceipts);

                }
                break;
            case 4:
                return scan;
            default:
                System.out.println("Invalid Input");
                System.exit(0);
        }
        return scan;
    }

}
