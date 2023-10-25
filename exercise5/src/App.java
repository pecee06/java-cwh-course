public class App {
    public static void main(String[] args) throws Exception {
        // Question 1
        // int row = 10;
        // int col = 10;

        // for (int i=1; i<=row; i++){
        //     for (int j=1; j<=((col+1)-i); j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question 2
        // int n1 = 100;
        // int sum = 0;

        // int i = 0;
        // while (i<n1){
        //     sum += 2*i;
        //     i++;
        // }
        // System.out.printf("Sum of first %d even numbers is : %d",n1,sum);

        // Question 3
        // int n2 = 17;
        // for (int i=1; i<=10; i++){
        //     int val = n2*i;
        //     System.out.printf("%d X %d = %d\n",n2,i,val);
        // }

        // Question 4
        // int n3 = 6;
        // if (n3>0){
        //     int factorial = 1;
        //     for (int i=1; i<=n3; i++){
        //         factorial *= i;
        //     }
        //     System.out.printf("%d! is %d",n3,factorial);
        // }
        // else{
        //     System.out.println("Negative inputs aren't valid");
        // }

        // Question 5
        int n4 = 8;
        int sum = 0;
        for (int i=1; i<=10; i++){
            sum += n4*i;
        }
        System.out.println(sum);
    }
}
