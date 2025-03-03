import Graphics.*;
import java.util.Scanner;
public class GraphicsPackage{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int choice;
		do{
			System.out.println("\nMenu:");
			System.out.println("1. Rectangle");
			System.out.println("2. Triangle");
			System.out.println("3. Square");
			System.out.println("4. Circle");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice=s.nextInt();
			switch(choice){
				case 1:System.out.print("Enter length: ");
					double length=s.nextDouble();
					System.out.print("Enter width: ");
					double width=s.nextDouble();
					Rectangle rectangle=new Rectangle(length, width);
					System.out.println("Area: "+rectangle.area());
					break;
				case 2:System.out.print("Enter base: ");
					double base=s.nextDouble();
					System.out.print("Enter height: ");
					double height=s.nextDouble();
					Triangle triangle=new Triangle(base, height);
					System.out.println("Area: "+triangle.area());
					break;
				case 3:System.out.print("Enter side: ");
					double side=s.nextDouble();
					Square square=new Square(side);
					System.out.println("Area: "+square.area());
					break;
				case 4:System.out.print("Enter radius: ");
					double radius=s.nextDouble();
					Circle circle=new Circle(radius);
					System.out.println("Area: "+circle.area());
					break;
				case 5:System.out.println("Exiting program...");
					break;
				default:System.out.println("Invalid choice! Try again.");
			}
		}while(choice!=5);
	}
}
