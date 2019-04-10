package Kosmo_lessons.Vehicles.Ground.Moto;

import Kosmo_lessons.Vehicles.Ground.GroundVehicle;

public class MotoTransport extends GroundVehicle {

    protected MotorcicleClassification motorcicleClassification;
    protected MotoWeightClassification motoWeightClassification;
    protected String color;

    public enum MotorcicleClassification {multySeat, singleSeat, withoutChainDrive}
    public enum MotoWeightClassification {ultralight, lung, medium, heavy, undefined}

    public MotoTransport(String name,
                         double loadCapacity,
                         double weight,
                         double height,
                         double length,
                         double width,
                         int wheels,
                         MotorcicleClassification motorcicleClassification
                         //MotoWeightClassification motoWeightClassification
    ) {
        super(name, loadCapacity, weight, height, length, width, wheels);
        this.motorcicleClassification = motorcicleClassification;
        this.motoWeightClassification = GetWeightClassificationName(weight);

        //this.motoWeightClassification = motoWeightClassification;
    }
    public MotoWeightClassification GetWeightClassificationName(double weight) {
        if (weight >= 60 && weight <= 80) {
            return MotoWeightClassification.ultralight;
        } else if (weight >= 120 && weight <= 140) {
            return MotoWeightClassification.lung;
        } else if (weight >= 150 && weight <= 170) {
            return MotoWeightClassification.medium;
        } else if (weight >= 180) {
            return MotoWeightClassification.heavy;
        }else {
            return MotoWeightClassification.undefined;
        }


    }

    public MotorcicleClassification getMotorcicleClassification() {
        return motorcicleClassification;
    }

    public void setMotorcicleClassification(MotorcicleClassification motorcicleClassification) {
        this.motorcicleClassification = motorcicleClassification;
    }

    public MotoWeightClassification getMotoWeightClassification() {
        return motoWeightClassification;
    }

    public void setMotoWeightClassification(MotoWeightClassification motoWeightClassification) {
        this.motoWeightClassification = motoWeightClassification;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
