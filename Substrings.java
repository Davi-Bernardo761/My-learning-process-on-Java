//This program demonstrates uses of Substrings in java.
import java.util.Scanner;
public class Substrings {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inser your email.");
        String email = scanner.nextLine();
        String username = email.substring(0,email.lastIndexOf("@"));
        String ending = email.substring(email.lastIndexOf("@"),email.lastIndexOf("m") + 1);
        System.out.println(username);
        System.out.print(ending);
        scanner.close();
    }
}
