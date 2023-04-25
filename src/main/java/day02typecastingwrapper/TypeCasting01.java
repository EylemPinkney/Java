package day02typecastingwrapper;

public class TypeCasting01 {

    public static void main(String[] args) {

            /*
            Type casting is when you assign a value of one numerical primitive data type to another numerical
            primitive data type. Numeric Data Types; byte, short, int, long, float, double

            In Java, there are two types of casting:

            1)AutoWidening (Widening Casting) (automatically) Java assigns a small numerical primitive data type to
            a bigger numerical primitive data type automatically.

            2)Explicit Narrowing (Narrowing Casting) (manually) - assigning a larger type to a smaller size type has
            risks and Java doesnt do this. The user must do this manually.

             */

        //Change byte data type to int data type

        byte age = 13;
        int ageInt = age;//AutoWidening
        System.out.println(ageInt);

        //Change long data type to short

        long weight = 234;
        short weightShort = (short)weight;//Explicit Narrowing
        System.out.println(weightShort);

        //Change int data type to float

        int height = 165;
        System.out.println(height);
        float heightFloat = height;
        System.out.println(heightFloat);

        //Change double data type to short

        double weightOfACell = 12.123456789765;
        System.out.println(weightOfACell);
        short weightOfACellShort = (short)weightOfACell;
        System.out.println(weightOfACellShort);

        //Attention
        //When you assign a new data type(byte), if the value(260) is out of the new data type(byte),
        // Java does a "mod" process and the result of mod process is the new value(4).

        short num = 260;
        System.out.println(num);//260
        byte numByte = (byte)num;
        System.out.println(numByte);//4







        int m= 14;

        double d =m;


        int n= 20;
        byte b=(byte) n;


    }



}