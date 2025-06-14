//This program demonstrates a simple use of dinamic arrays in java.
import java.util.Scanner;
public class Arrays {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will be inserted?");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        int numbers[] = new int[quantity];
        for (int i = 0; i <quantity; i++){
            System.out.print("Insert number " + (1 + i) + ":");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Here are the following numbers.");
        for (int number : numbers){
            System.out.println(number);
        }
        scanner.close();
    }
}
