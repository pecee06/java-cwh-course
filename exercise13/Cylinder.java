package Shapes;

public class Cylinder extends Shape{
	double radius;
	double height;

	public Cylinder(double radius,double height){
		super(radius,height);
		this.radius = radius;
		this.height = height;
	}

	public double calArea(){
		double area = 2*Math.PI*radius*(radius+height);
		return area;
	}

	public double calVolume(){
		double volume = Math.PI*radius*radius*height;
		return volume;
	}
}