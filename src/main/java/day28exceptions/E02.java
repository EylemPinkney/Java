package day28exceptions;

public class E02 {

    /*
    throw is a keyword, can be used inside the method body and can be used multiple times
    After throw we should create an object! We use "new" keyword and then constructor. We can put message inside the parenthesis.
    ==> throw new IllegalArgumentException("Age cannot be less than zero");
    ==> throw new IllegalArgumentException();

     */

    public static void main(String[] args) {

        //printAge(-23);
        printGrades(-23);

    }

    //Example 1: Create a method to print user's age on the console.
    //           If the age is negative the age should not be printed on the console.
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be less than zero");
        }
        System.out.println("Your age is " + age);
    }

    //Example 2: Create a method to print student's grades.
    //           If the grade is less than zero or greater than 100, the method should throw Exception with a message
    public static void printGrades(int grade){
        if(grade<0){
            throw new IllegalArgumentException("Grades cannot be less than zero: " + grade);
        }else if(grade>100){
            throw new IllegalArgumentException("Grades cannot be greater than hundred: " + grade);
        }
        System.out.println("Your grade is " + grade);
    }
}
