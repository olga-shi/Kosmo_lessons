package Kosmo_lessons;
//Специалист

public class Technician extends Employee {
    public Technician(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //Cборка КА и РН
    public Object assembly (Object spaceship){
        return spaceship;
    }
}
