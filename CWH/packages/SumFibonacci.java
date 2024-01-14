package MyPackage2;

public class SumFibonacci extends Fibonacci{
	protected int sum=0;	// Accessible from different package
	public SumFibonacci(int n){
		for (int i=n; i>0; i--){
			this.sum += giveNumber(i);
		}
		System.out.println(sum);
	}
}