package Kosmo_lessons.MaintenanceDepartment;

import Kosmo_lessons.Employee;

//Плотник
//столярные работы
public class Carpenter extends Employee {
    public Carpenter(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //столярные работы
    public boolean makeCarpentry(Object workOrder){
        return true;
    }
}
