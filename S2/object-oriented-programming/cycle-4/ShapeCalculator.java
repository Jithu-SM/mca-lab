import java.util.Scanner;
interface Shape{
	double area();
	double perimeter();
}
class Circle implements Shape{
	private double radius;
	Circle(double radius){
		this.radius=radius;
	}
	public double area(){
		return Math.PI*radius*radius;
	}
	public double perimeter(){
		return 2*Math.PI*radius;
	}
}
class Rectangle implements Shape{
	private double length,width;
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	public double area(){
		return length*width;
	}
	public double perimeter(){
		return 2*(length+width);
	}
}
public class ShapeCalculator{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int choice;
		do{
			System.out.println("Menu:\n1. Circle \n2. Rectangle \n3. Exit \nEnter your choice:");
			choice=s.nextInt();
			switch(choice){
				case 1:System.out.print("Enter radius: ");
					double radius=s.nextDouble();
					Circle circle=new Circle(radius);
					System.out.println("Area: "+circle.area());
					System.out.println("Perimeter: "+circle.perimeter());
					break;
				case 2:System.out.print("Enter length: ");
					double length=s.nextDouble();
					System.out.print("Enter width: ");
					double width=s.nextDouble();
					Rectangle rectangle=new Rectangle(length,width);
					System.out.println("Area: "+rectangle.area());
					System.out.println("Perimeter: "+rectangle.perimeter());
					break;
				case 3:System.out.println("Exiting program...");
					break;
				default:System.out.println("Invalid choice!");
			}
		}while(choice!=3);
	}
}

