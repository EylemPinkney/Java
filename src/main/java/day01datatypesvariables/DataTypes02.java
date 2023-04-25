package day01datatypesvariables;

public class DataTypes02 {

    /*
    Non-Primitive data types: String is a non-primitive data type.
    Every class we create is a non-primitive data type. So, there is
    no end to non-primitive data types.
    Non-Primitive data types names starts upper case letter.
    Space on the memory is the same for all Non-Primitive data types.
     */

    /*Interview Question; What are the differences between "Primitive Data Types" and "Non-Primitive Data Types"?

         1)This is the most important difference ==> Primitive data types have just values
         but Non-Primitive Data Types have values and methods
         2)Primitive Data Types are created by Java, we cannot create a primitive data type.
         But we can create Non-Primitive data types whenever we need
         3)Primitive data types uses lowercases in naming convention and Non-Primitive ones uses Upper case naming
         convention
         4) Usage of memory for primitive data types changes from data type to data type.
          But Non-Primitive data types use same amount of memory in heap memory

            There are 2 types of memory in Java.
            1)Stack Memory=> 1)Primitive data 2)References(addresses) of Non-Primitive data type are stored
            2)Heap Memory==>< Stores Non-Primitive Data types/values
         */

    public static void main(String[] args) {

        //Create a variable name for a city and print.

        String capitalCity = "Ankara";
        System.out.println(capitalCity);
    }
}
