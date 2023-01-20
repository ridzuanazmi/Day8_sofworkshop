package nusiss;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {

    public static void main(String[] args) {

        example(); 
        example2();

    } // end of main 

    public static void example() {
        // custom array with data (name)
        String name[] = {"Darryl", "Chuk", "Mahesan", "Irwan", "Shi Yi", "Ridzuan", "Ronaldo", "Maradona", "Maldini", "Messi",
        "Macdonald", "Saint"};

        // print out unsorted array
        System.out.println("Unsorted array = " + Arrays.toString(name));

        // sort array in ascending order
        Arrays.sort(name);

        // print out sorted array
        System.out.println("Sorted array = " + Arrays.toString(name));

        // sort array in descending order
        Arrays.sort(name, Collections.reverseOrder());

        // print out the sorted array
        System.out.println("Sorted array (reverse order) = " + Arrays.toString(name));

        System.out.println("");

    } // end of example method

    public static void example2() {
        Integer numbers[] = {10, 5, 6, 7, 8, 31, 22, 8, 9, 70};
        // int[] numbers = {10, 5, 6, 7, 8, 31, 22, 8, 9, 70};

        // sort numbers array in ascending order
        Arrays.sort(numbers);

        // print out the sorted number array
        System.out.println("Sorted numbers in ascending order = " + Arrays.toString(numbers));

        // sort numbers array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // print out the sorted number array
        System.out.println("Sorted numbers in descending order = " + Arrays.toString(numbers));

    } // end of example2
}
