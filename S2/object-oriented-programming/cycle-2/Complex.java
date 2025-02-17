import java.util.Scanner;
public class Complex{
	double real,imag;
	public Complex(double real, double imag){
		this.real=real;
		this.imag=imag;
	}
	public Complex add(Complex other){
		double real=this.real+other.real;
		double imag=this.imag+other.imag;
		Complex sum=new Complex(real,imag);
		return sum;
	}
	public Complex multiply(Complex other){
                double real=(this.real*other.real)-(this.imag*other.imag);
                double imag=(this.real*other.imag)+(this.imag*other.real);
                Complex pro=new Complex(real,imag);
                return pro;
	}
	public void display(){
		System.out.println(this.real+" + i"+this.imag);
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two complex numbers:");
		System.out.println("Enter real part:");
		double real1=s.nextDouble();
		System.out.println("Enter imaginary part:");
		double imag1=s.nextDouble();
		Complex c1=new Complex(real1,imag1);
		System.out.println("Enter real part:");
                double real2=s.nextDouble();
		System.out.println("Enter imaginary part:");
                double imag2=s.nextDouble();
		Complex c2=new Complex(real2,imag2);
		Complex sum=c1.add(c2);
		Complex pro=c1.multiply(c2);
		System.out.print("Complex no 1: ");
		c1.display();
		System.out.print("Complex no 2: ");
		c2.display();
		System.out.print("Sum: ");
		sum.display();
		System.out.print("Product: ");
		pro.display();
	}
}
