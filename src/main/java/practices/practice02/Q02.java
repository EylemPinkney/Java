package practices.practice02;

import java.util.Scanner;

public class Q02 {

    /*
    Modules Operator ==> In java "%" is called modules operator
    It returns the reminder in a division operation
    13/5 == 2 and 13%5==3
     */

    public static void main(String[] args) {

        // Ask user to enter an integer number then print "Even" on the console



        //1.way
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number ");
        int number = input.nextInt();
        System.out.println("Is the number even? " + (number%2==0));
        //% modules operator divides the number and always gives us the reminder

        //2. way
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter an integer number ");
        int number1 = input1.nextInt();
        boolean checkedNumber = number1%2==0;
        System.out.println("Is the number even? " + checkedNumber);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a digit to check if it is an odd number");
        int number2 = input2.nextInt();
        boolean checkedNumber1 = number2%2!=0;
        System.out.println("Is the number odd? " + checkedNumber1);







    }

}
