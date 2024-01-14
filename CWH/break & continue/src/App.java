public class App {
    public static void main(String[] args) throws Exception {
        // break statement
        // ---------------

        // while (true) {
        //     System.out.println("This will get executed only once");
        //     break;
        // }

        // In here, though we were inside an infinite while loop, the code block gets executed only once
        // That's what break statement is used for --> breaking loops irrespective of truth value of condition of loop
        // As soon as Java encounters the break statement, it exits the loop

        // break can be used with for-loops as well
        // for (int i=1; i<=5; i++){
        //     System.out.println("Count "+i);
        //     if (i==3){
        //         break;
        //     }
        // }

        // continue statement
        // ------------------

        // for (int j=0; j<4; j++){
        //     if (j==0){
        //         System.out.printf("Yeh toh %d hai\n",j);
        //         continue;   // It basically guides Java to stop the current iteration of the loop and move to next one
        //         // As soon as Java encounters continue statemnt, it ignores whatsoever code is below that statement and returns to loop
        //     }
        //     System.out.println(j);
        // }

        int i = 0;
        do {
            i++;
            if (i==2 || i==4){
                continue;
            } 
            System.out.println(i);
        } while (i<=7);
    }
}
