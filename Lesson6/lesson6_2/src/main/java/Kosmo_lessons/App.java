package Kosmo_lessons;

import Kosmo_lessons.Vehicles.Ground.Moto.MotoTransport;

public class App 
{
    public static void main( String[] args )
    {
        MotoTransport motorcicle = new MotoTransport(
                "Yamaha",
                200,
                500,
                150,
                150,
                50,
                2,
                MotoTransport.MotorcicleClassification.multySeat
        );

    }
}
