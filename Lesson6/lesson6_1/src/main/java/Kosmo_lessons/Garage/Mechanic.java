package Kosmo_lessons.Garage;
//Механик

import Kosmo_lessons.Employee;

public class Mechanic extends Employee {
    public Mechanic(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //ремонт транспорта
     public Object repair(Object BrockenMotorTransport){
         Object motorTransport = new Object();
         return motorTransport;
     }
    //диагностика транспорта
    public Object diagnostic(Object MotorTransport){
        Object diagnosticCard = new Object();
        return diagnosticCard;
    }
}
