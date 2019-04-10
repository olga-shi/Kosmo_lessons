package Kosmo_lessons.MaintenanceDepartment;
//Уборщик территории

import Kosmo_lessons.Employee;

public class TerritoryCleaner extends Employee {
    public TerritoryCleaner(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //уборка мусора с территории космодрома
    public boolean makeTerritoryClearning(Object spaceship){
        return true;
    }
}
