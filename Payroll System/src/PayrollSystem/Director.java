
package PayrollSystem;


public class Director extends Manager{
    protected double stockOptions;
    
    public Director(String name, int employeeID, double baseSalary, String department, double stockOptions) {
        super(name, employeeID, baseSalary, department);
        this.stockOptions = stockOptions;
    }
    
    @Override
    public double calculateSalary(){
        return super.calculateSalary();
    }
    
    public void displayDirectorDetails() {
        System.out.println("Director:");
        super.displayManagerDetails();
        System.out.println("Stock Options Bonus: " + this.stockOptions);
    }
    
}
