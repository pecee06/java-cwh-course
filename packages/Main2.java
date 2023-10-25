import MyPackage2.Fibonacci;
import MyPackage2.SumFibonacci;

public class Main2{
	public static void main(String[] args) {
		Fibonacci obj1 = new Fibonacci();
		int num = obj1.giveNumber(5);
		System.out.println(num);

		SumFibonacci obj2 = new SumFibonacci(5);
	}
}