import java.util.Random;
import java.util.Scanner;

class Game{
    Scanner sc = new Scanner(System.in);

    // Game variables
    int attempts = 0;
    int randomNumber;
    int userInput;
    boolean wonGame = false;
    boolean keepPlaying = true;

    // Game methods
    void welcome(){
        System.out.println("Guess the number game");
        System.out.println("---------------------");
    }
    void generateRandom(int n){
        Random rand = new Random();
        this.randomNumber =  rand.nextInt(n);
    }
    void takeUserInput(){
        System.out.printf("Enter your guess : ");
        this.userInput = sc.nextInt();
    }
    boolean attemptConstraint(){
        if (attempts >= 20){
            keepPlaying = false;
        }
        return keepPlaying;
    }
    void check(){
        if (attemptConstraint() == true){
            if (userInput<randomNumber){
                System.out.println("A bit smaller");
                System.out.println("Try again...");
            }
            else if (userInput>randomNumber){
                System.out.println("A bit greater");
                System.out.println("Try again...");
            }
            else{
                System.out.printf("You won in %d attempts",attempts);
                wonGame = true;
            }
        }
        else{
            System.out.println("Game over");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Game obj = new Game();
        obj.welcome();
        obj.generateRandom(100);
        while (obj.wonGame==false && obj.keepPlaying==true){
            obj.attempts++;
            obj.takeUserInput();
            obj.check();
        }
    }
}
