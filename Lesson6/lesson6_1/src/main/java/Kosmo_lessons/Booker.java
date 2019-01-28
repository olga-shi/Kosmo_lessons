package Kosmo_lessons;
//Бухгалтер

public class Booker extends Employee {
    public Booker(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //расчет зарплат персоналу
    public double calculateSalary (Employee employee){
        // тут вычисляется ЗП
        double bonus = 1.1;
        return employee.getSalary() * bonus;
    }
    //учет основных средств
    public boolean checkFixedAssets (Object fixedAssets){
        return true; // тут должен вестись учет ОС
    }

}
