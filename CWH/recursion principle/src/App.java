// Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method.

public class App {
    int factorial(int n){
        int val;
        if (n==0){
            val = 1;
        }
        else{
            val = n* factorial(n-1);
        }

        return val;
    }

    int triangularNumber(int n){
        int val;
        if (n<=0){
            val = 0;
        }
        else{
            val = n+ triangularNumber(n-1);
        }

        return val;
    }

    int fibonacci_nthTerm(int term){
        int val;
        switch (term) {
            case 1:
                val = 0;
                break;
            case 2:
                val = 1;
                break;
        
            default:
                val = fibonacci_nthTerm(term-1) + fibonacci_nthTerm(term-2);
                break;
        }
        return val;
    }

    public static void main(String[] args) throws Exception {
        App obj = new App();
        // int f = obj.factorial(6);
        // System.out.println(f);

        // int t = obj.triangularNumber(10);
        // System.out.println(t);

        int s = obj.fibonacci_nthTerm(10);
        System.out.println(s);
    }
}
