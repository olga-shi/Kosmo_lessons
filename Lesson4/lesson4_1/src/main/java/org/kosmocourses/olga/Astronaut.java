package org.kosmocourses.olga;

public class Astronaut {

    public static final String MAIN_CREW = "Основной состав";
    public static final String RESERVED_CREW = "Запасной состав";

    public static final String COMMANDER_POSITION = "Коммандир";
    public static final String SECOND_PILOT_POSITION = "Запасной пилот";
    public static final String ENGINEER_POSITION = "Инженер";


    double height, weight, shoulderWidth, hipWidth, headWidth;
    String position;
    String crew;

    public Astronaut(double height, double weight, double shoulderWidth, double hipWidth, double headWidth, String position, String crew) {
        this.height = height;
        this.weight = weight;
        this.shoulderWidth = shoulderWidth;
        this.hipWidth = hipWidth;
        this.headWidth = headWidth;
        this.position = position;
        this.crew = crew;
    }

    public void printParameters () {
        System.out.println("Состав: " + this.crew);
        System.out.println("Позиция: " + this.position);
        System.out.println("Рост: " + this.height);
        System.out.println("Вес: " + this.weight);
        System.out.println("Обхват плечей: " + this.shoulderWidth);
        System.out.println("Ширина бёдер: " + this.hipWidth);
        System.out.println("Обхват головы: " + this.headWidth);
        System.out.println("*****");
    }
}
