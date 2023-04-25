package day17methodoverloadingdatetimeclasses;

public class MethodCreation {

    public static void main(String[] args) {

        //Create a method adds two integers


        int r1 = addition(2,8);
        System.out.println(r1);

        //Create a method prints the first and the last character on the console
          /*
        Note: As we will be getting to two characters, this will be String.
         */

        String s1 = firstAndLastChar("Antalya");
        System.out.println(s1);

        //Create a method prints the sum of the ASCII values of characters in a String

        int r3 = totalAsciiValue("Ajda");
        System.out.println(r3);


        // we use void return type if it is returning f=goes to sout
        //variables inside the method parenthesis are called "parameters"
        //actual values in the main method in the method parenthesis called are called arguments.
        //Every method I use in main method must be static
        //When we use + after a char, Java will take Ascii value
        // e.g. sumOfAsciis = sumOfAsciis + name.charAt(i); --> This will ive ascii value of the char


        /*
         1-Access modifier
        2-return type
        3-method name
        4-Method parenthesis, inside; some variables
        5-Method body, that is inside curly braces
         */

        
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static String firstAndLastChar(String name){

      return name.charAt(0) + " " + name.charAt(name.length()-1);


    }


    public static int totalAsciiValue(String name) {
        int sumOfAsciis = 0;
        for (int i = 0; i < name.length(); i++) {
            sumOfAsciis = sumOfAsciis + name.charAt(i);

        }
        return sumOfAsciis;

    }


}