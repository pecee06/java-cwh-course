import java.util.InputMismatchException;
import java.util.Scanner;

// Question 3
class MaxRetriesReachedException extends Exception{
    @Override
    public String getMessage() {
        return "\nGame over";
    }
}

class ArrayGame{
    Scanner sc = new Scanner(System.in);

    int n = 10;
    int count = 0;

    int arr[] = new int[n];

    void populateArr(){
        for (int i=0; i<n; i++){
            this.arr[i] = (3*i)-10;
        }
    }

    void playGame() throws InputMismatchException,MaxRetriesReachedException{
        count++;
        System.out.print("Guess valid index : ");
        int index = sc.nextInt();
        
        if (count>=5){
            throw new MaxRetriesReachedException();
        }
        else if (index<0 || index>this.n){
            playGame();
        }
        else{
            System.out.println(arr[index]);
            System.out.println("You won in "+count+ " attempts");
        }
    }
}

public class App {
    // Question 1
    static int add(int x, int y){
        return x+y+3;   // Logical error
    }

    static void greet() throws InputMismatchException{  // May throw runtime error
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        sc.close();
        System.out.println("Good evening "+name);
        System.out.printf("Happy %dth birthday",age);
    }

    // Question 2
    static void function(String s, int n, int divisor){
        System.out.println(s+" "+n);
        System.out.println(n/divisor);
    }

    public static void main(String[] args) throws Exception {
        // print(add(8,4)); // Syntax error
        // System.out.println(add(8,4));

        /*try {
            greet();
        } catch (Exception e) {
            System.out.println(e);
        }*/

        /*try {
            function("Love you", 3000, 0);
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Hehe");
        }*/

        ArrayGame agame = new ArrayGame();
        agame.populateArr();
        try {
            agame.playGame();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
