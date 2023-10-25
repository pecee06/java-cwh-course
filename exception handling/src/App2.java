// Java provides Java.lang.Exception class for handling the exceptions which inherit the properties and methods of Object and Throwable class.

// Methods of java.lang.Throwable class:
/*
addSuppressed()
getSuppressed()

initCause()
getCause()

getMessage()
getLocalizedMessage()

setStackTrace()
getStackTrace()
printStackTrace()
fillInStackTrace()

toString()
*/

// import java.util.Scanner;

// Create custom exceptions using the Exception class
class NegativeDimensionException extends Exception{
    NegativeDimensionException(){
        return;
    }
}

class NotAdultException extends Exception{
    @Override
    public String getMessage() {
        return "You're not 18 yet";
    }
}

class BeingSingleException extends Exception{
    @Override
    public String toString() {
        return "Only couple entry is allowed";
    }
}

public class App2 {
    static int squareArea(int side){
        return side*side;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        /*System.out.print("Enter side length of square : ");
        
        try {
            int side = sc.nextInt();
            sc.close();
            if (side<0){
                throw new NegativeDimensionException();
            }
            else{
                System.out.println("Area is "+squareArea(side));
            }
        } catch (NegativeDimensionException e) {
            System.out.println(e+" : Dimensions can't be negative");
        }
        catch (Exception e) {
            System.out.println(e);
        }*/

        /*try {
            System.out.print("Your age : ");
            int age = sc.nextInt();
            System.out.print("Single/Couple : ");
            String rel_status = sc.next();
            sc.close();
            int price = (10*age)+150;
            if (age<18){
                throw new NotAdultException();
                // 'throw' keyword is used to throw an exception explicitly by the programmer
            }
            else if (rel_status.equalsIgnoreCase("single")){
                throw new BeingSingleException();
            }
            else{
                System.out.println("Ticket costs "+price+" Rs");
            }
        } catch (NotAdultException e) {
            e.printStackTrace();    // This also gives the code-line where exception occured
        }
        catch (BeingSingleException e) {
            System.out.println(e);
            // If both getMessage() and toString() are set, then by default toString message is displayed
        }*/
        
        System.out.println("Thank you");
    }
}
