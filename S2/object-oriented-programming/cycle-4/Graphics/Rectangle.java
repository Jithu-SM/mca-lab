package Graphics;
public class Rectangle implements Shape{
	private double length,width;
	public Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	public double area(){
		return length*width;
	}
}
