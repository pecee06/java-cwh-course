public class App {
    // Question 1
    static void table(int n){
        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",n,i,(n*i));
        }
    }

    // Question 2
    static void lowerTrianglePattern(int index){
        for (int i=1; i<=index; i++){
            for (int j=1; j<=index; j++){
                if (i>=j){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Question 3
    static int sum(int n){
        int val;
        switch (n) {
            case 1: // Base condition --> Helps recursive functions to terminate. In its absence, infinite recursion will occur, which leads to error
                val = 1;
                break;
        
            default:
                val = n + sum(n-1);
                break;
        }
        return val;
    }

    // Question 4
    static void pattern(int index){
        for (int i=1; i<=index; i++){
            for (int j=1; j<=(index+1)-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Question 5
    static int fibo_nthTerm(int n){
        int val;
        switch (n) {
            case 1:
                val = 0;
                break;
            case 2:
                val = 1;
                break;
        
            default:
                val = fibo_nthTerm(n-1) + fibo_nthTerm(n-2);
                break;
        }
        return val;
    }

    // Question 6
    static double avg(double ...arr){
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        double val = sum/(arr.length);
        return val;
    }

    // Question 7
    static void patternRec(int index){
        if (index>0){   // This condition terminates the function, as soon as index becomes negative. Else, infinite recursion will occur and will throw error
            for (int i=1; i<=index; i++){
                System.out.print("* ");
            }
            System.out.println();
            patternRec(index-1);
        }
    }

    // Question 8
    static double F(double celsius){
        double temp = 32 + ((9*celsius)/5);
        return temp;
    }

    public static void main(String[] args) throws Exception {
        // table(26);

        // lowerTrianglePattern(20);

        // int s = sum(15);
        // System.out.println(s);

        // pattern(5);

        // int f = fibo_nthTerm(10);
        // System.out.println(f);

        // double average = avg(17,18,13,20,15);
        // System.out.println(average);

        // patternRec(3);

        double tempF = F(23);
        System.out.println(tempF);
    }
}
