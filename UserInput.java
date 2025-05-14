//This program asks the user pieces of information, stores them on variables and prints the information.
import java.util.Scanner;
public class UserInput {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = scanner.nextLine();
        System.out.print("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is the first letter of your name?");
        String firstLetter = scanner.nextLine();
        System.out.println("What is your weight?");
        double mass = scanner.nextDouble();
        System.out.print("Are you alive? (Answer whit true or false)");
        boolean life = scanner.nextBoolean();
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("The first letter of your name is " + firstLetter);
        System.out.println("Your weight is: " + mass);
        if (life){
            System.out.println("You are alive.");
        }
        scanner.close();
    }
}
