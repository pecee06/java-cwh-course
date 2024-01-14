package Calc;

public class HybridCalculator{
	public void summation(double ...arr){
		double val = 0;
		for (double i:arr){
			val += i;
		}
		System.out.println(val);
	}
}