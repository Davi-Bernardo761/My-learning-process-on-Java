//This program is a weight converter made to convert pounds to kilos and vice versa.
import java.util.Scanner;
public class WeightConverter {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to convert Kilos to pounds?(type ) or convert Pounds to Kilos? (Type 2)");
         int decision = scanner.nextInt();
        System.out.print("How much do you weight?");
        float weight = scanner.nextFloat();
        if (decision == 1) {
            System.out.println("Your weight in pounds is: " + weight*2.2 + " lb");
        } else if (decision == 2) {
            System.out.println("Your weight in Kilos is: " + weight*0.45 + " kilos.");
        } else {
            System.out.println("You've done something wrong.");
        }
        scanner.close();
    }
}
