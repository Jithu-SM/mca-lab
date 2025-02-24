import java.util.Scanner;
import java.util.ArrayList;
public class StringIndex{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		ArrayList<String> str=new ArrayList<>();
		System.out.println("Eneter the number of strings: ");
		int n = s.nextInt();
		System.out.println("Eneter the strings: ");
		for(int i = 0; i < n; i++)
			str.add(s.next());
		System.out.println("Eneter the string to search: ");
		String key=s.next();
		boolean found=false;
		for(int i = 0; i < n; i++){
			if(str.get(i).equals(key)){
				System.out.println("Found at index: "+i);
				found=true;
				break;
			}
		}
		if(!found) System.out.println("String not found!");
	}
}

