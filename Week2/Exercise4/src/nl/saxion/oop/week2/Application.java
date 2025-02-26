package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;
import nl.saxion.oop.week2.model.Airplane;
import nl.saxion.oop.week2.model.Passenger;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        int menuInput = -1;
        Airplane plane = new Airplane(40);
        do {
            // We'll help you out by generating a random passenger to load.. Have a look at the method definition in the Passenger class!
            Passenger nextPassenger = Passenger.generateRandomPassenger();

            SaxionApp.clear();
            SaxionApp.printLine("****** Aircraft preparation terminal ******");
            SaxionApp.printLine("* 1) Load next passenger (" + nextPassenger + ")");
            SaxionApp.printLine("* 2) Lock/Unlock doors ");
            SaxionApp.printLine("* 9) Depart ");
            SaxionApp.printLine("* 0) Exit!");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");

            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {

                SaxionApp.printLine("The next passenger is: " + nextPassenger.toString());
                SaxionApp.print("They have ");
                SaxionApp.print(nextPassenger.getLuggage().size(), Color.ORANGE);
                SaxionApp.print(" bags with a total weight of ");
                SaxionApp.print(nextPassenger.getTotalLuggageWeight(), Color.ORANGE);
                SaxionApp.printLine(" kg.");

                SaxionApp.printLine();

                try {
                    plane.boardPassenger(nextPassenger);
                } catch (Exception ex) {
                    SaxionApp.printLine(ex.toString());
                }

                SaxionApp.pause();
            } else if (menuInput == 2) {
                if (plane.hasLockedDoors()){
                    plane.unlockDoors();
                    SaxionApp.printLine("Doors Unlocked!");
                } else {
                    plane.lockDoors();
                    SaxionApp.printLine("Doors Locked!");
                }

                SaxionApp.pause();
            } else if (menuInput == 9) {
                try {
                    plane.depart();
                } catch (Exception ex) {
                    SaxionApp.printLine(ex.toString());
                }

                SaxionApp.pause();

                break;
            }

        } while (menuInput != 0);

    }
}
