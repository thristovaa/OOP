package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application(), 1000, 1000);
	}

	public void run() {
		drawGrid();

		// TODO: Replace code below with constructors
		King k = new King(3, 6);
		Pawn p = new Pawn(6, 4);

		k.draw();
		k.showMoves();

		p.draw();
		p.showMoves();
	}

	private void drawGrid() {
		int gridSize = 75;

		// Draw grid
		// First horizontal lines.
		for(int i = 0; i < 8 + 1; i++) { // +1 for trailing line
			int maxLevel = 100 + (i * gridSize);

			SaxionApp.drawLine(maxLevel, 100, maxLevel, 100 + (8 * gridSize));
			SaxionApp.drawLine(100, maxLevel, 100 + (8 * gridSize), maxLevel);
		}

		// Draw labels
		for(int i = 0; i < 8; i++) {
			int fixedPos = 100 - (gridSize / 2);
			int movPos = 100 + (i * gridSize) + (int) (gridSize / 2.5);

			SaxionApp.drawText("" + (i+1), movPos, fixedPos , 25);
			SaxionApp.drawText("" + (i+1), fixedPos, movPos, 25);
		}

	}

}
