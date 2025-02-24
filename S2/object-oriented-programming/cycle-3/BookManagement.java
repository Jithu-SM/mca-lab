import java.util.Scanner;
class Publisher{
    	String pname;
    	public Publisher(String pname){
        	this.pname = pname;
    	}
    	void display(){
        	System.out.println("Publisher Name: " + pname);
    	}
}
class Book extends Publisher{
    	String title;
    	String author;
    	double price;
    	public Book(String pname, String title, String author, double price) {
        	super(pname);
        	this.title = title;
        	this.author = author;
        	this.price = price;
    	}
    	void display(){
        	super.display();
        	System.out.println("Book Title: " + title);
        	System.out.println("Author: " + author);
        	System.out.println("Price: " + price);
    	}
}
class Literature extends Book{
    	String genre;
    	public Literature(String pname, String title, String author, double price, String genre){
        	super(pname, title, author, price);
        	this.genre = genre;
    	}
    	void display(){
        	super.display();
        	System.out.println("Genre: " + genre);
    	}
}
class Fiction extends Book{
    	String category;
    	public Fiction(String pname, String title, String author, double price, String category){
        	super(pname, title, author, price);
        	this.category = category;
    	}
    	void display(){
        	super.display();
        	System.out.println("Category: " + category);
    	}
}
public class BookManagement{
    	public static void main(String args[]){
        	Scanner s = new Scanner(System.in);
        	System.out.println("Enter details for Literature Book:");
        	System.out.print("Enter publisher name: ");
        	String pname = s.next();
        	System.out.print("Enter book title: ");
        	String title = s.next();
        	System.out.print("Enter author name: ");
        	String author = s.next();
        	System.out.print("Enter book price: ");
        	double price = s.nextDouble();
        	System.out.print("Enter genre of the book: ");
        	String genre = s.next();
        	Literature literatureBook = new Literature(pname, title, author, price, genre);
        	System.out.println("\nLiterature Book Details:");
        	literatureBook.display();
        	System.out.println("\nEnter details for Fiction Book:");
        	System.out.print("Enter publisher name: ");
        	pname = s.next();
        	System.out.print("Enter book title: ");
        	title = s.next();
        	System.out.print("Enter author name: ");
        	author = s.next();
        	System.out.print("Enter book price: ");
        	price = s.nextDouble();
        	System.out.print("Enter category of the book: ");
        	String category = s.next();
        	Fiction fictionBook = new Fiction(pname, title, author, price, category);
        	System.out.println("\nFiction Book Details:");
        	fictionBook.display();
    	}
}

