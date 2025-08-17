package PayrollSystem;

public class ContractEmployee extends Employee {

    protected final double contractAmount = 3000;

    public ContractEmployee(String name, int employeeID, double contractAmount) {
        super(name, employeeID, contractAmount);
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
    
    public void displayContractEmployee(){
        System.out.println("Contract Employee:");
        super.displayEmployeeDetails();
        System.out.println("Contract Salary Amount:" + this.contractAmount);
    }
}
