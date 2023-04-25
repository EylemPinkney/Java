package day02typecastingwrapper;

public class Examples {

    public static void main(String[] args) {

        //Example 1: Find the maximum and minimum values of byte by writing a code.


        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println(byteMaxValue);

        byte min = Byte.MIN_VALUE;
        System.out.println(min);

        //Example 2: Get the total of int min and byte max

        int minInt = Integer.MIN_VALUE;
        byte max = Byte.MAX_VALUE;
        System.out.println(minInt + max);

        //Example 3: Convert Primitive int to Wrapper Integer (Autoboxing)

        int age = 13;
        Integer wrapperAge = age;
        System.out.println(wrapperAge);

        //Example 4: Convert Wrapper Byte to primitive byte (Unboxing)

        Byte num = 126;
        byte primitiveNum = num;
        System.out.println(primitiveNum);

        //Example 4: i)Convert primitive char to Wrapper Character (Autoboxing)

        char k = '£';
        Character wrapperK = k;
        System.out.println(wrapperK);

       // ii)Convert Wrapper Boolean to primitive boolean (Unboxing)

        Boolean isThisAJourney = true;
        boolean primitiveIsThisAJourney = isThisAJourney;
        System.out.println(primitiveIsThisAJourney);

        //Example 5: Get the total of two string value
         String shirt = "12";
         String shoes = "10";

        int total = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(total);

        boolean first = 5>8;
        boolean second = 3==3;
        boolean third = 1<11;
        System.out.println(first+"-"+second+"-"+third);

        System.out.println(first && second);
        System.out.println(second || third);

        int ch = 'a';
        System.out.println(ch);
        int a1 = '!';//33
        System.out.println(a1);
        int a2 = '$';//36
        System.out.println(a2);
        int a3 = '£';
        System.out.println(a3);
        int ascii1 = '=';
        System.out.println(ascii1);

        System.out.println(a1+a2);


    }
}
