package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        TrainCompartment train = new TrainCompartment();

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show compartment details ");
            SaxionApp.printLine("* 2) Passenger enters");
            SaxionApp.printLine("* 3) Passenger leaves");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                SaxionApp.printLine(train);
                SaxionApp.pause();
            } else if (menuInput == 2) {
                train.enter();
                SaxionApp.pause();
            } else if (menuInput == 3) {
                train.leave();
                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
            }

        } while (menuInput != 0);
    }
}