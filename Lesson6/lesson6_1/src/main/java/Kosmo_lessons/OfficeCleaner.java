package Kosmo_lessons;
//Уборщик служебных помещений

public class OfficeCleaner extends Employee {
    public OfficeCleaner(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //уборка мусора из помещений
    public boolean makeOfficeClearning(Object office){
        return true;
    }
}
