package nl.saxion.oop.week2;

import java.util.ArrayList;
import java.util.Arrays;

public class Dealership {
    private ArrayList<Car> listOfCars = new ArrayList<>();

    public void addCar(Car newCar) {
        for (Car car : listOfCars){
            if (car.getLicense().equals(newCar.getLicense())){
                throw new IllegalArgumentException("Two different cars can't have the same license!");
            }
        }
        listOfCars.add(newCar);
    }

    public int getNrOfCarsByBrand(String brand) {
        int count = 0;

        for (Car car : listOfCars) {
            if (car.getBrand().equals(brand)) count++;
        }

        return count;
    }
}
