package at.htlhl.sew2.array2d.tictactoe;

public class Board {
    private Player[][] grid;

    public Board() {
        grid = new Player[3][3];
    }

    public boolean place(int row, int col, Player player) {
        if ((this.grid[row][col] == null) || (row > 0 && row < 4 && col > 0 && col < 4)) {
            this.grid[row][col] = player;
            return true;
        }
        return false;
    }

    public boolean hasWon(Player player) {
        for (int i = 0; i < 3; i++) {
            if (checkSame(player, grid[i]) || (player.equals(grid[0][i]) && grid[0][i].equals(grid[1][i]) && grid[1][i].equals(grid[2][i]))) {
                return true;
            }
        }

        Player[][] diagonals = new Player[2][3];
        for (int i = 0; i < 3; i++) {
            diagonals[0][i] = grid[i][i];
            diagonals[1][i] = grid[i][2 - i];
        }

        for (int i = 0; i < 2; i++) {
            if (checkSame(player, diagonals[i])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkSame(Player[] list) {
        if (list[0] == null) return false;
        for (int i = 1; i < list.length; i++) {
            if (list[i] == null || !list[i - 1].equals(list[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean checkSame(Player initialPlayer, Player[] list) {
        if (!checkSame(list)) return false;
        return initialPlayer.equals(list[0]);
    }

    public boolean isFull() {
        for (Player[] row : this.grid) {
            for (Player player : row) {
                if (player == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public void print() {
        for (Player[] players : grid) {
            IO.print("|");
            for (Player player : players) {
                IO.print(" ");
                if (player != null) {
                    IO.print(player.getSymbol());
                } else {
                    IO.print(" ");
                }
                IO.print(" |");
            }
            IO.println();
        }
    }
}
