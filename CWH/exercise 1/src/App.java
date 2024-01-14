// Percentage calculator
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Question 1
        Scanner sc = new Scanner(System.in);

        // System.out.print("Max marks in each subject : ");
        // int max = sc.nextInt();

        // System.out.print("Marks in English subject : ");
        // float marks_eng = sc.nextFloat();

        // System.out.print("Marks in IP subject : ");
        // float marks_ip = sc.nextFloat();

        // System.out.print("Marks in Mathematics subject : ");
        // float marks_math = sc.nextFloat();

        // System.out.print("Marks in Physics subject : ");
        // float marks_phy = sc.nextFloat();

        // System.out.print("Marks in Chemistry subject : ");
        // float marks_chem = sc.nextFloat();

        // float total = marks_eng+marks_ip+marks_math+marks_phy+marks_chem;
        // float pcent = (total*100)/(5*max);

        // System.out.println("Your percentage "+pcent+" %");

        // Question 2
        float conv_factor = 0.621371f;
        System.out.print("Distance in kilometres : ");
        float km = sc.nextFloat();
        float mile = conv_factor*km;
        System.out.println("Distance in miles is "+mile);

        sc.close();
    }
}
