import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("This a number guessing game, your goal is to choose the correct number.");
        int truenumber = random.nextInt(1,11);
        int guessnumber = 0;
        while (guessnumber !=truenumber){
            System.out.print("Try selecting a number.");
            guessnumber = scanner.nextInt();
        }
        System.out.println("Congrats! You've choosen the right number!");
        scanner.close();
    }
}
