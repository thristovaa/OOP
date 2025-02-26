package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Pawn {

    public int xCoordinate;
    public int yCoordinate;

    public Pawn(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    private int gridSize = 75; // For drawing

    public boolean canMove(int xCoordinate, int yCoordinate) {
        if (xCoordinate == this.xCoordinate && yCoordinate + 1 == this.yCoordinate) return true;
        else return false;
    }

    public void draw() {
        int calcX = 100 + xCoordinate * gridSize;
        int calcY = 100 + yCoordinate * gridSize;

        SaxionApp.drawImage("resources/pawn_light.png", calcX + 10, calcY + 5);
    }

    public void showMoves() {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {
                if(canMove(row, col)) {
                    SaxionApp.setFill(Color.GREEN);

                    SaxionApp.drawCircle(100 + row * gridSize + (gridSize / 2), 100 + col * gridSize + (gridSize / 2), 25);
                }
            }
        }

    }
}
