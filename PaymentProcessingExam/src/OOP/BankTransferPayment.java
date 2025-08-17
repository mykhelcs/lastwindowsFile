
package OOP;

public class BankTransferPayment extends Payment {
    
        @Override
    public void processPayment(double amount) {
        if (!validatePayment(amount)) {
            System.out.println("Invalid Input");
        } else {
            
        double discount = super.calculateDiscount(amount);
        double discountedAmount = amount - discount;
        System.out.println("Bank Transfer Payment: Original Amount: " + amount);
        System.out.println("Bank Transfer Payment: Discount: " + discount);
        System.out.println("Bank Transfer Payment: Discounted Amount: " + discountedAmount);
    }
}
}
