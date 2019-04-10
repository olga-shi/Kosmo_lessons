package Kosmo_lessons.MaintenanceDepartment;
//Заведующий хозяйством

import Kosmo_lessons.Employee;

public class HeadOfTheHousehold extends Employee {
    public HeadOfTheHousehold(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //управление работами по поддержанию помещений и территории космодрома в надлежащем виде
    public boolean  manageTerritoryMaintenance(Object spaceport){
        return true;
    }
    //закупка материалов
    public Object procureMaterials(Object materialRequestList){
        Object newMatetial = new Object();
        return newMatetial;
    }
    //обеспечение материалами
    public Object provideMaterials(Object materialRequestList){
        Object matetial = new Object();
        return matetial;
    }
}
