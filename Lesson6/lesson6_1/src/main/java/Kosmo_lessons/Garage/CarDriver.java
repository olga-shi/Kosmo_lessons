package Kosmo_lessons.Garage;
//Водитель автомобиля

import Kosmo_lessons.Employee;

public class CarDriver extends Employee {
    public CarDriver(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //вождение автотранспорта
    public boolean drivingCar(Object car){
        return true;
    }
}
