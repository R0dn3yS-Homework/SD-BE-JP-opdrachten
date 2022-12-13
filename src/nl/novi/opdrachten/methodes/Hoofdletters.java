package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class Hoofdletters {

    public static void main(String[] args) {
        List<String> curstomerNames = new ArrayList<>();

        curstomerNames.add("nick piraat");
        curstomerNames.add("michael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("michiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");

        System.out.println(capitalizeNames(curstomerNames));
    }

    public static List<String> capitalizeNames(List<String> list) {
        List<String> customerNames = new ArrayList<>();

        for (String name : list) {
            char[] charArray = name.toCharArray();
            boolean foundSpace = true;

            for(int i = 0; i < charArray.length; i++) {
                if (Character.isLetter(charArray[i])) {
                    if (foundSpace) {
                        charArray[i] = Character.toUpperCase(charArray[i]);
                        foundSpace = false;
                    }
                } else {
                    foundSpace = true;
                }
            }
            name = String.valueOf(charArray);
            customerNames.add(name);
        }

        return customerNames;
    }
}
