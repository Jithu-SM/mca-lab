import java.util.Scanner;
public class SumNatural{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int sum=0,n;
		n=s.nextInt();
		for(int i=1;i<=n;i++) sum+=i;
		System.out.println("Sum of first "+n+"number is "+sum);
	}
}
