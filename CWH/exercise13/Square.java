package Shapes;

public class Square extends Shape{
	double side;

	public Square(double side){
		super(side);
		this.side = side;
	}

	public double calArea(){
		double area = side*side;
		return area;
	}
}