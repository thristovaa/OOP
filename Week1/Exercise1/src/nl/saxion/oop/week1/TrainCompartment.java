package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class TrainCompartment {
    public int numberOfSeats = 50;
    public int compartmentClass = 2;
    public int numberOfSeatsInUse = 0;

    @Override
    public String toString() {
        return "There are currently " + this.numberOfSeatsInUse + " seats in use out of a total of " + this.numberOfSeats + " on the train compartment with class " + this.compartmentClass + ".";
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getCompartmentClass() {
        return compartmentClass;
    }

    public int getNumberOfSeatsInUse() {
        return numberOfSeatsInUse;
    }

    public void enter() {
        if (numberOfSeatsInUse < numberOfSeats) {
            numberOfSeatsInUse++;
            SaxionApp.printLine("A passenger enters the train...");
            SaxionApp.printLine("There are now " + this.numberOfSeatsInUse + " seats in use.");
        }
        else {
            SaxionApp.printLine("No more seats.");
        }
    }

    public void leave() {
        if (numberOfSeatsInUse > 0) {
            numberOfSeatsInUse--;
            SaxionApp.printLine("A passenger leaves the train...");
            SaxionApp.printLine("There are now " + this.numberOfSeatsInUse + " seats in use.");
        }
        else  {
            SaxionApp.printLine("No one to leave.");
        }
    }
}
