public class Board {
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
    String board[] = new String[26];
    String check;

    Dice dice = new Dice();
    Animal animal = new Animal();
    Cards card = new Cards();
    Player1 Player1 = new Player1();
    Player2 Player2 = new Player2();
    Player3 Player3 = new Player3();
    Player4 Player4 = new Player4();

    public void Main() {
        while(val == 0) {
            val = Game();
        }
        Finish();
    }

    public int Game() {
        int playerWin = 0, turn = 1;
        while(playerWin == 0) {
            if(turn == 1) {
                System.out.println(player1 + "'s turn");
                player1Pos += dice.Dice1();
                if(player1Pos > 26) {
                    player1Pos -= 26;
                    if(player1Pos == 1) {
                        Player1.setMoney(1000);
                    }
                    else {
                        Player1.setMoney(500);
                    }
                }
                System.out.println("You landed on the " + animal.ReturnAnimal(player1Pos));
                isCard = dice.Dice2();
                if(isCard == 1) {
                    card.main();
                }
                if(animal.ReturnAnimal(player1Pos) == "Skip a go" || Player1.getMoney() < 0) {
                    turn += 1;
                }
                else {
                    System.out.println("Would you like to buy the " + animal.ReturnAnimal(player1Pos) + "?\n 1 = Yes // 2 = No");
                    while(check != "1") {
                        if(check == "2") {
                            break;
                        }
                        else{
                            System.out.println("wrong input");
                            check = Console.readLine();
                        }
                    }
                    if(check == "1") {
                        Animal.buy(player1Pos, 1);
                    }
                    if(Player1.getMoney() < 0) {
                        System.out.println(player1 + " has lost all money, " + player1 + " has lost!");
                    }
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
