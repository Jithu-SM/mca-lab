import java.util.Scanner;

public class EvenOdd{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		if(n%2==0) System.out.println(n+" is an even number");
		else System.out.println(n+" is an odd number");
	}
}
