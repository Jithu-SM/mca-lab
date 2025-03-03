import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
interface Benefits{
	double calculateBenefits();
}
abstract class Employee{
	protected String name;
	protected double salary;
	Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	abstract double calculateSalary();
	public void displayDetails(){
		System.out.println("\nEmployee Details:");
		System.out.println("Name: "+name);
		System.out.println("Total Salary: "+calculateSalary());
	}
}
class Manager extends Employee implements Benefits{
	private double bonus;
	Manager(String name,double salary,double bonus){
		super(name,salary);
		this.bonus=bonus;
	}
	double calculateSalary(){
		return salary+bonus;
	}
	public double calculateBenefits(){
		return 5000;
	}
	public void assignProject(String projectName){
		System.out.println(name+" is assigned to project: "+projectName);
	}
	public void assignProject(String projectName,int teamMembers){
		System.out.println(name+" is assigned to project: "+projectName+" with "+teamMembers+" team members.");
	}
}
class Developer extends Employee implements Benefits{
	private int experience;
	Developer(String name,double salary,int experience){
		super(name,salary);
		this.experience=experience;
	}
	double calculateSalary(){
		return salary+(experience*1000);
	}
	public double calculateBenefits(){
		return experience*500;
	}
}
public class EmployeeManagement{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		List<Employee> employees=new ArrayList<>();
		int choice;
		do{
			System.out.println("\nMenu:");
			System.out.println("1. Add Manager");
			System.out.println("2. Add Developer");
			System.out.println("3. Display Employees");
			System.out.println("4. Assign Project to Manager");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice=s.nextInt();
			switch(choice){
				case 1:System.out.print("Enter Manager Name: ");
					String mName=s.next();
					System.out.print("Enter Salary: ");
					double mSalary=s.nextDouble();
					System.out.print("Enter Bonus: ");
					double mBonus=s.nextDouble();
					employees.add(new Manager(mName,mSalary,mBonus));
					System.out.println("Manager added successfully!");
					break;
				case 2:System.out.print("Enter Developer Name: ");
					String dName=s.next();
					System.out.print("Enter Salary: ");
					double dSalary=s.nextDouble();
					System.out.print("Enter Experience (years): ");
					int dExperience=s.nextInt();
					employees.add(new Developer(dName,dSalary,dExperience));
					System.out.println("Developer added successfully!");
					break;
				case 3:if(employees.isEmpty()) System.out.println("No employees to display.");
					else{
						for(Employee emp:employees){
							emp.displayDetails();
							if(emp instanceof Benefits) System.out.println("Benefits: "+((Benefits) emp).calculateBenefits());
							System.out.println();
						}
					}
					break;
				case 4:System.out.print("Enter Manager Name: ");
					String managerName=s.next();
					boolean found=false;
					for(Employee emp:employees){
						if(emp instanceof Manager && emp.name.equals(managerName)) {
							Manager manager=(Manager) emp;
							System.out.print("Enter Project Name: ");
							String projectName=s.next();
							System.out.print("Enter Number of Team Members (0 if not applicable): ");
							int teamMembers=s.nextInt();
							if(teamMembers>0) manager.assignProject(projectName,teamMembers);
							else manager.assignProject(projectName);
							found=true;
							break;
						}
					}
					if(!found) System.out.println("Manager not found!");
					break;
				case 5:System.out.println("Exiting program...");
					break;
				default:System.out.println("Invalid choice! Try again.");
			}
		}while(choice!=5);
	}
}
