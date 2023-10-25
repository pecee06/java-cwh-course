package Shapes;

public class Sphere extends Shape{
	double radius;

	public Sphere(double radius){
		super(radius);
		this.radius = radius;
	}

	public double calArea(){
		double area = 4*Math.PI*radius*radius;
		return area;
	}

	public double calVolume(){
		double volume = (calArea()*radius)/3;
		return volume;
	}
}