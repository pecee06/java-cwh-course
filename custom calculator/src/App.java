import java.util.Scanner;

class MaxInputException extends Exception{
    @Override
    public String getMessage(){
        return "Calculator input limit reached";
    }
}

class MaxOutputException extends Exception{
    @Override
    public String getMessage(){
        return "Result is too big to display";
    }
}

class MaxMultiplierException extends Exception{
    @Override
    public String getMessage(){
        return "Way too big multiplier";
    }
}

class PreCalculator{
    int maxInput = 100000;
    int maxOutput = 10000000;
    double a;
    double b;
    double val;

    Scanner sc = new Scanner(System.in);

    void takeInput(){
        System.out.println("Enter two numbers");
        this.a = sc.nextFloat();
        this.b = sc.nextFloat();
    }

    void checkInput() throws MaxInputException{
        if (a>maxInput || b>maxInput){
            throw new MaxInputException();
        }
    }

    void checkOutput() throws MaxOutputException{
        if (val>maxOutput){
            throw new MaxOutputException();
        }
    }
}

class Calculator extends PreCalculator{
    double add(){
        val = a+b;
        return val;
    }

    double sub(){
        val = a-b;
        return val;
    }

    double mul() throws MaxMultiplierException,MaxOutputException{
        int maxMultiplier = 7000;

        if (a>maxMultiplier || b>maxMultiplier){
            throw new MaxMultiplierException();
        }
        else{
            val = a*b;
            checkOutput();
            return val;
        }
    }

    double div() throws ArithmeticException,MaxOutputException{
        if (b==0){
            throw new ArithmeticException();
        }
        else{
            val = a/b;
            checkOutput();
            return val;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();

        try{
            cal.takeInput();
            cal.checkInput();

            try {
                System.out.print("Addition result = ");
                System.out.println(cal.add());
            }
            catch (Exception e){
                System.out.println(e);
            }

            try {
                System.out.print("Subtraction result = ");
                System.out.println(cal.sub());
            }
            catch (Exception e){
                System.out.println(e);
            }

            try {
                System.out.print("Multiplication result = ");
                System.out.println(cal.mul());
            }
            catch (Exception e){
                System.out.println(e);
            }

            try {
                System.out.print("Division result = ");
                System.out.println(cal.div());
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
