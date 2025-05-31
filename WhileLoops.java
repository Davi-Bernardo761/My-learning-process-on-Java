import java.util.Scanner;
public class WhileLoops {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (!name.equals("john")) {
            System.out.print("Tell me your name.");
            name = scanner.nextLine();
        }
        System.out.println("Your name is: " + name);
        scanner.close();
    }
}
