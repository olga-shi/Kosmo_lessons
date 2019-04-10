package Kosmo_lessons.Hospital;
//Начальник отделения госпиталя

import Kosmo_lessons.Employee;

public class HeadOfHospitalDepartment extends Employee {
    public HeadOfHospitalDepartment(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //контроль работы персонала отделения
    public boolean controlHospitalWork(Object hospitalWork){
        return true;
    }
    //обеспечение необходимыми лекарствами
    public Object provideMedicalPreparation(Object medicalDrugRequest){
        Object medicalDrug = new Object();
        return medicalDrug;
    }
    //обеспечение необходимым оборудованием
    public Object provideMedicalEquipment(Object medicalEquipmentRequest){
        Object medicalEquipment = new Object();
        return medicalEquipment;
    }
}
