package Kosmo_lessons.Administration;
//Делопроизводитель

import Kosmo_lessons.Employee;

public class Clerk extends Employee {
    public Clerk(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //ведение карточек учета персонала
public Object controlPersonnelRecordCard(Object employeesPersonalCard){
    return  employeesPersonalCard;
}
}
