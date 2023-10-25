package Shapes;

public class Circle extends Shape{
	double radius;

	public Circle(double radius){
		super(radius);
		this.radius = radius;
	}

	public double calArea(){
		double area = Math.PI*radius*radius;
		return area;
	}
}