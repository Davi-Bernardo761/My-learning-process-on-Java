//This program demonstrates a simple use of nested if statements.
import java.util.Scanner;
public class NestedIfStatements {
    public static void main (String [] args){
        double price = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you a student? (answer with true or false)");
        boolean student = scanner.nextBoolean();
        System.out.print("Are you a senior? (answer with true or false)");
        boolean senior = scanner.nextBoolean();
        if (student && senior) {
            System.out.printf("Since you are a student and a senior you get 30 percent discount and your final price is $ %.2f:",price*0.7);
        } else if (student) {
            System.out.printf("Since you are a student you get 15 percent discount and your final price is $ %.2f:",price*0.85);
        } else if (senior){
            System.out.printf("Since you are a senior you get 15 percent discount and your final price is $ %.2f:",price*0.85);
        } else {
            System.out.println("You don't fall into any category.");
        }
        scanner.close();
    }
}