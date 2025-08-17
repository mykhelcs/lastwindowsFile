package mykhel;


import java.util.LinkedList;
import java.util.Scanner;


public class hotelBooking {
     
    public static Scanner hotel(Scanner scan) {
        LinkedList<String> customerReceipts = new LinkedList<>();
        int nights, roomType;
        double total, discountedTotal, rate, discount;
        System.out.println("You're in Hotel Booking; \nwhat type of room do you want?\n");
        System.out.println("1. Single");
        System.out.println("2. Double");
        System.out.println("3. Suite");
        System.out.println("4. Back");

        roomType = scan.nextInt();

        switch (roomType) {
            case 1:
                rate = 1000;
                discount = 0.1;
                System.out.println("How many nights do you plan to stay?");
                nights = scan.nextInt();
                total = nights * rate;
                if (nights > 3) {
                    discountedTotal = rate * discount;
                    total = total - discountedTotal;
                    customerReceipts.add("Room Type: Single\n" + "Number of nights: " + nights + "\nTotal Amount: " + total);
                    System.out.println(customerReceipts);
                } else {
                    customerReceipts.add("Room Type: Single\n" + "Number of nights: " + nights + "\nTotal Amount: " + total);
                    System.out.println(customerReceipts);
                }
                break;
            case 2:
                rate = 1500;
                discount = 0.1;
                System.out.println("How many nights do you plan to stay?");
                nights = scan.nextInt();
                total = nights * rate;
                if (nights > 3) {
                    discountedTotal = rate * discount;
                    total = total - discountedTotal;
                    customerReceipts.add("Room Type: Double\n" + "Number of nights: " + nights + "\nTotal Amount: " + total);
                    System.out.println(customerReceipts);
                } else {
                    customerReceipts.add("Room Type: Double\n" + "Number of nights: " + nights + "\nTotal Amount: " + total);
                    System.out.println(customerReceipts);
                }
                break;
            case 3:
                rate = 2500;
                discount = 0.1;
                System.out.println("How many nights do you plan to stay?");
                nights = scan.nextInt();
                total = nights * rate;
                if (nights > 3) {
                    discountedTotal = rate * discount;
                    total = total - discountedTotal;
                    customerReceipts.add("Room Type: Suite\n" + "Number of nights: " + nights + "\nTotal Amount: " + total);
                    System.out.println(customerReceipts);
                } else {
                    customerReceipts.add("Room Type: Suite\n" + "Number of nights: " + nights + "\nTotal Amount: " + total);
                    System.out.println(customerReceipts);
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
