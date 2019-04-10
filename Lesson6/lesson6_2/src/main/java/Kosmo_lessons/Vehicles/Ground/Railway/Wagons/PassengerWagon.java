package Kosmo_lessons.Vehicles.Ground.Railway.Wagons;

import Kosmo_lessons.Vehicles.Ground.Railway.RailwayTransport;

public class PassengerWagon extends RailwayTransport {
    protected int numberOfPassengers;
    public PassengerWagon(String name,
                          double loadCapacity,
                          double weight,
                          double height,
                          double length,
                          double width,
                          int wheels,
                          boolean moveOnTheRail,
                          int numberOfPassengers
    ) {
        super(name, loadCapacity, weight, height, length, width, wheels, moveOnTheRail);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
