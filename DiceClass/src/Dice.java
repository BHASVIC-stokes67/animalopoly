import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();
        int Dice1 = rand.nextInt(6) + 1;

        Random rand2 = new Random();
        int Dice2 = rand.nextInt(6) + 1;

        System.out.println(Dice1 + " " + Dice2); //displays seperate dice values : i through 6
    }
}
