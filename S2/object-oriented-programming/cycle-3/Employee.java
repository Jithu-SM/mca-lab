import java.util.Scanner;
import java.util.ArrayList;
class Employee{
	int empNumber;
	String name;
	double salary;
	public Employee(int empNumber, String name, double salary){
        	this.empNumber = empNumber;
        	this.name = name;
        	this.salary = salary;
	}
	public static void main(String args[]){
	       	Scanner s = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();
		System.out.println("Enter the number of Employees: ");
		int n=s.nextInt();
        	for (int i = 0; i < n; i++){
            		System.out.println("Enter details for Employee " + (i + 1) + ":");
            		System.out.print("Employee Number: ");
            		int empNumber = s.nextInt();
            		System.out.print("Employee Name: ");
            		String name = s.next();
            		System.out.print("Employee Salary: ");
            		double salary = s.nextDouble();
			employees.add(new Employee(empNumber, name, salary));
		}
        	System.out.print("\nEnter Employee Number to search: ");
        	int searchEmpNumber = s.nextInt();
        	boolean found = false;
        	for (Employee emp : employees) {
            		if (emp.empNumber == searchEmpNumber) {
                		System.out.println("\nEmployee Found:");
                		System.out.println("Employee Number: " + emp.empNumber);
                		System.out.println("Employee Name: " + emp.name);
                		System.out.println("Employee Salary: " + emp.salary);
                		found = true;
                		break;
            		}
        	}
        	if (!found) System.out.println("Employee with Employee Number " + searchEmpNumber + " not found.");
    }
}

