package day28exceptions;

public class E03 {

    /*
        1)"finally block" is used to execute some codes under every condition.
        2)"finally block" can be used with "try - catch" or just with "try"
        3)"try block" cannot be used alone
          "try block" can be used i)with a single catch ii)with multiple catches iii)with a single catch and finally
                                  iv)with a multiple catches and finally v)with just a finally
        4)"finally block" can be used just once

        Interview Question: Can you explain "final", "finally", and "finalize" keywords?
                            "final" we learned it before
                            "finally" we learned it at the top
                            "finalize" is a process Java does before throwing unused things from memory to trash.

         Definition: final is the keyword and access modifier which is used to apply restrictions on a class, method or variable.
         Applicable to; Final keyword is used with the classes, methods and variables.
         Functionality;
         (1) Once declared, final variable becomes constant and cannot be modified.
         (2) final method cannot be overridden by sub class.
         (3) final class cannot be inherited.
         Execution
         Final method is executed only when we call it.

         Definition: finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not.
         Applicable to; Finally block is always related to the try and catch block in exception handling.
         Functionality;
         (1) finally block runs the important code even if exception occurs or not.
         (2) finally block cleans up all the resources used in try block
         Execution
         Finally block is executed as soon as the try-catch block is executed.
         It's execution is not dependant on the exception

         Definition: finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.
         Applicable to; finalize() method is used with the objects.
         Functionality;
         finalize method performs the cleaning activities with respect to the object before its destruction.
         Execution
         finalize method is executed just before the object is destroyed.
     */

    public static void main(String[] args) {

        System.out.println(divide(6, 2));

        System.out.println(divide(6, 0));

    }

    //Example 1: Create a method to do division
    //           The method should print "The mission is completed" even Exception thrown or not
    public static int divide(int a, int b){
        int result = 0;

        try {
            result = a / b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("The mission is completed");
        }
        return result;
    }

}