package replit1.If_Switch_Ternary;

import java.util.Scanner;

public class If_Switch_Ternary02 {

    
     /*
         Ask user Name, Surname and credit card numbers than convert it to special form.
         (Initials for name and surname should be uppercase)

        (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

        Input :

      John White 1234234534561478

        Output :

        Name : J*** W****

        CCN  : **** **** **** 1478

     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name and credit card number.");

        String firstName = input.next();
        String lastName = input.next();
        String creditCardNumber = input.next();


        char firstInitial = firstName.toUpperCase().charAt(0);
        char lastInitial = lastName.toUpperCase().charAt(0);
        String firstNameSubstring = firstName.substring(1,firstName.length());
        String lastNameSubstring = lastName.substring(1,lastName.length());


        String ccLastFourDigits = creditCardNumber.substring(creditCardNumber.length() - 4);
        String ccFirstTwelveDigits = creditCardNumber.substring(0, 12);
        String ccFirstTwelveDigitFormat = ccFirstTwelveDigits.replaceAll("\\d{4}", "$0 ");
        String ccFirstTwelveDigitFormatAsterisk = ccFirstTwelveDigitFormat.replaceAll("[0-9]", "*");


        if (creditCardNumber.length() != 16) {
            System.out.println("Invalid credit card number. 16 digits without spaces please.");
            return;
        }else{
            System.out.println("Name :" + firstInitial + firstNameSubstring.replaceAll("[a-zA-Z]", "*") + " "
                    + lastInitial + lastNameSubstring.replaceAll("[a-zA-Z]", "*"));

            System.out.println("CCN :" + ccFirstTwelveDigitFormatAsterisk + ccLastFourDigits);

        }
    }
}
