import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random rand = new Random();
        int Dice1 = rand.nextInt(6) + 1;

        Random rand2 = new Random();
        int Dice2 = rand2.nextInt(6) + 1;

        System.out.println(Dice1 + " " + Dice2); //displays separate dice values : i through 6
        int DiceResult = Dice1 + Dice2;
        System.out.println(DiceResult);

        //System.out.println(CurrentPlayer + "Move forward" + DiceResult);
        //code above is not in use but only for visual purposes

        //code below belongs in other classes
        if (Dice1 == Dice2){
            //Cards.main(args);
            //ive added a placeholder for the actual line of code, which does work
            System.out.println("Dice 1 and Dice 2 are the same");
        }
    }
}
