import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Question 1
        // char grade = 'A';

        // Encryption
        // Updating variable
        // grade = (char) (grade + 8);   // Typecasting to char
        // System.out.println("Your grade is : "+grade);

        // Decryption
        // char grade = (char) (grade - 8);
        // System.out.println("However actual grade is : "+grade);

        // Question 2
        Scanner sc = new Scanner(System.in);

        float given_num = 24.06f;

        System.out.print("Enter a number : ");
        float num = sc.nextFloat();

        System.out.println("Entered number is less than 24.06");
        System.out.println(given_num>num);

        sc.close();
    }
}
