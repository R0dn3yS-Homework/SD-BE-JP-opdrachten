package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");



        // Vraag -1: Maak een methode die al taak heeft om de list per regel uit te printen.

        for (String item : clubNames) {
            System.out.println(item);
        }

        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...

        for (int i = 0; i < clubNames.size(); i++) {
            System.out.println(i + " - " + clubNames.get(i));
        }

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.

        String newclub = "Fc Emmen";
        String newclub2 = "Fc Groningen";
        if (!clubNames.contains(newclub)) {
            clubNames.add(newclub);
        }

        if (!clubNames.contains(newclub2)) {
            clubNames.add(newclub2);
        }

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.

        System.out.println(clubNames.indexOf("Fc Groningen"));

        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        List<String> newClubNames = new ArrayList<>();
        Collections.sort(clubNames);
        boolean ajax = false;
        for (String club : clubNames) {
            if (ajax) {
                newClubNames.add(club);
            } else if (club.equals("Ajax")) {
                newClubNames.add(club);
                ajax = true;
            }
        }

        System.out.println(newClubNames);


        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");

        List<String> newClubNames2 = new ArrayList<>();
        Collections.sort(clubNames);
        boolean psv = true;
        for (String club : clubNames) {
            if (!psv) {
                newClubNames2.add(club);
            } else if (club.equals("PSV")) {
                newClubNames2.add(club);
                psv = false;
            }
        }

        System.out.println(newClubNames2);
    }
}
