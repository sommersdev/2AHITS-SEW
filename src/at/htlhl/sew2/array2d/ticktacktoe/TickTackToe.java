import at.htlhl.sew2.array2d.ticktacktoe.Game;
import at.htlhl.sew2.array2d.ticktacktoe.Player;

void main() {
    Player[] players = new Player[2];
    players[0] = new Player('X');
    players[1] = new Player('O');

    Game game = new Game(players);
    game.start();

    boolean finished = false;
}
