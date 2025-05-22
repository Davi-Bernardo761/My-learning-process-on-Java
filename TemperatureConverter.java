//This program converts temperatures using a switch.
import java.util.Scanner;
public class TemperatureConverter {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature? ");
        float temperature = scanner.nextFloat();
        System.out.print("""
                    Do you want to convert it:
                    1-from Celsius to fahrenheit(type 1)
                    2-from celsius do kelvin(type 2)
                    3-from kelvin to celsius(type 3)
                    4-from kelvin to fahrenheit(type 4)
                    5-from farenheit to celsius(type 5)
                    6-from farenheit to Kelvin(type 6).""");
        int decision = scanner.nextInt();
        switch (decision){
            case 1 ->System.out.println("Your temperature from celsius to fahrenheit is: " + temperature*9/5+32);
            case 2 ->System.out.println("Your temperature from celsius to Kelvin is: " + temperature+273.15);
            case 3 ->System.out.println("Your temperature from Kelvin to celsius is: " + (temperature-273.15));
            case 4 ->System.out.println("Your temperature from Kelvin to fahrenheit is: "+ 1.8*(temperature-273.15)+32);
            case 5 ->System.out.println("Your temperature from Fahrenheit to Celsius is: "+ (temperature-32)*5/9);
            case 6 ->System.out.println("Your temperature from Fahrenheit to Kelvin is: " + (temperature-32)/1.8+273.15);
            default -> System.out.println("You've done something wrong.");
        }
        scanner.close();
    }
}