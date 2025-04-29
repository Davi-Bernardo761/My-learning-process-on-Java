import java.util.Scanner;
public class Ifstatments {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("What is your age? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Are alive? (answer whit true or false) ");
        boolean lifeStatus = scanner.nextBoolean();

        if (name.isEmpty()){
            System.out.println("You didn't tell me your name.");
        } else {
            System.out.println("Your name is " + name + " that's amazing!");
        }
        if (age <=0) {
         System.out.println("You haven't been born yet");
        }
        else if (age >= 0 && age < 18) {
            System.out.println("You are a kid, aged " + age + " years old.");
        } else if (age >=18 && age < 60) {
            System.out.println("You are an adult aged " + age + " years old.");
        } else {
            System.out.println("You are an old adult aged " + age + " years old.");
        }
        if (lifeStatus) {
            System.out.println("You are alive.");
        } else {
            System.out.println("You are dead.");
        }
        scanner.close();
    }
}