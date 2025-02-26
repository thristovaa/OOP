package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        Car myCar = new Car("BMW", "A 1234 BC", 50, 50, 10, 0);
        // Usage example, assume the car does 10 km to a litre gas:
        // myCar.getCurrentFuel(); --> Suppose this returns 50 litres
        // myCar.drive(100);
        // myCar.getCurrentFuel(); --> This should now return 40 litres
        
        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Display statistics of the car ");
            SaxionApp.printLine("* 2) Drive some kilometers");
            SaxionApp.printLine("* 3) Refuel");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                SaxionApp.printLine(myCar);
                SaxionApp.pause();
            } else if (menuInput == 2) {
                SaxionApp.print("How many kilometers are you going to drive? ");
                int milesToDrive = SaxionApp.readInt();

                if (milesToDrive * myCar.getFuelConsumption() > myCar.getCurrentFuel()){
                    SaxionApp.printLine("You can't drive that far!", Color.RED);
                } else {
                    myCar.drive(milesToDrive);

                    SaxionApp.printLine("You drove " + milesToDrive + " kilometers", Color.GREEN);
                    SaxionApp.printLine("You have " + myCar.getCurrentFuel() + " liters left");
                }

                SaxionApp.pause();
            } else if (menuInput == 3) {
                SaxionApp.print("How many litres do you want to throw into the tank? ");
                int litres = SaxionApp.readInt();

                if (myCar.getCurrentFuel() + litres > myCar.getTankSize()){
                    SaxionApp.printLine("You cannot overfill the tank!", Color.RED);
                } else {
                    myCar.refuel(litres);

                    SaxionApp.printLine("You have " + litres + " litres", Color.GREEN);
                }

                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
            }
        } while (menuInput != 0);

    }
}
