package Kosmo_lessons;
//Начальник амбулатории-врач

public class DoctorDispensaryManager extends Employee{
    public DoctorDispensaryManager(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //контроль работы персонала амбулаторного блока
    public boolean controlAmbulatoryWork(Object ambulatoryWork){
        return true;
    }
    //обеспечение необходимыми препаратами
    public Object provideMedicalPreparation(Object medicalPreparationRequest){
        Object medicalPreparation = new Object();
        return medicalPreparation;
    }
    //обеспечение необходимым оборудованием
    public Object provideMedicalEquipment(Object medicalEquipmentRequest){
        Object medicalEquipment = new Object();
        return medicalEquipment;
    }
}

