package day07ifstatementternarystatement;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a number is even or not by using ternary

        int num = -347;



        //1.Way: Use if-else
        if(num%2==0){System.out.println("Even"); }else{ System.out.println("Odd");}

        //2.Way: Use Ternary
        //             Condition    ?   The code will        :      The code will
        //                              be executed for             be executed for
        //                              true condition              false condition
        String result = num%2==0    ?       "Even"           :            "Odd";
        System.out.println(result);

        //Eaxmple 2: Type code to check if a number has 3 digits or not, use ternary.

        int number = -11200;

        number = Math.abs(number);

        String r = number>99 && number<1000 ? "It has 3 digits" : "It has no 3 digits";
        System.out.println(r);






    }
}
