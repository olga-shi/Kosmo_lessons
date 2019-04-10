package Kosmo_lessons.Vehicles.Ground.Auto;

import Kosmo_lessons.Vehicles.Ground.GroundVehicle;

public class AutoTransport extends GroundVehicle {

    public enum AutoTransportClass {especiallySmall, small, medium, large, higher}
    public enum AutoTransportType {passenger, bus, truck, tractor, dumpTruck, tank, wagon, specialCar}
    public enum CountryOfProduction {Russia, USA, Japan, Canada, Ucraine, Germany, Korea}
    public enum EngineType {gasoline, diesel, electric}

    protected AutoTransportClass = this.AutoTransportClass;
    protected  AutoTransportType = this.AutoTransportType;
    protected CountryOfProduction = this.CountryOfProduction;
    protected EngineType = this.EngineType;

    protected int modelNumber;
    protected int numberOfPassengers;
    protected double enginePower;
    protected String color;

    public AutoTransport(String name,
                         double loadCapacity,
                         double weight,
                         double height,
                         double length,
                         double width,
                         int wheels) {
        super(name, loadCapacity, weight, height, length, width, wheels);
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public double getEnginePower() {
        return enginePower;
    }



    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
