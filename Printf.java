//This program demonstrates a simple use of the printf command.
public class Printf {
    public static void main (String[] args) {
        String name = "Robert";
        int age = 20;
        char firstLetter = 'A';
        double height = 40.5;
        int apples = 19;
        boolean american = true;
        System.out.printf("Your name is: %s .\n",name);
        System.out.printf("The first letter of the word 'air' is %c \n",firstLetter);
        System.out.printf("The number of apples is %d \n", apples);
        System.out.printf("The building's height is %f \n", height);
        if (american) {
            System.out.printf("You are american: %b\n",american);
        }
    }
}