package nl.saxion.oop.week2.model;

import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Airplane {
    private int maxPassengers;
    private int maxWeight = 25 * maxPassengers;
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private boolean doorsLocked = false;

    public Airplane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public int getTotalWeight() {
        int total = 0;

        for(Passenger passenger : passengers) {
            total += passenger.getTotalLuggageWeight();
        }

        return total;
    }

    public void boardPassenger(Passenger p) {
        if (passengers.size() < maxPassengers) passengers.add(p);
        else throw new IllegalArgumentException("Exceeding passenger limit");
    }

    public void lockDoors() {
        doorsLocked = true;
    }

    public void unlockDoors() {
        doorsLocked = false;
    }

    public boolean hasLockedDoors() {
        return doorsLocked;
    }

    public void depart() {
        if (doorsLocked) {
            SaxionApp.printLine("Departed", Color.GREEN);
        } else {
            throw new IllegalArgumentException("Plane cannot depart with doors unlocked!");
        }
    }
}
