package practices.practice05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {
    public static void main(String[] args) {

          /*
   If the list has 15 as element, change all 15s to 51
   Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
   */

        List<Integer> list = Arrays.asList(15, 15, 15, 34, 43);

        System.out.println(list);

        if(list.contains(15)){

            for(int w : list){
                if(w == 15){
                   list.set(list.indexOf(15), 51);

                }

            }
        }else{
            System.out.println("The list does not contain");
        }
        System.out.println(list);

    }

    /*
    1-we created our list asList() method
    2-If the list contains x,
     */
}
