package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

      /*
        Type a program which calculates the area and the perimeter of a circle
        whose radius is entered by user. (Use float)
        Hint 1: Take pi number as 3.14159
        Hint 2: Area of a circle is 3.14159 x radius x radius
        Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
 */

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter the radius of the circle...");
        float radius = input.nextFloat();
        float piNumber = 3.14159F;
        System.out.println("Area of circle is: " + (piNumber*radius*radius));
        System.out.println("Perimeter of a circle is: " + (2*piNumber*radius));

    }
}
