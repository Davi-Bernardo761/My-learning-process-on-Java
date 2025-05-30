//This program was made to demonstrate a simple calculator.
import java.util.Scanner;
public class BasicCalculator {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wich operation do you wanna make?");
        String choice1 = scanner.nextLine();
        System.out.print("Insert the first number.");
        double number1 = scanner.nextDouble();
        System.out.print("Insert the second number.");
        double number2 = scanner.nextDouble();
        switch(choice1) {
            case "multiplication" -> System.out.println("the result of your multiplication is:" + number1*number2);
            case "division" -> System.out.println("the result of your multiplication is:" + number1/number2);
            case "sum" -> System.out.println("the result of your multiplication is:" + number1+number2);
            case "substraction" -> System.out.println("the result of your multiplication is:" + (number1-number2));
            default -> System.out.println("You've done something wrong, try again.);
        }
        scanner.close();
    }
}
