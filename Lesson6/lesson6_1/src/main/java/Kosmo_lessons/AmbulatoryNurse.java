package Kosmo_lessons;
//Медицинская сестра амбулатории

public class AmbulatoryNurse extends Employee{
    public AmbulatoryNurse(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    //помощь врачу в проведении экспериментов  и исследований
    public Boolean assistanceToTheDoctor(Object medicalExperiment){
        return true;
    }
}
