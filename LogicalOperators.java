//This program demonstrates a simple use of logical operators, using the weather as an example.
import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me temperature of the day.");
        double temperature = scanner.nextDouble();
        if (temperature >= 40 || temperature <= 0) {
            System.out.println("It's either too cold, or too hot, anyway the weather's is bad in this day.");
        } else {
            System.out.println("It's a fine day out there.");
        }
        scanner.close();
    }
}
