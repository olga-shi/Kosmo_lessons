package Kosmo_lessons;

public class Inspector extends Employee {
    protected double bonus; // премия. Поле добавлено в целях тренировки

    public Inspector(String name, String surname, double salary, double bonus) {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    public void printSpaceship(Object spaceship) {
        System.out.println(spaceship);
    }

    public boolean checkAssembly(Object spaceship){
        if (true) { // тут будет какая - то проверка сборки корабля
            return true;
        } else {
            return false;
        }
    }




}
