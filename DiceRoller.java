//This program asks the user how many times will he roll a dice of 6 sides and tells him the sum of all sides that were rolled.
import java.util.Random;
import java.util.Scanner;
public class DiceRoller {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sumofdices = 0;
        int numberofdices = 0;
        int randomdice = 0;
        System.out.println("Insert the number of dices that will be rolled.");
        if (scanner.hasNextInt()){
            numberofdices = scanner.nextInt();
            scanner.nextLine();
            if (numberofdices <=0){
                System.out.print("You can't have negative or 0 dices. Try again.");
                System.exit(0);
            } else {
                for (int i = 0; i < numberofdices; i++){
                    randomdice = random.nextInt(1,7);
                    sumofdices += randomdice;
                    switch (randomdice){
                        case 1 -> System.out.println("""
                                -----
                                |   |
                                | O |
                                |   |
                                -----
                                """);
                        case 2 -> System.out.println("""
                                -----
                                |O  |
                                |   |
                                |  O|
                                -----
                                """);
                        case 3 -> System.out.println("""
                                -----
                                |O  |
                                | O |
                                |  O|
                                -----
                                """);
                        case 4 -> System.out.println("""
                                -----
                                |O O|
                                |   |
                                |O O|
                                -----
                                """);
                        case 5 -> System.out.println("""
                                -----
                                |O O|
                                | O |
                                |O O|
                                -----
                                """);
                        case 6 -> System.out.println("""
                                -----
                                |O O|
                                |O O|
                                |O O|
                                -----
                                """);
                      
                    }
                }
            }
        } else {
            System.out.println("You didn't type an integer.");
            System.exit(0);
        }
        System.out.println("The sum of all the dices is: " + sumofdices);
        scanner.close();
    }
}
