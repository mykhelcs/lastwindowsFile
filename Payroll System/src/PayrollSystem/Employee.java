package PayrollSystem;

public class Employee implements Taxable, Payable {

    protected String name;
    protected int employeeID;
    protected double baseSalary;

    public Employee(String name, int employeeID, double baseSalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return this.baseSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.employeeID);
    }
    @Override
    public void calculateTax() {

    }
    @Override
    public void processPayment() {

    }
}
