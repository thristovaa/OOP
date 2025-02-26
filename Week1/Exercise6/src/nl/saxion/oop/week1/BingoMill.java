package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class BingoMill {
    private int balls = 75;

    public ArrayList<Integer> ballNums = new ArrayList<>();

    public int getNumberOfBallsRemaining() {
        return balls;
    }

    public int draw() {
        int chosenBall = SaxionApp.getRandomValueBetween(1, balls);
        balls--;

        ballNums.remove(chosenBall - 1);

        return chosenBall;
    }

    public void reset() {
        ballNums.clear();
    }
}
