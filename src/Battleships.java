/**
 * Created by johanpettersson on 08/09/15.
 */
public class Battleships {

    private char[][] player1;
    private char[][] player2;

    public Battleships() {
        player1 = new char[10][10];
        player2 = new char[10][10];
        for (int i = 0; i < player1.length; i++) {
            player1[i] = "------------".toCharArray();
        }
        player2 = player1.clone();
        /**
         System.out.println("Player1");
         print(1);
         System.out.println("");
         System.out.println("Player2");
         print(2);
         */

        //TODO add how to and credits
        //System.out.println("Game description and about");
    }

    //TODO add logic for putting ships in the vertical orientation
    //TODO add error handling
    //TODO add graphical user interface

    public int putShip(int player, String orientation, int x, int y, int length) {
        System.out.println("putShip() orientation: " + orientation + ", x: " + x + ", y: " + y + ", length: " + length);

        if (orientation.toLowerCase() == "horizontal" || orientation.toLowerCase() == "h") {
            if (length == 1 && x < 10 && x > 0) {
                if (y < 10 && y >= 0) {
                    System.out.println("len1");
                    if (player1[x][y] == '-') {
                        player1[x][y] = 'M';
                    }
                }
            }
        }
        if (orientation.toLowerCase() == "horizontal" || orientation.toLowerCase() == "h") {
            if (length == 2 && x < 9 && x > 0) {
                if (y < 10 && y >= 0) {
                    System.out.println("len2");
                    if (player1[x][y] == '-' && player1[x + 1][y] == '-') {
                        player1[x][y] = 'M';
                        player1[x + 1][y] = 'M';
                    }
                }
            }
        }
        if (orientation.toLowerCase() == "horizontal" || orientation.toLowerCase() == "h") {
            if (length == 3 && x < 8 && x > 0) {
                if (y < 10 && y >= 0) {
                    System.out.println("len3");
                    if (player1[x][y] == '-' && player1[x + 1][y] == '-' && player1[x + 2][y] == '-') {
                        player1[x][y] = 'M';
                        player1[x + 1][y] = 'M';
                        player1[x + 2][y] = 'M';
                    }
                }
            }
        }
        if (orientation.toLowerCase() == "horizontal" || orientation.toLowerCase() == "h") {
            if (length == 4 && x < 7 && x > 0) {
                if (y < 10 && y >= 0) {
                    System.out.println("len4");
                    if (player1[x][y] == '-' && player1[x + 1][y] == '-' && player1[x + 2][y] == '-' && player1[x + 3][y] == '-') {
                        player1[x][y] = 'M';
                        player1[x + 1][y] = 'M';
                        player1[x + 2][y] = 'M';
                        player1[x + 3][y] = 'M';
                    }
                }
            }
        }

        return 0;
    }


    public void print(int player) {
        if (player == 1)
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(player1[i][j] + " ");
                }
                System.out.println("");
            }
        if (player == 2)
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(player1[i][j] + " ");
                }
                System.out.println("");
            }
    }
}
