package Kosmo_lessons;
//Уборщик территории

public class TerritoryCleaner extends Employee {
    public TerritoryCleaner(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //уборка мусора с территории космодрома
    public boolean makeTerritoryClearning(Object spaceship){
        return true;
    }
}
