package org.kosmocourses.olga;

public class Main {

    public static boolean validate (Candidate candidate) {
        if (
                candidate.height >= 150 && candidate.height <= 190
                && candidate.sittingHeight >= 80 && candidate.sittingHeight <= 99
                && candidate.weight >= 50 && candidate.weight <= 90
                && candidate.shoulderWidth <= 40
                && candidate.hipWidth <= 41
                && candidate.footLength <= 29.5
                && candidate.age <= 35
                && candidate.experience >= 3
                && candidate.citizenshipUssr
                && candidate.abilityToKeepSecrets
                && candidate.higherEducation
                && candidate.knowledgeOfEnglish
                && candidate.sportsmanship
                && candidate.lackOfDisease
        ){
            return true;
        } else {
            return false;
        }

    }
    public static void checkCandidates (){
        Candidate candidates[] = new Candidate[3];

        candidates[0] = new Candidate(
                151,
                81,
                55,
                40,
                35,
                23,
                21,
                3,
                true,
                true,
                true,
                true,
                true,
                true
        );
        candidates[1] = new Candidate(
                161,
                81,
                55,
                40,
                35,
                23,
                66,
                3,
                true,
                true,
                true,
                false,
                true,
                true
        );
        candidates[2] = new Candidate(
                171,
                81,
                55,
                40,
                35,
                23,
                21,
                3,
                true,
                true,
                true,
                true,
                true,
                false
        );


        for (int i = 0; i < candidates.length; i++) {
            if (Main.validate(candidates[i])){
                System.out.println("Кандидат " + (i+1) + " прошел проверку");
            }
        }

    }

}
