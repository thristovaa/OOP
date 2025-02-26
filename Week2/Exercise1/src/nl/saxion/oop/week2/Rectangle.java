package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Rectangle {
    private int x, y, width, height;
    private Color color;

    public Rectangle(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(Color color) {
        this.color = color;
    }

    public Rectangle() {
    }

    public void draw() {
        SaxionApp.setFill(color);
        SaxionApp.drawRectangle(this.x, this.y, this.width, this.height);
    }
}
