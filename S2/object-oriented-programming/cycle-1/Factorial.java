import java.util.Scanner;
public class Factorial{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int fact=1,n;
		System.out.print("Enter a number: ");
		n=s.nextInt();
		for(int i=1;i<=n;i++) fact*=i;
		System.out.println(n+"!="+fact);
	}
}
