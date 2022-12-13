package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {



  public static void main(String[] args) {
    List<Integer> numList = new ArrayList<>();
    numList.add(5);
    numList.add(6);
    numList.add(13);

    System.out.println("Het hoogste getal van de gegeven getallen is: " + highestNum(numList));
  }

  public static int highestNum(List<Integer> list) {
    int highest = 0;

    for (int num : list) {
      if (num > highest) highest = num;
    }

    return highest;
  }
}
