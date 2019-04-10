package Kosmo_lessons.Vehicles.Ground.Railway;

import Kosmo_lessons.Vehicles.Ground.GroundVehicle;

public class RailwayTransport extends GroundVehicle {

    protected boolean moveOnTheRail = true; //могут передвигаться по рельсам
    protected RailwayTransport previous; // для определения предшествующего соседа
    protected RailwayTransport next; // для определения след. соседа

    public RailwayTransport(String name,
                            double loadCapacity,
                            double weight,
                            double height,
                            double length,
                            double width,
                            int wheels,
                            boolean moveOnTheRail) {
        super(name, loadCapacity, weight, height, length, width, wheels);
        this.moveOnTheRail = moveOnTheRail;
    }

    public RailwayTransport getPrevious() {
        return previous;
    }

    public void setPrevious(RailwayTransport previous) {
        this.previous = previous;
    }

    public RailwayTransport getNext() {
        return next;
    }

    public void setNext(RailwayTransport next) {
        this.next = next;
    }

    public boolean isMoveOnTheRail() {
        return moveOnTheRail;
    }

    public void setMoveOnTheRail(boolean moveOnTheRail) {
        this.moveOnTheRail = moveOnTheRail;
    }
}
