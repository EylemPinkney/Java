package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner09 {

    /*
    Get a 5 digits number from the user. Write a code to calculate the total of first and last two numbers.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please write 5 digit number");
        int number = input.nextInt();

        //Take last digit
        int lastDigit = number%10;
        number = number/10;

        //Take second digit from the last digit
        int lastSecondDigit = number%10;
        number = number/10;

        //Take third digit from the last digit
        int lastThirdDigit = number%10;
        number = number/10;

        //Take fourth digit from the last digit
        int lastFourthDigit = number%10;
        number = number/10;

        //Take fifth digit from the last digit
        int lastFifthDigit =number%10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);

    }
}
