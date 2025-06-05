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
    Player Player1 = new Player();
    Player Player2 = new Player();
    Player Player3 = new Player();
    Player Player4 = new Player();

    public void Main() {
        board[0] = "Start"; board[1] = "Penguin"; board[2] = "Rabbit";
        board[3] = "Squirrel"; board[4] = "Dog"; board[5] = "Cat";
        board[6] = "Deer"; board[7] = "Gazelle"; board[8] = "Giraffe ";
        board[9] = "Chimp"; board[10] = "Parrot"; board[11] = "Sheep";
        board[12] = "Pigeon"; board[13] = "Skip a go"; board[14] = "Hawk";
        board[15] = "Tuna"; board[16] = "Eagle"; board[17] = "Whale";
        board[18] = "Bison"; board[19] = "Leopard"; board[20] = "Lynx";
        board[21] = "Tiger"; board[22] = "Orca"; board[23] = "Cobra";
        board[24] = "Komodo Dragon"; board[25] = "Lion";
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
                        Player1.addMoney(1000);
                    }
                    else {
                        Player1.addMoney(500);
                    }
                }
                displayBoard();
                isCard = dice.Dice2();
                if(isCard == 1) {
                    card.main();
                }
                System.out.println("You landed on the " + animal.ReturnAnimal(player1Pos));
                if(animal.ReturnAnimal(player1Pos) == "Skip a go") {
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
                    if(Player1.getMoney() <= 0) {
                        System.out.println(player1 + " has lost all money, " + player1 + " has lost!");
                    }
                    turn += 1;
                }
            }
            if(turn == 2) {
                System.out.println(player2 + "'s turn");
                player1Pos += dice.Dice1();
                if(player2Pos > 26) {
                    player2Pos -= 26;
                    if(player2Pos == 1) {
                        Player2.addMoney(1000);
                    }
                    else {
                        Player2.addMoney(500);
                    }
                }
                displayBoard();
                isCard = dice.Dice2();
                if(isCard == 1) {
                    card.main();
                }
                System.out.println("You landed on an " + animal.ReturnAnimal(player2Pos));
                if(animal.ReturnAnimal(player2Pos) == "Skip a go") {
                    if(playerCount > 2) {
                        turn += 1;
                    }
                    else {
                        turn = 1;
                    }
                }
                else{
                    System.out.println("Would you like to buy the " + animal.ReturnAnimal(player2Pos) + "?\n 1 = Yes // 2 = No");
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
                        Animal.buy(player2Pos, 1);
                    }
                    if(Player2.getMoney() <= 0) {
                        System.out.println(player2 + " has lost all money, " + player2 + " has lost!");
                        Player2.hasLost();
                    }
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
                    if(player3Pos == 1) {
                        Player3.addMoney(1000);
                    }
                    else {
                        Player3.addMoney(500);
                    }
                }
                displayBoard();
                isCard = dice.Dice2();
                if(isCard == 1) {
                    card.main();
                }
                System.out.println("You landed on the " + animal.ReturnAnimal(player3Pos));
                if(animal.ReturnAnimal(player3Pos) == "Skip a go") {
                    if(playerCount > 3) {
                        turn += 1;
                    }
                    else {
                        turn = 1;
                    }
                }
                else{
                    System.out.println("Would you like to buy the " + animal.ReturnAnimal(player3Pos) + "?\n 1 = Yes // 2 = No");
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
                        Animal.buy(player3Pos, 1);
                    }
                    if(Player3.getMoney() <= 0) {
                        System.out.println(player3 + " has lost all money, " + player3 + " has lost!");
                        Player3.hasLost();
                    }
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
                    if(player4Pos == 1) {
                        Player4.addMoney(1000);
                    }
                    else {
                        Player4.addMoney(500);
                    }
                }
                isCard = dice.Dice2();
                if(isCard == 1) {
                    card.main();
                }
                System.out.println("You landed on an " + Animal.ReturnAnimal(player4Pos));
                if(animal.ReturnAnimal(player4Pos) == "Skip a go") {
                    turn = 1;
                }
                else{
                    System.out.println("Would you like to buy the " + animal.ReturnAnimal(player4Pos) + "?\n 1 = Yes // 2 = No");
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
                        Animal.buy(player4Pos, 1);
                    }
                    if(Player4.getMoney() <= 0) {
                        System.out.println(player4 + " has lost all money, " + player4 + " has lost!");
                        Player4.hasLost();
                    }
                    turn = 1;
                }
            }
        }
        return playerWin;
    }

    public void displayBoard() {
        for(int i = 0; i < board.length; i++) {
            System.out.println(board[i]);
            if(player1Pos - 1 == i) {
                System.out.println("--" + player1 + "--");
            }
            if(player2Pos - 1 == i) {
                System.out.println("--" + player1 + "--");
            }
            if(player3Pos - 1 == i) {
                System.out.println("--" + player1 + "--");
            }
            if(player4Pos - 1 == i) {
                System.out.println("--" + player1 + "--");
            }
            System.out.println("\n");
        }
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
