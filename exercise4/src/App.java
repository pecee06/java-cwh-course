import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Question 1
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter maximum marks in each sub : ");
        // float max = sc.nextFloat();

        // System.out.print("Enter Physics marks : ");
        // float phy = sc.nextFloat();
        // System.out.print("Enter Chemistry marks : ");
        // float chem = sc.nextFloat();
        // System.out.print("Enter Mathematics marks : ");
        // float math = sc.nextFloat();

        // boolean ess_cond = phy <= max && chem <= max && math <= max;

        // float phy_pcent = (phy*100)/max;
        // float chem_pcent = (chem*100)/max;
        // float math_pcent = (math*100)/max;
        // float result = (phy_pcent+chem_pcent+math_pcent)/3;

        // boolean subWise_criteria = phy_pcent >= 33 && chem_pcent >= 33 && math_pcent >= 33;
        // boolean net_criteria = result >= 40;

        // if (ess_cond){
        //     if (subWise_criteria && net_criteria){
        //         System.out.println("You've passed your exams");
        //     }
        //     else{
        //         System.out.println("You've failed your exams");
        //     }
        //     System.out.println("Performance sheet");
        //     System.out.println("Physics --> "+phy_pcent+" %");
        //     System.out.println("Chemistry --> "+chem_pcent+" %");
        //     System.out.println("Mathematics --> "+math_pcent+" %");
        //     System.out.println("Overall "+result+" %");
        // }
        // else{
        //     System.out.println("Wrong input");
        //     System.out.println("Try again");
        // }

        // Question 2
        // System.out.print("Your annual income : ");
        // double income = sc.nextFloat();

        // int lakh = 100000;
        // double i1 = 2.5*lakh;
        // double excessIncome = income - i1;

        // double i2 = 5*lakh;
        // double i3 = 10*lakh;

        // double tax; // initializing a variable

        // if (income>=i1 && income<i2){
        //     tax = (5*excessIncome)/100;
        // }
        // else if (income>=i2 && income<i3){
        //     tax = (20*excessIncome)/100;
        // }
        // else if (income>i3){
        //     tax = (30*excessIncome)/100;
        // }
        // else{
        //     tax = 0;
        // }

        // if (tax == 0){
        //     System.out.println("You need not pay any taxes");
        // }
        // else{
        //     System.out.println("Your tax is "+tax);
        //     System.out.println("Pay before last date");
        // }

        // Question 3
        // System.out.print("Enter day of the week : ");
        // int i = sc.nextInt();
        // String day;

        // switch (i) {
        //     case 1:
        //         day = "Monday";
        //         break;
        //     case 2:
        //         day = "Tuesday";
        //         break;
        //     case 3:
        //         day = "Wednesday";
        //         break;
        //     case 4:
        //         day = "Thursday";
        //         break;
        //     case 5:
        //         day = "Friday";
        //         break;
        //     case 6:
        //         day = "Saturday";
        //         break;
        //     case 7:
        //         day = "Sunday";
        //         break;
        
        //     default:
        //         day = "Your day :)";
        //         break;
        // }
        // System.out.printf("Today is %s",day);

        // Question 4
        // int sampleLeapYear = 2020;
        // Inputs should be within a range of 100 years of sampleLeapYear

        // System.out.print("Enter a year : ");
        // int year = sc.nextInt();
        // int expression = (year - sampleLeapYear)%4;

        // if (expression == 0){
        //     System.out.println("It's a leap year");
        // }
        // else{
        //     System.out.println("It's not a leap year");
        // }

        // Question 5
        System.out.print("Enter a URL : ");
        String url = sc.next();

        if (url.endsWith(".com")){
            System.out.println("It's a commercial website");
        }
        else if (url.endsWith(".org")){
            System.out.println("It's an organisation");
        }
        else if (url.endsWith(".in")){
            System.out.println("It's an Indian website");
        }
        else{
            System.out.println("NOTA");
        }

        sc.close();
    }
}
