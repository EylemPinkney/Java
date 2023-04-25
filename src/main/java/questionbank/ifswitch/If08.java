package questionbank.ifswitch;

import java.util.Scanner;

public class If08 {
    public static void main(String[] args) {
        /*
                Type code to check the format of state abbreviations in the USA
        a) Your code should print "State abbreviations cannot have more than 2 characters" if the
        abbreviation has more than 2 characters
        b) Your code should print "State abbreviations cannot have lowercase characters" if the
        abbreviation has lowercase characters
        c) Your code should print "State abbreviations cannot have characters different from
        letters" if the abbreviation has characters different from letters.
        Note: If the abbreviation has more than 1 error all related error messages should be printed.
        For example; for "fl3" your code should print, "State abbreviations cannot have more than 2 characters",
        "State abbreviations cannot have lowercase characters", and "State abbre- viations cannot have characters
        different from letters"

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the code");
        String stateAbv = input.next();

        if(stateAbv.length()>2){
            System.out.println("State abbreviations cannot have more than 2 characters");
        }if(stateAbv.equals(stateAbv.toLowerCase())){
            System.out.println("State abbreviations cannot have lowercase characters");
        }if(stateAbv.replaceAll("[a-zA-Z]", "").length()>0){
            System.out.println("State abbreviations cannot have characters different from letters");
        }


    }
}
