package Shapes;

public abstract class Shape{
	double dimension1;
	double dimension2;

	public Shape(double dimension1){
		this.dimension1 = dimension1;
		this.dimension2 = 0;
	}
	public Shape(double dimension1, double dimension2){
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
	}

	public double getDim1(){
		return dimension1;
	}
	public double getDim2(){
		return dimension2;
	}
}