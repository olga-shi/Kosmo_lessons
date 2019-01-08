package org.kosmocourses.olga;

public class Main {
    public static void astroparameters () {
        Astronaut commander1 = new Astronaut(175, 75, 90, 90, 40, Astronaut.COMMANDER_POSITION, Astronaut.MAIN_CREW);
        Astronaut secondpilot1 = new Astronaut(155, 50, 85, 70, 35, Astronaut.SECOND_PILOT_POSITION, Astronaut.MAIN_CREW);
        Astronaut engineer1 = new Astronaut(200, 99, 130, 90, 45, Astronaut.ENGINEER_POSITION, Astronaut.MAIN_CREW);
        Astronaut commander2 = new Astronaut(165, 90, 100, 90, 35, Astronaut.COMMANDER_POSITION, Astronaut.RESERVED_CREW);
        Astronaut secondpilot2 = new Astronaut(185, 70, 75, 68, 40, Astronaut.SECOND_PILOT_POSITION, Astronaut.RESERVED_CREW);
        Astronaut engineer2 = new Astronaut(155, 49, 80, 68, 30, Astronaut.ENGINEER_POSITION, Astronaut.RESERVED_CREW);
        commander1.printParameters();
        commander2.printParameters();
        secondpilot1.printParameters();
        secondpilot2.printParameters();
        engineer1.printParameters();
        engineer2.printParameters();
    }
}
