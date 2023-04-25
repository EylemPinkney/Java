package practices.practice01;

public class Q05 {

    public static void main(String[] args) {

        // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use / and %
        // x: input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        //modules 10 = %10 this gives us the last number in the number


        int number = 12345;

        int ones = number%10;

        int tens = (number/10)%10;

        int hundreds = (number/100)%10;

        int thousands = (number/1000)%10;

        int tenThousands = (number/10000);


        System.out.println(tenThousands+"\n"+thousands+"\n"+hundreds+"\n"+tens+"\n"+ones+"\n");


    }
}
