import java.util.Scanner;

public class Player {
    String name;
    String piece;
    int money;
    boolean isInGame;

    public Player(String name, String piece, int startingMoney) {
        this.name = name;
        this.piece = piece;
        this.money = startingMoney;
        this.isInGame = true;
    }

    public void takeTurn() {
        if (isInGame) {
            System.out.println(name + "'s turn (" + piece + ")");
        }
    }

    public void addMoney(int amount) {
        money += amount;
        System.out.println(name + " gained $" + amount + ". Total: $" + money);
    }

    public void subtractMoney(int amount) {
        money -= amount;
        System.out.println(name + " lost $" + amount + ". Total: $" + money);
        if (money <= 0) {
            money = 0;
            isInGame = false;
            System.out.println(name + " has run out of money and is out of the game!");
        }
    }

    public boolean hasLost() {
        return !isInGame;
    }

    public boolean hasWon(int playersLeft) {
        return isInGame && playersLeft == 1;
    }

    public static void main() {

        Player[] players = new Player[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Player " + (i + 1) + " name:");
            String name = Console.readLine();

            System.out.println("Choose a piece (*, |, ?, #, etc.):");
            String piece = Console.readLine();

            players[i] = new Player(name, piece, 3750);

        }

        //the code below is simply a simulated version, with pre determined moves to est wether or not my code can actually work
        for (Player player : players) {
            if (player.isInGame) {
                player.takeTurn();

                // Simulated example: random add or subtract
                player.subtractMoney(300);
                player.addMoney(150);
            }
        }

        // Check how many players are still in the game
        int playersLeft = 0;
        for (Player player : players) {
            if (player.isInGame) {
                playersLeft++;
            }
        }

        // Check for winner
        for (Player player : players) {
            if (player.hasWon(playersLeft)) {
                System.out.println(player.name + " has won the game!");
            }
        }
    }
}


