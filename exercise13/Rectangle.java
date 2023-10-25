package Shapes;

public class Rectangle extends Shape{
	double length;
	double width;

	public Rectangle(double length, double width){
		super(length,width);
		this.length = length;
		this.width = width;
	}

	public double calArea(){
		double area = length*width;
		return area;
	}
}