//This program demonstrates how to search for a specific item in an array and display its index if found.
import java.util.Scanner;
public class SearchAnArray3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        System.out.print("How many names are going you type?");
        int namesquantity = scanner.nextInt();
        scanner.nextLine();
        String target = "john";
        String names[] = new String[namesquantity];
        for (int i = 0; i < namesquantity; i++){
            System.out.println("Insert name " + (i + 1) + ":");
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i <namesquantity; i++) {
            if (target.equals(names[i])){
                index = i;
                break;
            }
        }
        if (index != -1){
            System.out.println("The index where john is found is: " + index);
        } else {
            System.out.println("John is not on the list.");
            System.exit(0);
        }
        scanner.close();
    }
}
