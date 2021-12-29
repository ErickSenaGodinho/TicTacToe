/*
 * Copyright © 2021 Erick Sena Godinho. All rights reserved.
 */

import javax.swing.JOptionPane;

public final class TicTacToe {

    private final int[][] board;
    private Player player1;
    private Player player2;
    private int playerTime; //1 or 10
    private int moveNumber;

    TicTacToe() {
        playerTime = 1;
        board = new int[3][3];
        startPlayers();
        startBoard();
    }

    public void startPlayers() {
        player1 = new Player("Player 1", 'X');
        player2 = new Player("Player 2", 'O');

        String name = JOptionPane.showInputDialog(null, "Enter the Player 1 name:");
        player1.setName(name.isEmpty() ? player1.getName() : name);

        name = JOptionPane.showInputDialog(null, "Enter the Player 2 name:");
        player2.setName(name.isEmpty() ? player2.getName() : name);
    }

    public void startBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 0;
            }
        }
        this.moveNumber = 0;
    }

    public boolean makePlay(int y, int x) {
        if (board[y][x] == 0) {
            board[y][x] = playerTime;
            this.moveNumber++;
            return true;
        }
        return false;
    }

    public int[][] getBoard() {
        return board;
    }

    public int getPlayerTime() {
        return playerTime;
    }

    public void setPlayerTime(int playerTime) {
        this.playerTime = playerTime;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    private int checkBoard() {
        //Check Rows
        for (int i = 0; i < 3; i++) {
            switch (board[i][0] + board[i][1] + board[i][2]) {
                case 3:
                    return 1;
                case 30:
                    return 10;
            }
        }

        //Check Columns
        for (int i = 0; i < 3; i++) {
            switch (board[0][i] + board[1][i] + board[2][i]) {
                case 3:
                    return 1;
                case 30:
                    return 10;
            }
        }

        //Check Diagonals
        switch (board[0][0] + board[1][1] + board[2][2]) {
            case 3:
                return 1;
            case 30:
                return 10;
        }
        switch (board[0][2] + board[1][1] + board[2][0]) {
            case 3:
                return 1;
            case 30:
                return 10;
        }
        if (this.moveNumber == 9) {
            return 3;//Draw
        }
        return 0;
    }

    public int checkGameOver() {
        String[] options = new String[2];
        options[0] = "Yes";
        options[1] = "No";
        int result = -1;
        switch (checkBoard()) {
            case 1:
                result = JOptionPane.showOptionDialog(null, player1.getName() + " won!\nDo you want to play again?", "Result", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
                player1.addScore();
                break;
            case 10:
                result = JOptionPane.showOptionDialog(null, player2.getName() + " won!\nDo you want to play again?", "Result", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
                player2.addScore();
                break;

            case 3:
                result = JOptionPane.showOptionDialog(null, "Draw!\nDo you want to play again?", "Result", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
                break;
        }
        return result;
    }
}
