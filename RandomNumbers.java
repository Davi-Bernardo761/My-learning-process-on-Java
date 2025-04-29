import java.util.Random;
public class RandomNumbers {
    public static void main (String[] args){
        Random random = new Random();
        int number = random.nextInt(1,11);
        System.out.println(number);
        double genericNumber = random.nextDouble(4,6);
        System.out.println(genericNumber);
        boolean animal = random.nextBoolean();
        if (animal) {
            System.out.println("That's a dog!");
        } else {
            System.out.println("That's a cat!");
        }
    }
}
