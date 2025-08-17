
package PayrollSystem;


public class FullTimeEmployee extends Employee{
    protected double bonus;
    
    public FullTimeEmployee (String name, int employeeID, double baseSalary, double bonus){
        super(name, employeeID, baseSalary);
        this.bonus = bonus;
    }
    
    @Override
    public double calculateSalary() {
        return super.baseSalary += this.bonus;
    }
    
    public void displayFullTimeEmployee(){
        System.out.println("Full-Time Employee:");
        super.displayEmployeeDetails();
        System.out.println("Employee Salary: " + this.calculateSalary());
    }
}
