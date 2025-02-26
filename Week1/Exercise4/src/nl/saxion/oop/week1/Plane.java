package nl.saxion.oop.week1;

public class Plane{
    private boolean passengerLoad = false;
    private boolean luggageLoad = false;
    private boolean doorsLocked = true;

    public boolean isPassengerLoad() {
        return passengerLoad;
    }

    public boolean isLuggageLoad() {
        return luggageLoad;
    }

    public boolean isDoorsLocked() {
        return doorsLocked;
    }

    public void loadPassengers() {
        passengerLoad = true;
    }

    public void loadLuggage() {
        luggageLoad = true;
    }

    public void doors() {
        if (doorsLocked) doorsLocked = false;
        else doorsLocked = true;
    }
}
