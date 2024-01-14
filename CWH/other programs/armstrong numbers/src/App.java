// Armstrong numbers are numbers, sum of cube of whose digits is equal to the number itself

class NotWholeNumberException extends Exception{
    @Override
    public String getMessage() {
        return "Input should be a whole number";
    }
}

class Armstrong{
    boolean check = false;
    int keyDivisor = 10, quotient, remainder;
    double val = 0;

    int num;
    Armstrong(int n){    // Takes a whole number as argument
        this.num = n;
    }

    boolean isArmstrong() throws NotWholeNumberException{
        if (num<0){
            throw new NotWholeNumberException();
        }

        this.quotient = num/keyDivisor;
        this.remainder = num%keyDivisor;

        // Used do-while loop, just for the sake of it
        do {
            val += Math.pow(remainder, 3);  // Returns output in 'double'
            remainder = quotient % keyDivisor;
            quotient /= keyDivisor;
        } while ((quotient != 0) || (remainder != 0));

        if (val == num){
            this.check = true;
        }

        return check;
    }
}

public class App {
    public static void main(String[] args) {
        try {
            Armstrong ams1 = new Armstrong(153);
            System.out.println(ams1.isArmstrong());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Armstrong ams2 = new Armstrong(-153);
            System.out.println(ams2.isArmstrong());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
