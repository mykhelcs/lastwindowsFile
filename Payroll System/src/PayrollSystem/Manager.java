package PayrollSystem;

public class Manager extends Employee {

    protected String department;

    public Manager(String name, int employeeID, double baseSalary, String department) {
        super(name, employeeID, baseSalary);
        this.department = department;
    }
    
    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }
    
    public void displayManagerDetails() {
        System.out.println("Manager: ");
        super.displayEmployeeDetails();
        System.out.println("Employee Salary: " + this.baseSalary);
        System.out.println("Employee Department: " + this.department);
    }

    
}
