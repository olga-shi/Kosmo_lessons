package Kosmo_lessons.MaintenanceDepartment;

import Kosmo_lessons.Employee;

//Электромантер
public class Electrician extends Employee {
    public Electrician(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //электромонтажные работы
    public boolean makeElectricInstallationWork(Object workOrder){
        return true;
    }
    //пуско-наладка машин
    public Object makeCommissioningWork(Object machine){
        return machine;
    }
    //пуско-наладка оборудования
    public Object makeCommissioningWorkk(Object equipment){
        return equipment;

    }
}
