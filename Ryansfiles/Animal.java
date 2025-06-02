import java.lang.reflect.Array;

public class Animal {
    static String[] board = new String[26];
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
    }

    public static String ReturnAnimal(int pos) {
        Main();
        String val = board[pos];
        return val;
    }
}
