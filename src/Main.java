/**
 * Created by johanpettersson on 08/09/15.
 */
public class Main {
    public static void main(String[] args) {
        Battleships myGame = new Battleships();
        myGame.putShip(1, "h", 1, 1, 1);
        myGame.putShip(1, "h", 1, 2, 2);
        myGame.putShip(1, "h", 1, 3, 3);
        myGame.putShip(1, "h", 1, 4, 4);
        myGame.print(1);
    }
}
