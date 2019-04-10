package Kosmo_lessons.MaintenanceDepartment;
//Уборщик служебных помещений

import Kosmo_lessons.Employee;

public class OfficeCleaner extends Employee {
    public OfficeCleaner(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //уборка мусора из помещений
    public boolean makeOfficeClearning(Object office){
        return true;
    }
}
