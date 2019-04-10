package Kosmo_lessons.Vehicles.Ground.Railway.Wagons;

import Kosmo_lessons.Vehicles.Ground.Railway.RailwayTransport;

public class FreightWagon extends RailwayTransport {
    WagonType wagonType;
    enum WagonType {
        Tank, Gondola, Covered, Platform, Hopper, Dumpcar, Refrigerator, RocketCarrierPlatform
    }
    public FreightWagon(String name,
                        double loadCapacity,
                        double weight,
                        double height,
                        double length,
                        double width,
                        int wheels,
                        boolean moveOnTheRail,
                        WagonType wagonType
    ) {
        super(name, loadCapacity, weight, height, length, width, wheels, moveOnTheRail);
        this.wagonType = wagonType;
    }
}
