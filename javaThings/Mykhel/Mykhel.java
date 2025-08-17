package mykhel;

import java.util.Scanner;

public class Mykhel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        hotelBooking callHotel = new hotelBooking();
        carRent rent = new carRent();
        flightBook flight = new flightBook();

        do {
            System.out.println("Which problem do you want to explore?");
            System.out.println("1. Hotel Booking");
            System.out.println("2. Car Rent");
            System.out.println("3. Flight Booking");
            System.out.println("4. I don't want any problem");
            System.out.print("Enter an exploration number: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    callHotel.hotel(scan);
                    break;
                case 2:
                    rent.carRent(scan);
                    break;
                case 3:
                    flight.flightBooking(scan);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.exit(0);
            }
        } while (true);
    }
}