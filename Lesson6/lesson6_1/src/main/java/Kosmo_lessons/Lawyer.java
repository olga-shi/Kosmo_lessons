package Kosmo_lessons;
//Юрисконсульт

public class Lawyer extends Employee{
    public Lawyer(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //подготовка контрактов
    public Object prepareContract(Object contract){
        //contract.prepare(); // представим, что тут контракт каким - то образом готовится
        return contract;
    }
    //оформление контрактов
    public Object drawAppContract(Object contract){
        //contract.drawApp(); .. представим, что тут контракт каким - то образом оформляется
        return contract;
    }
    //представление предприятия в судах
    public Object representTheInteress(Object lawCourt){ // про госорганы будет аналогичная ситуация, не стала описывать
        Object decree = new Object();
        //Object decree = lawCourt.decide(this); // тут описывается поход нашего юриста в суд на заседание, в результате заседания должно быть какое - то постановленеи
        return decree;
    }
}
