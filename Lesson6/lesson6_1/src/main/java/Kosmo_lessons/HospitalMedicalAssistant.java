package Kosmo_lessons;
//Фельдшер

public class HospitalMedicalAssistant extends Employee {
    public HospitalMedicalAssistant(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //помощь врачу
    public boolean helpsTheDoctor(Object doctorWork){
        return true;
    }
    //уход за пациентами
    public boolean careForPatients(Object hospitalPatient){
        return true;
    }
    //перевязки
    public boolean makeDress(Object hospitalPatient){
        return true;
    }
    //процедуры
    public boolean makeProcedures(Object hospitalPatient){
        return true;
    }
}
