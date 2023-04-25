package day07ifstatementternarystatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example 1: Get users age
        //      0-4--> "Baby", 5-12--> "Kid", 13-19-->Teenager, 20-30-->"Adult,
        //      Other--> "Undefined", Negative ages --> "Invalid age"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = input.nextByte();

        if(age<0){
            System.out.println("Invalid age");
        } else if (age<5) {
            System.out.println("Baby");
        } else if (age<13) {
            System.out.println("Kid");
        } else if (age<20) {
            System.out.println("Teenager");
        }else if (age<31){
            System.out.println("Adult");
        }else {
            System.out.println("Undefined");
        }

        //Boundary Value Analysis(BVA)
        // All critical values should be tested. Critical values for the above: 0,4,5,12,13,19,20,30
        //We should test one value(any value) before and after critical values; such as 28 and 31 for 30



    }
}
