import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int pc_input = rand.nextInt(3);
        System.out.print("Rock/Paper/Scissor : ");
        String user_choice = sc.next();
        String pc_choice = "";

        switch (pc_input) {
            case 0:
                pc_choice = "Rock";
                break;
            case 1:
                pc_choice = "Paper";
                break;
            case 2:
                pc_choice = "Scissor";
                break;
        
            default:
                break;
        }

        String winner = "";
        
        if (pc_choice.equalsIgnoreCase("rock")){
            if (user_choice.equalsIgnoreCase("paper")){
                winner = "You";
            }
            else if (user_choice.equalsIgnoreCase("rock")){
                winner = "No-one";
            }
            else{
                winner = "Computer";
            }
        }

        else if (pc_choice.equalsIgnoreCase("paper")){
            if (user_choice.equalsIgnoreCase("scissor")){
                winner = "You";
            }
            else if (user_choice.equalsIgnoreCase("paper")){
                winner = "No-one";
            }
            else{
                winner = "Computer";
            }
        }

        else{
            if (user_choice.equalsIgnoreCase("rock")){
                winner = "You";
            }
            else if (user_choice.equalsIgnoreCase("scissor")){
                winner = "No-one";
            }
            else{
                winner = "Computer";
            }
        }

        System.out.println("Computer chose "+pc_choice);

        if (winner.equalsIgnoreCase("no-one")){
            System.out.println("Match draw");
        }
        else{
            System.out.printf("%s won",winner);
        }

        sc.close();
    }
}
