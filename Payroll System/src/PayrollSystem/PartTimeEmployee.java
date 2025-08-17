
package PayrollSystem;


public class PartTimeEmployee extends Employee{
    
    protected int hoursWorked;
    
     public PartTimeEmployee (String name, int employeeID, double baseSalary, int hoursWorked){
        super(name, employeeID, baseSalary);
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double calculateSalary() {
        return super.baseSalary * this.hoursWorked;
    }
    
    public void displayPartTimeEmployee() {
        System.out.println("Part-Time Employee: ");
        super.displayEmployeeDetails();
        System.out.println("Part Time Employee Hours Worked: " + this.hoursWorked);
        System.out.println("Part Time Employee Salary: " + this.calculateSalary());
    }
}
