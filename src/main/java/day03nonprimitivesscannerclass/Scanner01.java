package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner01 {

    //We get data from user and use it in our codes
    //To be able to use scanner class, we need to create a Scanner Class Object.

    public static void main(String[] args) {
                //Steps to get data from user
        // 1)Create a Scanner Class Object - How?
        // Class Name   Object Name    Assignment Operator    new       Constructor
             Scanner        input             =               new     Scanner(System.in);
        //2)Give a message to user about what you are asking
        System.out.println("Enter your age...");
        //3)By using the correct method, save the date you received from user in the memory.
        byte age = input.nextByte();

        System.out.println("Your age is " + age);


    }
}
