package Kosmo_lessons.Vehicles.Air;

import Kosmo_lessons.Vehicles.Vehicle;

public class AirTransport extends Vehicle {

    protected AircraftClass aircraftClass;
    protected boolean moveOnTheAir = true; //могут передвигаться по небу
    protected int wheels;

    // классы летательных аппаратов
    enum AircraftClass {
        A , B, C, D, E, F, G, H, I, K, L, M, N, O, P, R, S
    }

    public AirTransport(String name,
                        double loadCapacity,
                        double weight,
                        double height,
                        double length,
                        double width,
                        AircraftClass aircraftClass
    ) {
        super(name, loadCapacity, weight, height, length, width);
        this.aircraftClass = aircraftClass;

    }

}
