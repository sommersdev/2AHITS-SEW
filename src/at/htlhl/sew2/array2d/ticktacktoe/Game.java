package at.htlhl.sew2.array2d.ticktacktoe;

public class Game {
    public Board board;
    public Player[] players;
    public int currentPlayer;

    public Game(Player[] players) {
        this.board = new Board();
        this.players = players;
    }

    public void start() {
        boolean finished = false;
        while(!finished) {
            IO.println("Player" + (currentPlayer + 1) + "'s turn");

            boolean placeSuccess = false;
            while(!placeSuccess) {
                String rowString = IO.readln("Row: ");
                String collString = IO.readln("Collum: ");

                int row = Integer.parseInt(rowString);
                int coll = Integer.parseInt(collString);

                placeSuccess = board.place(row - 1, coll - 1, players[currentPlayer]);
                if (!placeSuccess) {
                    IO.println("You cannot place outside of the board or on an already taken place!");
                }
            }
            board.print();

            finished = true;
            if (board.hasWon(players[0])) {
                IO.println("P1 won");
            } else if (board.hasWon(players[1])) {
                IO.println("P2 win");
            } else if (board.isFull()) {
                IO.println("Board is full");
            } else {
                finished = false;
            }
            this.switchPlayer();
        }
    }

    public void switchPlayer() {
        this.currentPlayer++;
        if (this.currentPlayer == this.players.length) {
            this.currentPlayer = 0;
        }
    }
}
