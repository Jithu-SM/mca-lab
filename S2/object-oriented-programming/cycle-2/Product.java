import java.util.Scanner;
public class Product{
	String pcode,pname;
	double price;
	public Product(String pcode, String pname, double price){
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	public static Product getLowestPrice(Product items[]){
		Product lowest=items[0];
		for(int i=1;i<items.length;i++){
			if(items[i].price<lowest.price) lowest=items[i];
		}
		return lowest;
	}
	public void display(){
		System.out.println("Product code: "+this.pcode+"\nProduct name: "+this.pname+"\nPrice: "+price);
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of products: ");
		int n=s.nextInt();
		Product items[]=new Product[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter product code of product "+i+": ");
			String pcode=s.next();
			System.out.println("Enter product name of product "+i+": ");
			String pname=s.next();
			System.out.println("Enter price of product "+i+": ");
			double price=s.nextDouble();
			items[i]= new Product(pcode,pname,price);
		}
		Product lowest=Product.getLowestPrice(items);
		System.out.println("Item with lowest Price : ");
		lowest.display();
	}
}
