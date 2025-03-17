import java.io.*;
import java.util.Scanner;
class AuthenticationException extends Exception{
	public AuthenticationException(String message){
		super(message);
	}
}
public class ExceptionHandlingDemo{
	private static final String USERNAME="admin";
	private static final String PASSWORD = "admin123";
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the filename to read: ");
		String filename=s.next();
		readFile(filename);
		System.out.print("Enter username: ");
		String username=s.next();
		System.out.print("Enter password: ");
		String password=s.next();
		try{
			authenticate(username,password);
			System.out.println("Authentication successful! Access granted.");
		}catch(AuthenticationException e){
			System.out.println("Authentication failed: "+e.getMessage());
		}
	}
	public static void readFile(String filename){
		try(BufferedReader reader=new BufferedReader(new FileReader(filename))){
			String line;
			System.out.println("\nFile Contents:");
			while ((line=reader.readLine())!=null){
				System.out.println(line);
			}
		}catch(FileNotFoundException e){
			System.out.println("Error: File '"+filename+"' not found.");
		}catch(IOException e){
			System.out.println("Error reading the file: "+e.getMessage());
		}
	}
	public static void authenticate(String username, String password) throws AuthenticationException{
		if (!username.equals(USERNAME) || !password.equals(PASSWORD)){
			throw new AuthenticationException("Invalid username or password.");
		}
	}
}
