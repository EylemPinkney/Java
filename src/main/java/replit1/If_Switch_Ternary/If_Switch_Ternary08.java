package replit1.If_Switch_Ternary;

import java.util.Scanner;

public class If_Switch_Ternary08 {

    public static void main(String[] args) {
        /*
                 Ask user for a string and print a new string made of 3 copies of the last 2 letters

        The strings length will be at least 2.

         Sample:

        INPUT       : Mustafa
        OUTPUT      : fafafa
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.next();
        String lastTwoLetters = name.substring(name.length()-2);
        System.out.println(lastTwoLetters.repeat(3));
    }
}
