//This program asks the user for the lengths of the 2 sides of a right triangle, calculate its hypotenuse and prints it on the screen. 
import java.util.Scanner;
public class PythagoreanTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double side1 = 0, side2 = 0 , hypotenuse = 0;
        System.out.print("What is the value of the first cathetus?");
        side1 = scanner.nextDouble();
        System.out.print("What is the value of the second cathetus?");
        side2 = scanner.nextDouble();
        hypotenuse = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        System.out.println("The length of the hypotenuse is: " + hypotenuse + "cm");
        scanner.close();
    }
}
