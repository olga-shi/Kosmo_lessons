package Kosmo_lessons;
//Врач амбулатории

public class AmbulanceDoctor extends Employee {
    public AmbulanceDoctor(String name, String surname, double salary) {
        super(name, surname, salary);
    }
    //проведение исследований
    public Object researching(Object researchingObject){
        Object researchResult = new Object();
        return researchResult;
    }
    //проведение  экспериментов
    public Object conductingExperiments(Object experimentsObject){
        Object experimentsResult = new Object();
        return experimentsResult;
    }

}
