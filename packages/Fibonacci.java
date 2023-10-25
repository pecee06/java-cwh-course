package MyPackage2;

public class Fibonacci{	// Accessible from everywhere
	private int nthTerm = 0;	// Accessible within this class only
	public int giveNumber(int n){
		if (n==1){
			nthTerm = 0;
		}
		else if (n==2){
			nthTerm = 1;
		}
		else{
			nthTerm = giveNumber(n-1) + giveNumber(n-2);
		}
		return nthTerm;
	}
}