package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private int deptId;
    private String deptName;
    private List<Employee> employees;

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Department: " + this.deptName);
        for (Employee emp : this.employees) {
            emp.displayEmployee();
        }
    }
}
