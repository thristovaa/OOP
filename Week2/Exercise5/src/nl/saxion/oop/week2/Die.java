package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

public class Die {
    private static final int dieSides = 6;

    private int value;

    public Die() {
        roll();
    }

    public void roll() {
        this.value = SaxionApp.getRandomValueBetween(1, dieSides);
    }

    public void draw(int x, int y) {
        SaxionApp.drawImage("images/" + this.value + ".png", x, y);
    }

    public int getValue() {
        return value;
    }
}
