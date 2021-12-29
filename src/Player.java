/*
 * Copyright © 2021 Erick Sena Godinho. All rights reserved.
 */

public class Player {

    private String name;
    private int score;
    private char symbol;

    Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void addScore() {
        this.score++;
    }
}
