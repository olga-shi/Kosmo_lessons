package Kosmo_lessons.Vehicles.Ground.Moto;

public class Motorcycle extends MotoTransport {
    protected int numberOfPassengers;
    public Motorcycle(String name,
                      double loadCapacity,
                      double weight,
                      double height,
                      double length,
                      double width,
                      int wheels,
                      MotorcicleClassification motorcicleClassification) {
        super(name, loadCapacity, weight, height, length, width, wheels, motorcicleClassification);
        this.numberOfPassengers = numberOfPassengers;
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

}
