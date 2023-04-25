package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner08 {

    public static void main(String[] args) {

        //Get two numbers from the user, do 4 calculations and write the result on the screen

        Scanner input = new Scanner(System.in);
        System.out.println("Please, write 2 numbers");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);



    }
}
