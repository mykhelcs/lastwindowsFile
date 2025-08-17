package OOP;

public abstract class Payment implements PaymentGateway {

    @Override
    public boolean validatePayment(double amount) {
        return amount > 0;
    }

    public double calculateDiscount(double amount) {
        if (amount >= 1000) {
            return amount * 0.1;
        } else if (amount >= 500) {
            return amount * 0.05;

        } else {
            System.out.println("No discount: " + amount);
        }
        return 0;
    }

    public abstract void processPayment(double amount);

}
