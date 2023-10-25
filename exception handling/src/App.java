// In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

// Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc., so that the normal flow of the application can be maintained.

// 2 types of exceptions
// 1. Checked exception - Handled by compiler
// 2. Unchecked exception(runtime exception)

// Exceptions are handled by using try-catch block

import java.util.Scanner;

public class App {
    static int hunderedBy(int x){   // This returns the quotient
        return 100/x;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter a number : ");

        try {
            int i = sc.nextInt();
            try {
                System.out.println(hunderedBy(i));
            } catch (Exception e) {
                System.out.println("Cannot divide by zero");
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }*/

        // Handling specific exceptions
        /*String actress[] = {"Aishwarya","Ananya","Alia","Deepika","Kirti","Urvashi","Vidya","Kajol","Rani","Kareena","Bipasha","Tara","Shraddha","Kiara"};

        System.out.print("Enter an index : ");

        try {
            int index = sc.nextInt();
            String fav_actress = actress[index];
            System.out.println("Your favorite actress is "+fav_actress);
        } catch (IndexOutOfBoundsException e) { // This will only catch IndexOutOfBoundsException
            System.out.println("IndexOutOfBoundsException occured");
        }
        catch (Exception e) {   // This will catch all other exceptions that may occur
            System.out.println(e);
        }*/
        
        sc.close();

        System.out.println("Program worked successfully");  // If exceptions aren't handled, then this print statement would not have worked in case of runtime error
    }
}
