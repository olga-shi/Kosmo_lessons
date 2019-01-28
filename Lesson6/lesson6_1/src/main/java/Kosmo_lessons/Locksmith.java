package Kosmo_lessons;
//Слесарь

public class Locksmith extends Employee {
    public Locksmith(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //слесарные работы
    public boolean makePlumbingWork(Object workOrder){
        return true;
    }
}
