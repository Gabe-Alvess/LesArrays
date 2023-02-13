package be.intecbrussel;

public class Arrays {
    public static void main(String[] args) {
        int[] myNumArr = new int[5];
        myNumArr[2] = 100; // -> beste manier

        System.out.println(myNumArr[2]);
        System.out.println(myNumArr[1]);
//      System.out.println(myNumArr[5]); -> Kan niet arrays beginnen altijd op 0.

        double[] myDoubleArr = {12.0, 13.6, 20}; // -> beste manier

//        int myArr[] = new int[5];  -> Mag maar, het is niet de beste manier

        System.out.println(myDoubleArr.length);
        System.out.println(myNumArr.length);

        String[] names = {"Bob", "Joe", "Jane"};

        for (int i = 0; i < names.length; i++) { // -> for loop
            System.out.println("Index " + i + " -> " + names[i]);
            System.out.println("Index " + i + " -> " + names[i].length());
        }

        for (String name : names) { // -> foreach loop
            System.out.println(name);
            System.out.println(name.length());
        }

        for (int i = myDoubleArr.length -1; i >= 0; i--) { // -> for loop reverse
            System.out.println(myDoubleArr[i]);
        }
    }
}
