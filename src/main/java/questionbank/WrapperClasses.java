package questionbank;

public class WrapperClasses {
    public static void main(String[] args) {

        /*
        Q1 - Type a code to find the sum of the minimum value of the byte and the maximum value of
        short data types.
         */

        byte byteMin = Byte.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        System.out.println(byteMin+shortMax);

        /*
        Q2 - Type a code to convert “103” String to byte and to convert “2351” String to short then
        print the difference on the console.
         */

        String a = "25";
        String b = "100";

        byte num1 = Byte.valueOf(a);
        short num2 = Short.valueOf(b);
        System.out.println(num2 - num1);

    /*
    What are the differences between valueOf(String s) and parseByte(String s) methods?
     */
        /*
        parseByte() returns primitive integer type (int), whereas valueOf() returns java.lang.Integer, which
        is the object representative of the integer. There are circumstances where you might want an Integer
        object, instead of a primitive type.
        Of course, another obvious difference is that valueOf() is an instance method whereas parseByte()
        is a static method.

         */




    }
}
