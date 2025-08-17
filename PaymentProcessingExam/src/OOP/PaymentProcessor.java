package OOP;

import java.util.Scanner;

public class PaymentProcessor {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean repeat;

            do {
                try {
                    boolean exit = false;
                    while (!exit) {
                        System.out.println("Select a Payment Method \n"
                                + "1. Credit Card\n"
                                + "2. Paypal \n"
                                + "3. Bank Transfer\n"
                                + "4. Exit\n");
                        int option = scanner.nextInt();

                        switch (option) {
                            case 1:
                                System.out.print("Enter Amount: ");
                                double ccpay = scanner.nextDouble();

                                CreditCardPayment cc = new CreditCardPayment();
                                cc.processPayment(ccpay);

                                break;
                            case 2:
                                System.out.print("Enter Amount: ");
                                double ppay = scanner.nextDouble();

                                PaypalPayment pp = new PaypalPayment();
                                pp.processPayment(ppay);

                                break;
                            case 3:
                                System.out.print("Enter Amount: ");
                                double btpay = scanner.nextDouble();

                                BankTransferPayment bt = new BankTransferPayment();
                                bt.processPayment(btpay);

                                break;

                            case 4:
                                exit = true;
                                break;
                            default:
                                System.out.println("Invalid option. Try again.");

                        }

                    }
                    System.out.println("Do you want to perform another transaction? True/False");
                    repeat = scanner.nextBoolean();

                } catch (Exception e) {
                    System.out.println("Invalid Input, please try again.");
                    scanner.nextLine();
                    repeat = true;
                }

            } while (repeat);
        }
    }

}
