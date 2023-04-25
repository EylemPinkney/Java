package day12arrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: Create a String array with 5 elements, delete the elements whose length is less than 5
        //           [Orange, Blue, Red, Yellow, Brown] ==> [Orange, Yellow, Brown]
        String colors[] = new String[5];
        colors[0] = "Orange";
        colors[1] = "Blue";
        colors[2] = "Red";
        colors[3] = "Yellow";
        colors[4] = "Brown";

        /*
        I have to define how many elements will be in the next array before I delete elements. Because if
        I do it before, the deleted ones will have a space called "null"

         */

        //How many elements have greater than or equal to 5 characters
        /*
        We use counter here because, we find how many elements we will have in the next array. Counter counts the
        elements that are suitable for our array.
         */
        int counter = 0;

        //Orange, Blue, Red, Yellow, Brown
        for(String w : colors){
            if(w.length()>=5){
                counter++;
            }
        }

        //Create new array to store the elements whose lengths are greater than or equal to 5
        String newArray[] = new String[counter];

        //Transfer the elements whose lengths are greater than or equal to 5 to the newArray
        int idx = 0;
                        //Orange, Blue, Red, Yellow, Brown
        for(String w : colors){
            if(w.length()>=5){
                newArray[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}