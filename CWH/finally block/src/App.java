// Java finally block is a block used to execute important code such as closing the connection, etc.

// Java finally block is always executed whether an exception is handled or not. Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not
// If you don't handle the exception, before terminating the program, JVM executes finally block

import java.util.Scanner;

class NegativeAgeException extends Exception{
    @Override
    public String getMessage() {
        return "Age can't be negative";
    }
}

class NegativeInputException extends Exception{
    @Override
    public String getMessage() {
        return "Enter a positive number";
    }
}

public class App {
    static void issueDrivingLicence() throws NegativeAgeException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        
        try {
            int age = sc.nextInt();
            sc.close();
            if (age<0){
                throw new NegativeAgeException();
            }
            else if (age<18){
                System.out.println("You're not an adult");
                System.out.println("Driving license can't be issued");
            }
            else{
                System.out.println("Driving license issued...");
            }
            return;
        } catch (NegativeAgeException e) {
            System.out.println(e);
            return;
        }
        finally{
            System.out.println("Ending function in finally block"); // This is reachable
        }
        // finally block comes only after try-catch block
        
        // System.out.println("Ending function");  // This is unreachable code
    }

    static void giveQuotient() throws ArithmeticException,NegativeInputException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        if (num>0){
            while (true){
                System.out.println(10/num--);
            }
        }
        else{
            throw new NegativeInputException();
        }
    }

    public static void main(String[] args) throws Exception {
        // issueDrivingLicence();

        try {
            giveQuotient();
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("End of program");
        }
    }
}
