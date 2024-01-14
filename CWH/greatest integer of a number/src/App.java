import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        float num = sc.nextFloat();

        float rem = num % 1;
        int gi = (int)(num - rem);

        if (num < 0 && rem != 0){
            gi -= 1;
        }
        System.out.printf("Greatest integer of %f is %d",num,gi);

        sc.close();
    }
}
