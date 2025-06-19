//This program is a simple rock, paper, scissor game.
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main (String [] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to Rock, Paper, Scissor. Choose an option and play!
                1)Rock
                2)Scissor
                3)Paper""");
        int UserChoice = scanner.nextInt();
        scanner.nextLine();
        int machine = random.nextInt(1,4);
        if (UserChoice == machine){
            System.out.println("It's a draw,no one wins.");

        } else if (UserChoice == 1 && machine == 2){
            System.out.println("You won. The machine choose scissor.");
        } else if (UserChoice == 1 && machine == 3){
            System.out.println("You lost. The machine choose paper.");
        } else if (UserChoice == 2 && machine == 1){
            System.out.println("You lost. The machine choose rock");
        } else if (UserChoice == 2 && machine == 3){
            System.out.println("You won. The machine choose paper");
        } else if (UserChoice == 3 && machine == 1){
            System.out.println("You won. The machine choose rock");
        } else if (UserChoice == 3 && machine == 2){
            System.out.println("You lost. The machine choose scissor");
        }
        scanner.close();
    }
}