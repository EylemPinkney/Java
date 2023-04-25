package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner07 {

    public static void main(String[] args) {

        //Get the first and last name and print on the same line

        Scanner input = new Scanner(System.in);
        System.out.println("Please write your first name");
        //next() method is used to get one word String from the user
        String firstName = input.next();
        System.out.println("Please write your last name");
        String lastName = input.next();
        System.out.println( firstName +" "+ lastName);

    }
}
