//This program works as a banking program, giving the user the option to: View its balance, receive money, make a Withdraw and exit.
import java.util.Scanner;
public class BankingProgramDefinitiveEdtion {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        double balance = 2000;
        int decision = 0;
        while (running){
            System.out.println("""
                    (1)Show balance.
                    (2)Make a Withdraw.
                    (3)Receive a transference.
                    (4)Exit.
                    """);
            if (scanner.hasNextInt()){
                decision = scanner.nextInt();
                scanner.nextLine();
                switch (decision){
                    case 1 -> {
                        System.out.println("Your balance is $" + balance);
                        break;
                    }
                    case 2 -> {
                        double withdraw = 0;
                        System.out.println("How much money would you like to withdraw?");
                        if (scanner.hasNextDouble()){
                            withdraw = scanner.nextDouble();
                            scanner.nextLine();
                            if (balance >= withdraw) {
                                balance -= withdraw;
                                System.out.println("You just made a $" + withdraw +"withdraw.");
                            } else {
                                System.out.println("You don't have enough money, try again.");
                                break;
                            }
                        } else {
                            System.out.println("You choose an invalid option, try again.");
                            scanner.nextLine();
                            break;
                        }
                        break;
                    }
                    case 3 -> {
                        double receive = 0;
                        System.out.println("How much money are you going to receive?");
                        if (scanner.hasNextDouble()){
                            receive = scanner.nextDouble();
                            scanner.nextLine();
                            if (receive > 0 ) {
                                balance += receive;
                                System.out.println("You just received $" + receive);
                            } else {
                                System.out.println("You can't receive 0 or negative values. Try again.");
                                break;
                            }
                        } else {
                            System.out.println("You choose an invalid option. Try again.");
                            scanner.nextLine();
                            continue;
                        }
                        break;
                    }
                    case 4 -> {
                        System.exit(0);
                    }
                    default -> {
                        System.out.println("You choose an invalid option.");
                        break;
                    }
                }
            } else {
                System.out.println("You choose an invalid option.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}