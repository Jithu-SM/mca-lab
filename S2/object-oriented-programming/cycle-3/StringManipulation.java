import java.util.Scanner;
public class StringManipulation{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=s.next();
		System.out.println("length: "+str.length());
		System.out.println("uppercase: "+str.toUpperCase());
		System.out.println("lowercase: "+str.toLowerCase());
		System.out.println("Enter an index to extract: ");
		int i=s.nextInt();
		System.out.println("character at "+i+" is "+str.charAt(i));
		System.out.println("Enter a start and end index to substring: ");
		int start=s.nextInt();
		int end=s.nextInt();
		System.out.println("substring: "+str.substring(start,end));
	}
}
