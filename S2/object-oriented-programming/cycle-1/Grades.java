import java.util.Scanner;
public class Grades{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter score:");
		int score=s.nextInt();
		if(score>=90) System.out.println("Grade : A");
		else if(score>=80) System.out.println("Grade : B");
		else if(score>=70) System.out.println("Grade : C");
		else if(score>=60) System.out.println("Grade : D");
		else if(score<60) System.out.println("Grade : F");
		else System.out.println("Invalid Score");
	}
}
