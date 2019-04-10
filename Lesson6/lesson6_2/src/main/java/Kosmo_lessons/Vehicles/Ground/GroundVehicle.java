package Kosmo_lessons.Vehicles.Ground;

import Kosmo_lessons.Vehicles.Vehicle;

public class GroundVehicle extends Vehicle {
    protected int wheels;
    protected boolean hasWheels = true;


    public GroundVehicle(String name,
                         double loadCapacity,
                         double weight,
                         double height,
                         double length,
                         double width,
                         int wheels
    ) {
        super(name, loadCapacity, weight, height, length, width);
        this.wheels = wheels;

    }


    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }
}
