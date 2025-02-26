package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }
    Plane plane = new Plane();

    public void run() {
        // TEST - Scenario 1: The successful way
        // plane.loadPassengers();
        // plane.loadLuggage();
        // plane.lockDoors();
        // plane.depart();

        // TEST - Scenario 2: Failure due to locked doors
        // plane.lockDoors();
        // plane.loadPassengers(); <-- This should result in a print stating that we cannot depart!

        // TEST - Scenario 3: Failure due to not loading passengers
        // plane.loadLuggage();
        // plane.lockDoors();
        // plane.depart(); <-- This should result in a print stating that we cannot depart!

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("****** Aircraft preparation terminal ******");
            SaxionApp.printLine("* 1) Load passengers");
            SaxionApp.printLine("* 2) Load luggage");
            SaxionApp.printLine("* 3) Lock/Unlock doors ");
            SaxionApp.printLine("* 9) Depart ");
            SaxionApp.printLine("* 0) Exit!");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                SaxionApp.printLine("Loading passengers..");

                if (plane.isDoorsLocked()) SaxionApp.printLine("Unable to load passengers, doors are locked!", Color.RED);
                else plane.loadPassengers();

                SaxionApp.pause();
            } else if (menuInput == 2) {
                SaxionApp.printLine("Loading luggage..");
                plane.loadLuggage();

                SaxionApp.pause();
            } else if (menuInput == 3) {
                plane.doors();

                if (plane.isDoorsLocked()){
                    SaxionApp.printLine("Doors are locked!");
                } else {
                    SaxionApp.printLine("Doors are unlocked!");
                }

                SaxionApp.pause();
            } else if (menuInput == 9) {
                depart();

                SaxionApp.pause();
            }

        } while (menuInput != 0);

    }

    public void depart() {
        if (plane.isDoorsLocked() && plane.isLuggageLoad() && plane.isPassengerLoad()) {
            SaxionApp.printLine("The plane is ready to depart! Preparation complete!", Color.GREEN);
        } else {
            SaxionApp.printLine("The plane is not ready for departure yet!", Color.YELLOW);
        }
    }
}
