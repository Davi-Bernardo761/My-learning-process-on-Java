//This program demonstrates a simple use of nested for loops to create matrices. 
import java.util.Scanner;
public class NestedForLoops {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will make a matrix using the number of vertical lines and horizontal lines given by the user.");
        System.out.print("Insert the number of horizontal lines.");
        int horizontal = scanner.nextInt();
        System.out.print("Insert the number of vertical lines");
        int vertical = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Insert the symbol you would like to see in the matrix.");
        String symbol = scanner.nextLine();
        for (int i = 1; i <=vertical; i++){
            for (int j = 1; j<=horizontal; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
