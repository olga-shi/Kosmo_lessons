package Kosmo_lessons.Vehicles.Ground.Auto;

public class Truck extends AutoTransport {
    public Truck(String name,
                 double loadCapacity,
                 double weight,
                 double height,
                 double length,
                 double width,
                 int wheels) {
        super(name, loadCapacity, weight, height, length, width, wheels);
    }

    public enum TruckType {Delivery, GeneralPurpose, Tractor, DumpTruck}
    protected TruckType = this.TruckType;


    protected boolean bodyControl;

    public TruckType(bodyControl) {
        if (bodyControl = false) {
            return TruckType.Delivery;
        } else if (bodyControl = true){
            return TruckType.GeneralPurpose;
        }
    }

    public boolean isBodyControl() {
        return bodyControl;
    }

    public void setBodyControl(boolean bodyControl) {
        this.bodyControl = bodyControl;
    }
}
