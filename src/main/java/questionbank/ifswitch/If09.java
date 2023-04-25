package questionbank.ifswitch;

import java.util.Scanner;

public class If09 {

    public static void main(String[] args) {
        /*
                9) Type code to create a simple calculator which does addition, subtraction, multiplication, and division with any 2 number
        a) When user entered 10.2 and 5 and + sign your code should print "The result is 15.2" on the console
        b) When user entered 10 and 5 and - sign your code should print "The result is 5.0" on the console
        c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0" on the console
        d) When user entered 10 and -5 and / sign your code should print "The result is -2.0" on the console
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("Please select one of the following operators; +, -, /, *");
        char operator = input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(n1 + n2);
                break;
            case  '-':
                System.out.println(n1 -n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            default:
                System.out.println("invalid");

        }


    }
}
