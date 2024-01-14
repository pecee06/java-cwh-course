// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Question 1
        // String str1 = "Hi There";
        // str1 = str1.toLowerCase();
        // System.out.println(str1);
        
        // Question 2
        // String str2 = "Sample text";
        // str2 = str2.replace(' ', '_');
        // System.out.println(str2);

        // Question 3
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name : ");
        // String first_name = sc.next();
        // System.out.printf("Dear %s, thanks a lot",first_name);
        // sc.close();

        // Question 4
        String letter = "Dear friend, It's been a long day...";
        letter = letter.replace(", ", "\n\t");
        System.out.println(letter);
    }
}
