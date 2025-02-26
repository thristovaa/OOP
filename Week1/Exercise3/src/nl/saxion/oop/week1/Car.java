package nl.saxion.oop.week1;

public class Car {
    private String brand, licensePlate;
    private int mileage, currentFuel, tankSize, fuelConsumption;

    //fuel consumption = consumption 16 means 16 km on 1 litre of petrol

    public Car(String brand, String licensePlate, int tankSize, int currentFuel, int fuelConsumption, int mileage) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.tankSize = tankSize;
        this.currentFuel = currentFuel;
        this.fuelConsumption = fuelConsumption;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return brand + "(" + licensePlate + "), " + tankSize + " litters (" + (currentFuel * 100 / tankSize) + "%), " + mileage + " km" ;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTankSize() {
        return tankSize;
    }

    public void drive(int km){
        mileage += km;
        currentFuel -= km * fuelConsumption;
    }

    public void refuel(int litres) {
        currentFuel += litres;
    }

}
