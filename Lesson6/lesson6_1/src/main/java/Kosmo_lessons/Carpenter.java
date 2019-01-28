package Kosmo_lessons;
//Плотник
//столярные работы
public class Carpenter extends Employee {
    public Carpenter(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //столярные работы
    public boolean makeCarpentry(Object workOrder){
        return true;
    }
}
