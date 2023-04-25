package day02typecastingwrapper;

public class WrapperClass01 {

    public static void main(String[] args) {

        //Primitive:       char        boolean     byte    short   int        long    float   double
        //Wrapper Class:   Character   Boolean     Byte    Short   Integer     Long    Float   Double

        int n = 12;
        /*
        n is my variable name. When I write "n." I dont see any methods.
        Because primitive data dont have any methods.

        Wrapper Classes are non primitive and they take a big space.If it is not necessary, we prefer not to use it.
         */

        Integer m = 12;
        /*
        m is my variable name. When I write "m." I see many methods.
        Because wrapper class have methods.
         */

        byte p = 23;

        Byte r = 43;

        //Example 1: Find the maximum and minimum values of byte by writing a code.

        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);//127

        byte minByte = Byte.MIN_VALUE;
        System.out.println(minByte);//-128

        //Example 2: Get the total of int min and byte max

        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin + byteMax);//-2147483521

        //Example 3: Convert Primitive int to Wrapper Integer (Autoboxing)

        int num = 22;

        Integer wrapperNum = num;
        System.out.println(num);//22

        //Example 4: Convert Wrapper Byte to primitive byte (Unboxing)

        Byte k = 12;

        byte primitiveK = k;

        System.out.println(primitiveK);//12

        //Example 4: i)Convert primitive char to Wrapper Character (Autoboxing)


        char money = '£';
        Character wrapperMoney = money;

        System.out.println(wrapperMoney);//£

        //          ii)Convert Wrapper Boolean to primitive boolean (Unboxing)

        Boolean isRich = true;

        boolean primitiveIsRich = isRich;//true

        System.out.println(primitiveIsRich);

        //Example 5: Get the total of two string value.

        String shirt = "2300";
        String shoes = "5200";

        //If we use "+" sign between two numbers, Java gets the total of those two numbers.
        //If we use "+" sign between two Strings or between one String and one number, Java put these two together and
        //this is called "concatenation"
        //Note: During concatenation, Java still follows mathematical order of operations which is i)parenthesis
        //ii)exponents iii)multiplication and division from left to right iv)addition and subtraction from left to right
        System.out.println(shirt+shoes);//23005200
        int totalPrice = Integer.valueOf(shirt)+Integer.valueOf(shoes);
        System.out.println(totalPrice);//7500

        //Example 6)Get the total of two string value.
        //If a String has all numbers, valueOf() method converts all String numbers, to numbers, such as int, byte, etc.
        //If String has a value that is not a number, valueOf method gives an error.
        //We'll learn how to correct this error later on.

        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio);//$11000$3000


    }
}
