import Shapes.Circle;
import Shapes.Cylinder;

public class Main{
	public static void main(String[] args) {
		/*Circle c = new Circle(3);
		System.out.println(c.calArea());
		System.out.println(c.getDim1());
		System.out.println(c.getDim2());*/

		Cylinder cyl = new Cylinder(2,10);
		System.out.println(cyl.calArea());
		System.out.println(cyl.calVolume());
	}
}