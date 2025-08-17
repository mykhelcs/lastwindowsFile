package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Department getDepartmentById(int id) {
        for (Department d : departments) {
            if (d.getDeptId() == id) {
                return d;
            }
        }
        return null;
    }
    
     public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayEmployees();
            System.out.println();
        }
    }
}
