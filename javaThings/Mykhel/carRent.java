
package mykhel;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class carRent {
    public static Scanner carRent(Scanner scan) {
        LinkedList<String> customerReceipts = new LinkedList<>();
        int day, car;
        double total, discountedTotal, rate, discount;
        System.out.println("You're in Car Renting; \nwhat type of Car do you want?\n");
        System.out.println("1. Economy");
        System.out.println("2. Compact");
        System.out.println("3. Luxury");
        System.out.println("4. Back");

        car = scan.nextInt();

        switch (car) {
            case 1:
                rate = 2000;
                discount = 0.05;
                System.out.println("How many days do you plan to rent?");
                day = scan.nextInt();
                total = day * rate;
                if (day > 7) {
                    discountedTotal = rate * discount;
                    total = total - discountedTotal;
                    customerReceipts.add("Car Type: Economy\n" + "Number of days to rent: " + day + "\nTotal Amount: " + total);
                    System.out.println(customerReceipts);
                } else {
                    customerReceipts.add("Car Type: Economy\n" + "Number of days to rent: " + day + "\nTotal Amount: " + total);
                    System.out.println(customerReceipts);

                }
                break;
            case 2:
                rate = 2500;
                discount = 0.05;
                System.out.println("How many days do you plan to rent?");
                day = scan.nextInt();
                total = day * rate;
                if (day > 7) {
                    discountedTotal = rate * discount;
                    total = total - discountedTotal;
                    customerReceipts.add("Car Type: Compact\n" + "Number of days to rent: " + day + "\nTotal Amount: " + total);
                    System.out.println(customerReceipts);
                } else {
                    customerReceipts.add("Car Type: Compact\n" + "Number of days to rent: " + day + "\nTotal Amount: " + total);
                    System.out.println(customerReceipts);

                }
                break;
            case 3:
                rate = 5000;
                discount = 0.1;
                System.out.println("How many days do you plan to rent?");
                day = scan.nextInt();
                total = day * rate;
                if (day > 7) {
                    discountedTotal = rate * discount;
                    total = total - discountedTotal;
                    customerReceipts.add("Car Type: Luxury\n" + "Number of days to rent: " + day + "\nTotal Amount: " + total);
                    System.out.println(customerReceipts);
                } else {
                    customerReceipts.add("Car Type: Economy\n" + "Number of days to rent: " + day + "\nTotal Amount: " + total);
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
