package be.intecbrussel;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOefeningen {
    public static void main(String[] args) {

        System.out.println("----- Oefeningen Arrays ----");
        System.out.println("---- Oefening - 1 ----");
        // 1. Schrijf een programma dat 10 int's vraagt aan een gebruiker en deze in een array plaatst.
        // Print deze array dan uit op het scherm.

        Scanner sc = new Scanner(System.in);
        int[] intArrOne = new int[10];
        int i;

        System.out.println("Geef 10 integers aan!");
        for (i = 0; i < 10; i++) {
            int num = sc.nextInt();
            intArrOne[i] = num;
        }

        i = 0;

        System.out.println("Integers list array: ");
        for (int intList: intArrOne) {
            System.out.println(i++ + " -> " + intList);
        }

        System.out.println("---- Oefening - 2 ----");
        // 2. Gebruik de array van de eerste oefening. Kopieer deze elementen in een andere array in reverse order
        int oldIndex = 0;
        int[] intArrTwo = new int[intArrOne.length];

        for (i = 0; i < intArrTwo.length; i++) {
            intArrTwo[i] = intArrOne[oldIndex];
            oldIndex++;
        }

        System.out.println("Integers list array reverse: ");
        for (i = intArrTwo.length -1; i >= 0; i--) {
            System.out.println( i + " -> " + intArrTwo[i]);
        }

        System.out.println("---- Oefening - 3 ----");
        // 3. Schrijf een programma dat checked op een specifieke waarden.
        boolean numCheck = false;
        int position = 0;

        for (int index = 0; index < intArrOne.length; index++) {
            if (intArrOne[index] == 5) {
                numCheck = true;
                position = index;
            }
        }

        if (numCheck) {
            System.out.println("Match!" + "\n" + "Number 5 was found in this array!" + "\n" + "Was found at index -> " + position);
        } else {
            System.out.println("No match!" + "\n" + "Number 5 was not found in this array!");
        }

        System.out.println("---- Oefening - 4 ----");
        // 4. Schrijf een programma dat de even en oneven nummers optelt van een int array.
        // Bijvoorbeeld:
        // Number of even numbers: 2
        // Number of odd numbers: 3

        int[] numArray = {1,2,3,4,5,6,7,8,9,10,11};
        int evenCounter = 0;
        int oddCounter = 0;

        for (int evenOrOdd : numArray) {
            if (evenOrOdd % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        System.out.println("Number of even numbers -> " + evenCounter + "\n" + "number of odd numbers -> " + oddCounter);

        System.out.println("---- Oefening - 5 ----");
        // 5. Converteer een String array naar een string. Maak gebruik van de volgende array en print de string uit.
        // String[] strArray = { "Convert", "array", "to", "String" };

        String[] strArray = { "Convert", "array", "to", "String" };
        String newStr = String.join(" ", strArray);

        System.out.println(newStr);
    }
}
