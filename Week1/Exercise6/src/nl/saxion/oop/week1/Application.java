package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application());
	}

	public void run() {
		// We used the following code to produce the sample output.
		int function = 0;

		while (true) {
			BingoMill bm = new BingoMill();
			for (int i = 1; i <= 75; i++) bm.ballNums.add(i);

			SaxionApp.printLine("Drawing 10 random numbers using the Bingo Mill!");
			for (int i = 0; i < 10; i++) {
				SaxionApp.printLine("Draw " + (i + 1) + ": " + bm.draw() + " (" + bm.getNumberOfBallsRemaining() + " balls remaining)");
			}

			SaxionApp.pause();

			SaxionApp.printLine();
			SaxionApp.print("Enter 0 to reset the game or 1 to exit: ", Color.yellow);
			function = SaxionApp.readInt();

			if (function == 0) {
				bm.reset();
				SaxionApp.clear();
			}
			else {
				break;
			}
		}
	}
}
