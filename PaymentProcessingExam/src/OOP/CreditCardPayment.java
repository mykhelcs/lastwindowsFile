package OOP;

class CreditCardPayment extends Payment {

    @Override
    public void processPayment(double amount) {
        if (!validatePayment(amount)) {
            System.out.println("Invalid Input");
        }else {
        double discount = super.calculateDiscount(amount);
        double discountedAmount = amount - discount;
        System.out.println("Credit Card Payment: Original Amount: " + amount);
        System.out.println("Credit Card Payment: Discount: " + discount);
        System.out.println("Credit Card Payment: Discounted Amount: " + discountedAmount);
    }
}
}
