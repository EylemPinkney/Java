package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Ask user to enter width and the length of a rectangle, then calculate
        //parameters and the area of the rectangle.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width and length the rectangle, please...");
        double width = input.nextDouble();
        double length = input.nextDouble();
        System.out.println("Parameters: " + (2*width + 2*length));
        System.out.println("Area: " + (width*length));




    }
}
