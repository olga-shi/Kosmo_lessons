package Kosmo_lessons.Hospital;
//Врач

import Kosmo_lessons.Employee;

public class HospitalDoctor extends Employee {
    public HospitalDoctor(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //постановка диагноза
    public Object settingDiag(Object hospitalPatient){
        Object diagnosed = new Object();
        return diagnosed; // поставленный диагноз
    }
    //контроль лечения
    public boolean controltreatment(Object hospitalTreatment){
        return true;
    }
    //написание истории болезни
    public Object writingAcaseHistory(Object hospitalPatient){
        Object caseHistory = new Object();
        return  caseHistory;
    }
}
