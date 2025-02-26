package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

public class Cup {
    private static final int numberOfDice = 5;
    private Die[] dice;

    public Cup() {
        dice = new Die[numberOfDice];

        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
        }
    }

    public void draw(int x, int y) {
        for (Die d : dice) {
            d.draw(x, y);
            x += 150;
        }
    }

    public boolean isYahtzee(){
        return false;
    }
}
