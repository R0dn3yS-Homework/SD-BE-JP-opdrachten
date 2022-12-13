package nl.novi.opdrachten.methodes;

import org.w3c.dom.ls.LSOutput;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {
        int chosenNumber = 44;

        if (divisibleByFive(chosenNumber)) {
            System.out.println("deelbaar door vijf");
        } else {
            System.out.println("ondeelbaar door vijf");
        }
    }

    public static boolean divisibleByFive(int number) {
        return (number % 5 == 0);
    }
}
