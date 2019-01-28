package Kosmo_lessons;
//Начальник гаража

public class HeadOfGarage extends Employee{
    public HeadOfGarage(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    public boolean controlofTheGarageStaff(Object GarageStaff){
        return true; // тут будет проводиться какой-то контроль
}
    //обеспечивает зап. частями
    public Object provideSpare(Object spareRequest){
        Object sparePart = new Object();
        return sparePart;
    }
    //обеспечивает топливом
    public Object provideFuel(Object fuelRequest){
        Object fuel = new Object();
        return fuel;
    }
}
