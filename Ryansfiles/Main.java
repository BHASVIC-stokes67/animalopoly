public class Main {
    static String check = "";
    public static void start() {
        while(check != "1" || check != "2") {
            if(check == "1" || check == "2") {
                System.out.println("true");
            }
        }
        System.exit(0);
        Board board = new Board();
        board.Main();
    }

    public static void main(String[] args) {
        start();
    }
}