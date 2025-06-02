public class Board {
    String board[] = new String[26];
    int val = 0;
    String player1;
    int player1Pos = 1;
    String player2;
    int player2Pos = 1;
    String player3;
    int player3Pos = 1;
    String player4;
    int player4Pos = 1;
    int isCard = 0;
    int playerCount = 0;
    Dice dice = new Dice();
    Animal animal = new Animal();
    Cards card = new Cards();

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
        playerCount = Integer.parseInt(Console.readLine());
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
                System.out.println("Player 2: " + player2);
            }
            else if(i == 3) {
                player3 = Console.readLine();
                System.out.println("Player 3: " + player3);
            }
            else {
                player4 = Console.readLine();
                System.out.println("Player 4: " + player4);
            }
        }
    }

    public int Game() {
        int playerWin = 0, turn = 1;
        while(playerWin == 0) {
            if(turn == 1) {
                System.out.println(player1 + "'s turn");
                player1Pos += dice.Dice1();
                if(player1Pos > 26) {
                    player1Pos -= 26;
                }
                System.out.println("You landed on the " + animal.ReturnAnimal(player1Pos));
                isCard = dice.Dice2();
                if(isCard == 1) {
                    card.main();
                }
                if(animal.ReturnAnimal(player1Pos) == "Skip a go") {
                    turn += 1;
                }
                else {

                    turn += 1;
                }
            }
            if(turn == 2) {
                System.out.println(player2 + "'s turn");
                player2Pos += dice.Dice1();
                if(player2Pos > 26) {
                    player2Pos -= 26;
                }
                System.out.println("You landed on an " + animal.ReturnAnimal(player2Pos));
                isCard = dice.Dice2();
                if(isCard == 1) {
                    card.main();
                }
                if(animal.ReturnAnimal(player2Pos) == "Skip a go") {
                    if(playerCount > 2) {
                        turn += 1;
                    }
                    else {
                        turn = 1;
                    }
                }
                else{

                    if(playerCount > 2) {
                        turn += 1;
                    }
                    else {
                        turn = 1;
                    }
                }
            }
            if(turn == 3) {
                System.out.println(player3 + "'s turn");
                player3Pos += dice.Dice1();
                if(player3Pos > 26) {
                    player3Pos -= 26;
                }
                System.out.println("You landed on the " + animal.ReturnAnimal(player3Pos));
                isCard = dice.Dice2();
                if(isCard == 1) {
                    card.main();
                }
                if(animal.ReturnAnimal(player3Pos) == "Skip a go") {
                    if(playerCount > 3) {
                        turn += 1;
                    }
                    else {
                        turn = 1;
                    }
                }
                else{

                    if(playerCount > 3) {
                        turn += 1;
                    }
                    else {
                        turn = 1;
                    }
                }
            }
            if(turn == 4) {
                System.out.println(player4 + "'s turn");
                player4Pos += dice.Dice1();
                if(player4Pos > 26) {
                    player4Pos -= 26;
                }
                System.out.println("You landed on an " + Animal.ReturnAnimal(player4Pos));
                isCard = dice.Dice2();
                if(isCard == 1) {
                    card.main();
                }
                if(animal.ReturnAnimal(player2Pos) == "Skip a go") {
                    turn = 1;
                }
                else{

                    turn = 1;
                }
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
