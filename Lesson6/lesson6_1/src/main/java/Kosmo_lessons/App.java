package Kosmo_lessons;

public class App 
{
    public static void main( String[] args )
    {
  //      Inspector inspector = new Inspector("Michael", "Gadget", 30000, 1000);
   //     Inspector inspector2 = new Inspector("Michael", "Gadget", 30000, 1000);
//        Object spaceship = new Object();
//        spaceship = inspector.checkAssembly(spaceship);
//        if (spaceship.getApproved()) {
//            System.out.println("POEHALI!");
//        }
//        else {
//            System.out.println("GOVNO!");
//        }
 //       Booker booker = new Booker("Larisa", "Ivanna", 5000);

//        double salary = booker.calculateSalary(inspector);
//        double salary = booker.calculateSalary(inspector2);
//        System.out.println(salary);
        Department hospital = new Department("Hospital");
        HospitalDoctor hospitalDoctor = new HospitalDoctor("Dr", "House", 656556465);
        hospital.addEmployee(hospitalDoctor);

        Department maintenanceDep = new Department("Maintenance department");
        Department personal = new Department("Обслуживание зданий");
        maintenanceDep.addSubDep(personal); // добавить подотдел

    }
}
