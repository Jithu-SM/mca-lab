import java.io.*;
import java.util.Scanner;
public class FileOperations{
	public static String filename=new String();
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter filename:");
		filename=s.next();
		while(true){
			System.out.println("\nFile Operations Menu:");
			System.out.println("1. Write to File");
			System.out.println("2. Append to File");
			System.out.println("3. Read from File");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice=s.nextInt();
			switch(choice){
				case 1:System.out.print("Enter text to write to file: ");
					String writeData=s.next();
					writeToFile(writeData);
					break;
				case 2:System.out.print("Enter text to append to file: ");
					String appendData=s.next();
					appendToFile(appendData);
					break;
				case 3:readFromFile();
					break;
				case 4:System.out.println("Exiting program...");
					return;
				default:System.out.println("Invalid choice! Please choose a valid option.");
			}
		}
	}
	private static void writeToFile(String data){
		try(FileWriter writer=new FileWriter(filename)){
			writer.write(data);
			System.out.println("Data written successfully.");
		}catch(IOException e){
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}
	private static void appendToFile(String data){
		try(FileWriter writer=new FileWriter(filename,true)){
			writer.write(data+"\n");
			System.out.println("Data appended successfully.");
		}catch(IOException e){
			System.out.println("An error occurred while appending to the file.");
			e.printStackTrace();
		}
	}
	private static void readFromFile(){
		try(BufferedReader reader=new BufferedReader(new FileReader(filename))){
			String line;
			System.out.println("File Content:");
			while ((line=reader.readLine())!=null){
				System.out.println(line);
			}
		}catch(IOException e){
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}
	}
}
