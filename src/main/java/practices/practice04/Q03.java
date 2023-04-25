package practices.practice04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {

        //Type code to check if a specific element in an Array or not

        //String[] str=new String[6];

        String[] str={"Ellie", "Susan", "Tom", "Brad", "Ali", "Veli"};
        String name= "Tom";
        int counter=0;

        //1.way
        for(String w: str){

            if(w.equals(name))

                counter++;
        }
        if(counter>0){

            System.out.println(name + " exists in the Array");
        }else {
            System.out.println(name+ " does not exist in the Array");
        }

        //2.way:by using binarySearch()

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));//[Ali, Brad, Ellie, Susan, Tom, Veli]

        int idx= Arrays.binarySearch(str, name);

        System.out.println(idx);

        //if we search a name that is not on the list If the word
        // is not in side the Array we are looking for number of element

    }


}