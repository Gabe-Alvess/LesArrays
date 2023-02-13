package be.intecbrussel;

public class GithubArrayOef {
    public static void main(String[] args) {

        System.out.println("Github");
        System.out.println("---- Oefening - 1 ----");

        // Creëer op 2 manieren een array.
        int[] myArr = new int[10];
        myArr[5] = 10;
        System.out.println("Eerste manier -> " + myArr[5]);

        String[] strArr = {"Jos", "Bob", "Mark", "Jules"};
        System.out.println("Tweede manier -> " + strArr[0]);

        // Met datatype van double en char.
        double[] doubleArr = {15.5, 20.5, 35.5};
        char[] charArr = {'a', 'b', 'c', 'd'};

        // Druk 1 element van beide array's af in de command lijn.
        System.out.println("data type double -> " + doubleArr[1] + "\n" + "data type char -> " + charArr[3]);

        System.out.println("---- Oefening - 2 ----");

        // 1. Creëer een String array met 5 elementen.
        String[] strArray = {"ferrari", "lambhorgni", "bugatti", "mercerdes", "audi"};

        // 2. Druk 1 element af in de commando lijn.
        System.out.println("One element of the array -> " + strArray[2]);

        // 3. Druk de lengte van je array af.
        System.out.println("Array lenght -> " + strArray.length);

        System.out.println("---- Oefening - 3 ----");

        // 1. Schrijf een programma om de even en oneven nummer te vinden in een int array.
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
    }
}
