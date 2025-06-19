//I made this program to test my knowledge on arrays and enhanced loops.
import java.util.Scanner;
public class ForEachLoopTest {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"Q1","Q2", "Q3"};
        String[][] options = {{"01","02","03"},{"04","05","06"},{"07","08","09"}};
        int[] CorrectAnswers = {1,2,3};
        int UserAnswer = 0;
        int score = 0;
        for (int i = 0; i < 3; i++){
            System.out.println(questions[i]);
            for (String elements:options[i]){
                System.out.println(elements);

            }
            System.out.println("Which option do you wanna choose?");
            UserAnswer = scanner.nextInt();
            if (UserAnswer == CorrectAnswers[i]){
                score++;
            } else {
                System.out.println("Wrong Answer.");
            }
        }
        System.out.println("You got " + score + " correct answers.");
        scanner.close();
    }
}