import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Gender : ");
        // String sex = sc.next();

        // if-else
        // -------

        // if (sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("male")){
        //     System.out.println("You're a boy");
        // }
        // else if (sex.equalsIgnoreCase("F") || sex.equalsIgnoreCase("female")){
        //     System.out.println("You're a girl");
        // }
        // else statement is optional
        // else{
        //     System.out.println("You're trans");
        // }

        // if conditions should be boolean expressions, which can be evaluated as either true or false

        // Switch-case
        // -----------

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        switch (age) {
            // Cases are the different possible values, the key of a switch (age in this case) can have
            case 3:
                System.out.println("Get Influenza vaccine");
                break;
                // This break statement ensures that once a case a true, program should get out of the switch
                // In its absence, all the below mentioned cases will get executed without check, if this case is true
            case 6:
                System.out.println("Get Polio & Measles vaccine");
                break;
            case 14:
                System.out.println("Get Tetanus vaccine");
                break;

            default:
            // default block gets executed, if none of the covered cases are true
                System.out.println("No vaccine required");
                break;
        }

        sc.close();
    }
}
