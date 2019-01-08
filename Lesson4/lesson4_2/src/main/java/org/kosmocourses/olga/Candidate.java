package org.kosmocourses.olga;

public class Candidate {
    double height;
    double sittingHeight;
    double weight;
    double shoulderWidth;
    double hipWidth;
    double footLength;
    int age;
    int experience;
    boolean citizenshipUssr;
    boolean abilityToKeepSecrets;
    boolean higherEducation;
    boolean knowledgeOfEnglish;
    boolean sportsmanship;
    boolean lackOfDisease;

    public Candidate(double height, double sittingHeight, double weight, double shoulderWidth, double hipWidth, double footLength, int age, int experience, boolean citizenshipUssr, boolean abilityToKeepSecrets, boolean higherEducation, boolean knowledgeOfEnglish, boolean sportsmanship, boolean lackOfDisease) {
        this.height = height;
        this.sittingHeight = sittingHeight;
        this.weight = weight;
        this.shoulderWidth = shoulderWidth;
        this.hipWidth = hipWidth;
        this.footLength = footLength;
        this.age = age;
        this.experience = experience;
        this.citizenshipUssr = citizenshipUssr;
        this.abilityToKeepSecrets = abilityToKeepSecrets;
        this.higherEducation = higherEducation;
        this.knowledgeOfEnglish = knowledgeOfEnglish;
        this.sportsmanship = sportsmanship;
        this.lackOfDisease = lackOfDisease;
    }
}
