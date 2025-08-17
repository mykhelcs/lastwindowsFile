
package OOP;

public class PaypalPayment extends Payment {
    
    @Override
    public void processPayment(double amount) {
        if (!validatePayment(amount)) {
            System.out.println("Invalid Input");
        } else {
            
        double discount = super.calculateDiscount(amount);
        double discountedAmount = amount - discount;
        System.out.println("Paypal Payment: Original Amount: " + amount);
        System.out.println("Paypal Payment: Discount: " + discount);
        System.out.println("Paypal Payment: Discounted Amount: " + discountedAmount);
    }
}
}
