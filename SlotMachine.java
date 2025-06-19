//This program demonstrates a simple slot machine game.
import java.util.Random;
import java.util.Scanner;
public class SlotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;
        String[] symbols = {"🍍", "🍎", "🍓", "🍇", "🍒"};
        int balance = 7000;
        while (running) {
            int random1 = random.nextInt(0, 5);
            int random2 = random.nextInt(0, 5);
            int random3 = random.nextInt(0, 5);
            System.out.println("""
                    Welcome to the game!!!
                    Place your bet.
                    🍍🍎🍓🍇🍒
                    """);
            int bet = scanner.nextInt();
            System.out.println("Spinning!");
            System.out.println(symbols[random1] + "|" + symbols[random2] + "|" + symbols[random3]);
            if (random1 == random2 && random2 == random3) {
                System.out.println("Congratulations, you've won!");
                balance += bet * 2;
            } else {
                System.out.println("BAM! You just LOST!!!");
                balance -= bet * 2;
            }
            if (balance <= 0) {
                System.out.println("You ran out of money.");
                System.exit(0);
            }
            System.out.println("Would you like to play again?(answer whit 'true' or 'false')");
            running = scanner.nextBoolean();
        }
        scanner.close();
    }
}