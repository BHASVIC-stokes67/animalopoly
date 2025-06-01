public class Board {
    String board[] = new String[26];
    int val = 0;
    String player1;
    String player2;
    String player3;
    String player4;
    int move = 0;
    int isCard = 0;
    Dice dice = new Dice();
    public void Main() {
        Setup();
        while(val == 0) {
            val = Game();
        }
        Finish();
    }

    public void Setup() {
        System.out.println("Welcome to Animalopoly");
        System.out.println("How many players will be playing? Max 4");
        int playerCount = Integer.parseInt(Console.readLine());
        while (playerCount > 4 || playerCount < 2) {
            System.out.println("Input not accepted: try again");
            playerCount = Integer.parseInt(Console.readLine());
        }
        System.out.println("Playing with " + playerCount + " players\n");
        for(int i = 0; i < playerCount; i++) {
            System.out.println("Player " + i + 1 + " will be called: ");
            if(i == 1) {
                player1 = Console.readLine();
                System.out.println("Player 1: " + player1);
            }
            else if(i == 2) {
                player2 = Console.readLine();
                System.out.println("Player 1: " + player2);
            }
            else if(i == 3) {
                player3 = Console.readLine();
                System.out.println("Player 1: " + player3);
            }
            else {
                player4 = Console.readLine();
                System.out.println("Player 1: " + player4);
            }
        }
    }

    public int Game() {
        int playerWin = 0, turn = 1;
        while(playerWin == 0) {
            if(turn == 1) {
                System.out.println(player1 + "'s turn");
                move = dice.Dice1();
                isCard = dice.Dice2();
                if(isCard == 1) {
                    // Something to do with cards - will figure it out
                }

                turn += 1;
            }
            if(turn == 2) {
                System.out.println(player2 + "'s turn");
                move = dice.Dice1();
                isCard = dice.Dice2();
                if(isCard == 1) {
                    // Something to do with cards - will figure it out
                }


                turn += 2;
            }
            if(turn == 3) {
                System.out.println(player3 + "'s turn");
                move = dice.Dice1();
                isCard = dice.Dice2();
                if(isCard == 1) {
                    // Something to do with cards - will figure it out
                }


                turn += 3;
            }
            if(turn == 4) {
                System.out.println(player4 + "'s turn");
                move = dice.Dice1();
                isCard = dice.Dice2();
                if(isCard == 1) {
                    // Something to do with cards - will figure it out
                }


                turn = 1;
            }
        }
        return playerWin;
    }

    public void displayBoard() {

    }

    public void Finish() {
        System.out.println("Game Over");
        if(val == 1) {
            System.out.println("Player 1 has won the game, congrats!");
        }
        if(val == 2) {
            System.out.println("Player 2 has won the game, congrats!");
        }
        if(val == 3) {
            System.out.println("Player 3 has won the game, congrats!");
        }
        else {
            System.out.println("Player 4 has won the game, congrats!");
        }
    }
}
