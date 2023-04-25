package replit1;

import java.util.Scanner;

public class For_While01 {

    /*
        Ask user to enter a name and a character, then check how many times the character
        is repeated in the name using loops in the name

        e.g:

        char ch1= 'a' ;

        String name =“John came late"

        Expected Output: Number of a = 2
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Plese enter a name");
        String name = input.nextLine();
        System.out.println("Plese enter a character");
        String ch2 = input.next();

        char ch1 = ch2.charAt(0);


        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch1) {
                count = count + 1;

            }
        }
        System.out.println("number of a = " + count);


    }
}
