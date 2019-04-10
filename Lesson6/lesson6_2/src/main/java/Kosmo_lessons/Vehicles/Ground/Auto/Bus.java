package Kosmo_lessons.Vehicles.Ground.Auto;

public class Bus extends AutoTransport {



    public Bus(String name,
               double loadCapacity,
               double weight,
               double height,
               double length,
               double width,
               int wheels) {
        super(name, loadCapacity, weight, height, length, width, wheels);
    }

    public enum BusDestination {CityBus, SchoolBus, IntercityBus, SleepingBus, SuburbanBus, AirportBus, SightseeingBus, MailBus, CargoBus, RitualBus }
    protected BusDestination = this.BusDestination;


}
