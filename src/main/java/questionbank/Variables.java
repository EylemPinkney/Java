package questionbank;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {

        /*
        Create double variables for the prices of any 3 items. Print the sum of the
        prices on the console with a label.
         */


        double shirtPrice = 12.99;
        double hatPrice = 23.99;
        double shoesPrice = 15.99;

        double totalOfThreeItems = shirtPrice + hatPrice + shoesPrice;
        System.out.println("Total price =  " + totalOfThreeItems);

        /*
        Q2 - Create a float variable, a long variable, and an integer variable for any 3 items.
        Print the multiplication of the values on the console with a label.
         */

        float a = 1.2F;
        long b = 11L;
        int c = 3;

        float multiplication = a * b * c;

        System.out.println("Result = " + multiplication);

        /*
        Q3 - Type a code to find simple interest.
        Note: Simple interest formula = principal * rate * numberOfYear / 100
        int principal = 10000, rate = 6, numberOfYear = 3;
         */

        int principal = 10000;
        int rate = 6;
        int numberOfYear = 3;

        int interestformula = principal * rate * numberOfYear / 100;

        System.out.println(interestformula);

        /*
        Q4 - Create a String and two Long variables. Print the sum and the multiplication of the long
        variables with the String on the console.
         */

        String name = "Tom";
        long cityPopulation = 100000L;
        long age = 24L;

        System.out.println((cityPopulation+age) +" "+ (cityPopulation*age) + " " + name);

        /*
        Q5 - Create two boolean variables whose values are different and print their values in the same
        line with a space between two consecutive values.
         */

        boolean isRetired = true;
        boolean stillWorking = false;

        System.out.println( isRetired + " " + stillWorking);

        /*
        Q6 - Create 3 float variables for the price of a book, notebook, and laptop.
        Print the total price of 2 books, 4 notebooks and 3 laptops on the console
         */

        float priceOfBook = 10.0F;
        float priceOfNotebook = 1.1F;
        float priceOfLaptop = 2.2F;

        float totalPrice = (2*priceOfBook + 4*priceOfNotebook + 3*priceOfLaptop);
        System.out.println(totalPrice);

        /*
        Q7 - Type a code to swap two integers.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numebers to swap");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.println("Before swap = " + "n1 = " + n1 + "  n2 =  " + n2 );

        n1 = n1 + n2;
        n2 = n1 -n2;
        n1 = n1 - n2;

        System.out.println("After swap = " + "n1 = " + n1 + "  n2 =  " + n2 );







    }
}
