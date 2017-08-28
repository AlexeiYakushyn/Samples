/**
 * Created by alexei.yakushyn on 20.06.2017.
 */

public class ChessBoard {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i % 2 != 0) {
                    System.out.print(" *");
                } else System.out.print("* ");

            }
            System.out.println("");
        }
    }
}