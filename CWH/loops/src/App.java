public class App {
    public static void main(String[] args) throws Exception {
        // While loop
        // ----------

        // int i = 100;  // Initialising the variable
        // boolean cond = i<=200;
        // while (cond){
        //     System.out.println(i);
            // i++;    // Incrementing the variable
        // }
        // The code inside while loop is executed repeatedly, till its condition is true

        // while (true){
        //     System.out.println("This is an infinite while loop");
        // }

        // do While loop
        // -------------

        // int a = 1;
        // do {
        //     System.out.println("This is line "+a);
        //     a++;
        // } while (a<4);

        // This loop is similar to while loop but is different in a way, that Java first enters the do block, then it checks the condition
        // This ensures that the code within do block must be executed once, irrespective of the truth value of the condition

        // do {
        //     System.out.println("It will be executed once");
        // } while (false);

        // for loop
        // --------

        // for (int i=1; i<=20; i+=2){
        // (initialisation ; condition ; updation)
        //     System.out.println(i);
        // }

        // int n = 10;
        // for (int i=1; i<=n; i++){
        //     int even = 2*i;
        //     System.out.println(even);
        // }

        System.out.println("Ulti Ginti");
        for (int i=10; i>0; i--){
            System.out.print(i+"\t");
        }
    }
}
