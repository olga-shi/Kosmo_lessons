package Kosmo_lessons;
//Водитель автомобиля

public class CarDriver extends Employee{
    public CarDriver(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //вождение автотранспорта
    public boolean drivingCar(Object car){
        return true;
    }
}
