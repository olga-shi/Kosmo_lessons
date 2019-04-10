package Kosmo_lessons.Hospital;
//Психолог

import Kosmo_lessons.Employee;

public class Psychologist extends Employee {
    public Psychologist(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //психологическая помощь пациентам
    public boolean makePsyhoHelp(Object hospitalPatient){
        return true;
    }
}
