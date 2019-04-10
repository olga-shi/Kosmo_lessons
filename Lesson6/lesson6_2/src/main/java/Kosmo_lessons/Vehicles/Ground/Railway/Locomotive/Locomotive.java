package Kosmo_lessons.Vehicles.Ground.Railway.Locomotive;

import Kosmo_lessons.Vehicles.Ground.Railway.RailwayTransport;

public class Locomotive extends RailwayTransport {

    protected LocomotiveTipe locomotiveTipe;
    // типы локомотивов
    enum LocomotiveTipe {
        Parovoz, Teplovoz, Electrovoz
    }
    public Object engine;

    public Locomotive(String name,
                      double loadCapacity,
                      double weight,
                      double height,
                      double length,
                      double width,
                      int wheels,
                      boolean moveOnTheRail,
                      LocomotiveTipe locomotiveTipe,
                      Object engine
    ) {
        super(name, loadCapacity, weight, height, length, width, wheels, moveOnTheRail);
        this.locomotiveTipe = locomotiveTipe;
        this.engine = engine;
    }

}
