//This program asks the user for a value of a radius and, using this value, calculates the circumference length, the surfacearea, the area of the circle and the volume. 
import java.util.Scanner;
public class SphereAreaVolumeAndCircumference {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double radius, circumference, volume, areaCircle,areaSphere;
        System.out.print("What is the length of the radius?");
        radius = scanner.nextDouble();
        volume = (4.0/3)*Math.PI*Math.pow(radius,3);
        areaCircle = Math.pow(radius,2)*Math.PI;
        areaSphere = 4*Math.PI*Math.pow(radius,2);
        circumference = (2*radius*Math.PI);
        System.out.println("The length of the circumference is " + circumference + " cm.");
        System.out.println("The area of the Sphere is " + areaSphere + " cm².");
        System.out.println("The area of the circle is " + areaCircle + "  cm².");
        System.out.println("The volume of the sphere is " + volume + " cm³.");
    }
}
