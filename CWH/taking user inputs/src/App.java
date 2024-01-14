// Importing Scanner class
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Creating scanner
        Scanner sc = new Scanner(System.in);
        // System.in means, we will take input from keyboard

        // System.out.print("Enter first number : ");
        // int a = sc.nextInt();
        // a will accept an integer as input

        // System.out.print("Enter second number : ");
        // int b = sc.nextInt();

        // int sum = a+b;
        // System.out.println("Sum is "+sum);

        // System.out.print("Enter your first name : ");
        // String name1 = sc.next(); // This will take 1 word as input

        // To take a group of words as input use sc.nextLine()

        // System.out.print("Enter your last name : ");
        // String name2 = sc.next();

        // String name = name1+" "+name2;
        // System.out.println("Your name is "+name);

        System.out.print("Enter an integer : ");
        boolean b = sc.hasNextInt();
        // Will return true if input is integer else will return false
        System.out.println(b);

        // Closing scanner
        sc.close();
    }
}
