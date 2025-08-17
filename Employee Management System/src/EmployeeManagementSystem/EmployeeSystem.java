package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeSystem {

    public static void main(String[] args) {
        boolean repeat;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String companyName = scanner.nextLine();
        Company myCompany = new Company(companyName);

        do {
            try {

                boolean exit = false;
                while (!exit) {
                    System.out.println("\nChoose an action you want to proceed: \n1. Add Departments \n2. Select Departments to add Employees \n3. Display Company Information \n4.Exit");
                    int option = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (option) {

                        case 1:
                            while (true) {
                                System.out.print("Enter department ID: ");
                                int deptId = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                System.out.print("Enter department name: ");
                                String deptName = scanner.nextLine();

                                Department department = new Department(deptId, deptName);
                                myCompany.addDepartment(department);

                                System.out.print("Add another department? (yes/no): ");
                                if (!scanner.nextLine().equalsIgnoreCase("yes")) {
                                    break; // Exit department-adding loop
                                }
                            }
                            break; // Exit Case 1 and return to menu
                        case 2:
                            if (myCompany.getDepartments().isEmpty()) {
                                System.out.println("No departments available. Please add a department first.");
                                break;
                            }

                            System.out.println("Select a department by ID:");
                            for (Department dept : myCompany.getDepartments()) {
                                System.out.println(dept.getDeptId() + ". " + dept.getDeptName());
                            }

                            System.out.print("Enter Department ID: ");
                            int deptId2 = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                            Department selectedDept = myCompany.getDepartmentById(deptId2);
                            if (selectedDept == null) {
                                System.out.println("Invalid department ID. Try again.");
                                break;
                            }
                            System.out.print("Enter Employee ID: ");
                            int empId = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            System.out.print("Enter Employee Name: ");
                            String empName = scanner.nextLine();
                            System.out.print("Enter Employee Salary: ");
                            double empSalary = scanner.nextDouble();
                            scanner.nextLine(); // Consume newline

                            Employee employee = new Employee(empId, empName, empSalary);
                            selectedDept.addEmployee(employee);
                            break;

                        case 3:
                            myCompany.displayCompanyDetails();
                            break;

                        case 4:
                            System.exit(0);
                            break;

                    }

                }
                System.out.println("Are you sure you want to exit? (Yes/No)");
                String response = scanner.next().trim();
                repeat = response.equalsIgnoreCase("yes");

            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
                scanner.nextLine(); // Clear input buffer
                repeat = true;
            }
        } while (repeat);
    }
}
