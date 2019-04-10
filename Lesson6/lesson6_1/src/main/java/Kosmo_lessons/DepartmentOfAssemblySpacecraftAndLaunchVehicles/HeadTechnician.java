package Kosmo_lessons.DepartmentOfAssemblySpacecraftAndLaunchVehicles;
//Главный специалист

import Kosmo_lessons.Employee;

public class HeadTechnician extends Employee {
    // добавляем конструктор класса
    public HeadTechnician(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //контроль сборки КА и РН
    public Object controlAssembly (Object spaceship){
        return spaceship;
    }
}
