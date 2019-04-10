package Kosmo_lessons.Administration;
//Машинистка

import Kosmo_lessons.Employee;

public class Typist extends Employee {
    public Typist(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    // Набор текста: получает какую - то информацию (звук или текст) и  перепечатывает её
    public Object typing(Object information){
        Object typedText = new Object();
        return typedText;
    }
}
