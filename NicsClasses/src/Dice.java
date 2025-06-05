import java.util.Random;

public class Dice {
    static int Dice1 = 0;
    static int Dice2 = 0;
    static int[] Diceresults = {0, 0};

    public void main(){
        Diceresults[1] = 0;
        Random rand = new Random();
        Dice1 = rand.nextInt(6) + 1;
        Random rand2 = new Random();
        Dice2 = rand2.nextInt(6) + 1;

        System.out.println(Dice1 + " + " + Dice2);
        Diceresults[0] = Dice1 + Dice2;

        if (Dice1 == Dice2) {
            Diceresults[1] = 1;
            System.out.println("Dice 1 and Dice 2 are the same");
        }
    }

    public int Dice1() {
        main();
        return Diceresults[0];
    }

    public int Dice2() {
        return Diceresults[1];
    }

}
