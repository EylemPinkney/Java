package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        /*
    Get a 5 digits number from the user. Write a code to calculate
    the total of first and last two numbers.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Please write 5 digit number");
        int n = input.nextInt();
        int nLast = n%10;
        n = n/10;
        int nSecondLast = n%10;
        n = n/10;
        int nThirdLast = n%10;
        n = n/10;
        int nFourthLast = n%10;
        n = n/10;
        int nFirst = n%10;
        System.out.println(nLast+nSecondLast+nFourthLast+nFirst);


    }
}