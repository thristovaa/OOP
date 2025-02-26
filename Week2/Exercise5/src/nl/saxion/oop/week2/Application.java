package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application(), 1500, 1000);
	}

	public void run() {
		Cup c = new Cup();

		c.draw(100, 100);
	}
}
