import java.util.Scanner;
public class RectangleArea{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will calculate the area of a rectangle given it's sides.");
        System.out.print("What is the value of the first side.");
        double side1 = scanner.nextDouble();
        System.out.print("What is the value of the second side.");
        double side2 = scanner.nextDouble();
        double area = side1*side2;
        System.out.println("The area of your rectangle is " + area + "Square meters.");
        scanner.close();
    }
}
