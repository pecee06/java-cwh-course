import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        // Generating random integer between 0 and 9
        int r1 = rand.nextInt(10);
        System.out.println(r1);

        // Generating random number between 0 and 1
        float r2 = rand.nextFloat();
        System.out.println(r2);
    }
}
