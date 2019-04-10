package Kosmo_lessons.MaintenanceDepartment;
//Комендант здания

import Kosmo_lessons.Employee;

public class BuildingCommandant extends Employee {
    public BuildingCommandant(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //управление работами по поддержанию помещений в надлежащем виде для конкретного здания
    public boolean  manageBuildingMaintenance(Object spaceportBuilding){
        return true;
    }
}
