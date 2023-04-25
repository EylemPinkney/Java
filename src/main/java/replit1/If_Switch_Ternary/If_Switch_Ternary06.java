package replit1.If_Switch_Ternary;

import java.util.Scanner;

public class If_Switch_Ternary06 {
    public static void main(String[] args) {

        /*
        Ask user to type a name, the length of name should be 3.
        Then check if the name has same characters.
        If the String has same characters
        Print “String has duplicate characters”
        Else
        Print “String has unique characters”
        Please use ternary.


        Input :

        ala

        OutPut:

        String has duplicate characters
         */

        Scanner input = new Scanner(System.in);
        System.out.println("");
        String name = input.next().toLowerCase();
        String acceptedName = name.charAt(0)==name.charAt(name.length()-1)
                ? "String has duplicate characters" : "Your String has unique characters";
        System.out.println(acceptedName);
    }
}
