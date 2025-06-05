import java.lang.reflect.Array;

public class Animal {
    static String[] board = new String[26];
    static int[] cost = new int[26];
    static String[] player1 = new String[26];
    static String[] player2 = new String[26];
    static String[] player3 = new String[26];
    static String[] player4 = new String[26];

    static Player Player1 = new Player();
    static Player Player2 = new Player();
    static Player Player3 = new Player();
    static Player Player4 = new Player();

    public static void Main() {
        board[0] = "Start"; board[1] = "Penguin"; board[2] = "Rabbit";
        board[3] = "Squirrel"; board[4] = "Dog"; board[5] = "Cat";
        board[6] = "Deer"; board[7] = "Gazelle"; board[8] = "Giraffe ";
        board[9] = "Chimp"; board[10] = "Parrot"; board[11] = "Sheep";
        board[12] = "Pigeon"; board[13] = "Skip a go"; board[14] = "Hawk";
        board[15] = "Tuna"; board[16] = "Eagle"; board[17] = "Whale";
        board[18] = "Bison"; board[19] = "Leopard"; board[20] = "Lynx";
        board[21] = "Tiger"; board[22] = "Orca"; board[23] = "Cobra";
        board[24] = "Komodo Dragon"; board[25] = "Lion";

        cost[0] = 100; cost[1] = 100; cost[2] = 100;
        cost[3] = 150; cost[4] = 50; cost[5] = 200;
        cost[6] = 250; cost[7] = 250; cost[8] = 300;
        cost[9] = 350; cost[10] = 350; cost[11] = 400;
        cost[12] = 450; cost[14] = 450;
        cost[15] = 500; cost[16] = 500; cost[17] = 550;
        cost[18] = 600; cost[19] = 600; cost[20] = 650;
        cost[21] = 700; cost[22] = 700; cost[23] = 750;
        cost[24] = 800; cost[25] = 1000;
    }

    public static String ReturnAnimal(int pos) {
        Main();
        String val = board[pos];
        return val;
    }

    public static String buy(int pos, int player) {
        for(int i = 0; i < board.length; i++) {
            if(board[i].equals(player1[i])) {
                if(player == 2) {
                    Player2.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player1.addMoney(cost[pos - 1]);
                }
                if(player == 3) {
                    Player3.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player1.addMoney(cost[pos - 1]);
                }
                if(player == 4) {
                    Player4.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player1.addMoney(cost[pos - 1]);
                }
                return "Cannot buy animal, player 1 owns it";
            }
            if(board[i].equals(player2[i])) {
                if(player == 1) {
                    Player1.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player2.addMoney(cost[pos - 1]);
                }
                if(player == 3) {
                    Player3.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player2.addMoney(cost[pos - 1]);
                }
                if(player == 4) {
                    Player4.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player2.addMoney(cost[pos - 1]);
                }
                return "Cannot buy animal, player 2 owns it";
            }
            if(board[i].equals(player3[i])) {
                if(player == 1) {
                    Player1.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player3.addMoney(cost[pos - 1]);
                }
                if(player == 2) {
                    Player2.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player3.addMoney(cost[pos - 1]);
                }
                if(player == 4) {
                    Player4.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player1.addMoney(cost[pos - 1]);
                }
                return "Cannot buy animal, player 3 owns it";
            }
            if(board[i].equals(player4[i])) {
                if(player == 1) {
                    Player1.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player4.addMoney(cost[pos - 1]);
                }
                if(player == 2) {
                    Player2.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player4.addMoney(cost[pos - 1]);
                }
                if(player == 3) {
                    Player3.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                    Player4.addMoney(cost[pos - 1]);
                }
                return "Cannot buy animal, player 4 owns it.";
            }
        }
        if(player == 1) {
            if(Player1.getMoney() < cost[pos - 1]) {
                return "Cannot buy animal";
            }
            else {
                Player1.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                player1[pos - 1] = board[pos - 1];
                return "Player 1 has bought this animal";
            }
        }
        else if(player == 2) {
            if(Player2.getMoney() < cost[pos - 1]) {
                return "Cannot buy animal";
            }
            else {
                Player2.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                player2[pos - 1] = board[pos - 1];
                return "Player 2 has bought this animal";
            }
        }
        else if(player == 3) {
            if(Player3.getMoney() < cost[pos - 1]) {
                return "Cannot buy animal";
            }
            else {
                Player3.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                player3[pos - 1] = board[pos - 1];
                return "Player 3 has bought this animal";
            }
        }
        else {
            if(Player4.getMoney() < cost[pos - 1]) {
                return "Cannot buy animal";
            }
            else {
                Player4.subtractMoney(cost[pos - 1] - (cost[pos - 1] * 2));
                player4[pos - 1] = board[pos - 1];
                return "Player 4 has bought this animal";
            }
        }
    }
}
