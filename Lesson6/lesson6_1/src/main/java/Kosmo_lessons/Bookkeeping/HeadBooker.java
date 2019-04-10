package Kosmo_lessons.Bookkeeping;
//Главный бухгалтер

import Kosmo_lessons.Employee;

public class HeadBooker extends Employee {
    public HeadBooker(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //контроль фонда оплаты труда
    public boolean controllPayroll(Object payroll){
        return true; // тут будет осуществлен какой - то контроль фонда оплаты труда
    }
    //операции через банковские счета предприятия
    public Object makeBankTransaction(Object bankBill, double sum){
        // bankBill.reduce(sum); // описан, метод, который уменьшает счёт. В качестве возможного примера
         return bankBill;
    }
    //операции с контрагентами
    public Object addCounterpart(Object counterpart, Object counterpartList){
        //counterpartList.add(counterpart); // описан метод для добавления контрагента в список контрагентов
        return counterpartList;
    }


}
