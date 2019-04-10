package Kosmo_lessons.Administration;

import Kosmo_lessons.Employee;

//Экономист
public class Economist extends Employee {
    public Economist(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    public double calculateCostOfSpacePrograms (Object spaceProgram){
        double costOfSpaceProgram = 0;
        return costOfSpaceProgram;
    }
    //расчет затрат на космические программы и себестоимости пуска
    public double calculateLaunchCost (Object spaceShip){
        double spaceShipLaunchCost = 0;
        return spaceShipLaunchCost;
    }
}
