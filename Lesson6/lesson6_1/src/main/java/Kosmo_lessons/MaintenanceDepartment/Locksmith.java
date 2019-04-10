package Kosmo_lessons.MaintenanceDepartment;
//Слесарь

import Kosmo_lessons.Employee;

public class Locksmith extends Employee {
    public Locksmith(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //слесарные работы
    public boolean makePlumbingWork(Object workOrder){
        return true;
    }
}
