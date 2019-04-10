package Kosmo_lessons.Vehicles.Ground.Auto;

public class Car extends AutoTransport {
    public enum CarClassification {MiniCar, SmallCar, MediumCar, LargeCar, ExecutiveCar, LuxuryCar, SportsCar, MultiPurposeCar, SportsUtilityCar}
    protected CarClassification = this.CarClassification;

    public Car(String name,
               double loadCapacity,
               double weight,
               double height,
               double length,
               double width,
               int wheels) {
        super(name, loadCapacity, weight, height, length, width, wheels);
    }

}
