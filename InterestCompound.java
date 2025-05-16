//This program calculates the final amount of a compound interest based on user input.
import java.util.Scanner;
public class InterestCompound {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double interestRate = 0, mainAmount = 0, years = 0, finalValue = 0, numberOFtimes = 0;
        System.out.print("Enter the principal amound in dollars.");
        mainAmount = scanner.nextDouble();
        System.out.print("Enter the annual interest rate. (in %)");
        interestRate = scanner.nextDouble();
        System.out.print("Enter how many times the interest is compounded per year.");
        numberOFtimes = scanner.nextDouble();
        System.out.print("Enter the number of years the money will be invested.");
        years = scanner.nextDouble();
        finalValue = mainAmount*Math.pow((1 + interestRate*0.01/numberOFtimes),years*numberOFtimes);
        System.out.printf("The final amount is %.2f dollars.\n",finalValue);
        scanner.close();
    }
}