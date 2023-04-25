package day01datatypesvariables;

public class DataTypes01 {

    public static void main(String[] args) {

    //Creating a variable
    //a sentence in Java is called "statement"
    //If you want to use maths = sign in Java you need to use ==
    //there is no access modifier before int below. If you dont use access modifier, it means "default"
    //Data type + Variable name ==> Variable Declaration
    //Assignment Operator + Variable value = Assignment
    //If you declare a variable, but dont give a value, Java will assign it's own value.
    //Default values; 0 for numbers
    // "assignment operator" takes the value from the right puts it into the reserved area on the left
    //";" is used to end any "Java Sentence" (Statement)

    /*
    Naming Convention(Order) of Variables:
    i)Start with lower cases
    ii)All words except the first word should start with upper cases
    Those 2 rules called "Camel Case"
     */

    //Write the data type    variable name    assignment operator    data value   semicolon
              int                  myAge                  =                13           ;

    //Example 1: Create a variable name and assign Ali Can as a value.
    //We write String values inside double quotes
    //"Default value" for String is "null"
    String studentName = "Ali Can";

    /*
    What is "Data"?
    Data is used, stored, processed in Java
    Data is the main item in Java and all programming languages. Everything in Java called "Data".
     */

    /*
    What are the "Data Types" in Java?
    There are 2 main "Data Types" in Java:

     1)primitive data types
     2)non-primitive data types

    Note 1: Primitive data types were created by Java, developers cannot create "primitive data types"
    Note 2: Primitive data types names are written with lower case letters
    Note 3:Primitive data types take different memory spaces and this depend on their types,
    eg. float takes 4 byte space on the memory while double takes 8 bytes
    Note 4:Primitive data types only saves the value we assign in the memory


    There are 8 primitive data types;
     1)byte 2)short 3)int 4)long 5)float 6)double 7)char 8)boolean
     */

     /*
    1)byte: "byte" is for "whole numbers" and  "byte" is from -128 to 127. We have 256 different
     values in "byte" primitive data types

    Let us create a byte value and assign a value to it
    "byte stdAge" code
    i)creates reserved area in memory
    ii)Names it by using the name you gave
    iii)Puts zero(default value) in the reserved area
    */
    byte stdAge = 13;

    /*
    2)short: "short" is for whole numbers and "short" is from -32K sth to +32K
    short populationInAnApartment = 546;
     */
    short stGeorgeRoadPopulation = 2000;


    /*
    3)int: "int" stands for "Integer" and it is for whole number and "int" is from -2 billion sth to +2 billion sth
    int populationInACity = 15000000;
     */
    int populationOfOslo = 1500000000;

    /*
    4)Long: "Long" is for whole numbers
            min - 9,223,372,036,854,775,808and maximum value is 9,223,372,036,854,775,807.
            Even you make data type "Long", Java insists on using "int" to save memory.
            To insists on Java to make data type "Long", put "L" or "l" at the end of the value.
            If the value is in "int range" no need to put "L" or "l" to the end of the value but
            If the value is NOT in "int range" you have to put "L" or "l" to the end of the value
     */
    long populationOfTheWorld = 7200000000L;


    /*
    5)float: "float" is for decimal values
          "float" has 7 digits in decimal part
           It takes 4 byte space on the memory
           It's usually used for prices eg 12.99
           All decimal values are in "double"nas default in Java
           Even you type "float" as a data type, Java will accept it as "double"
           To insist on Java, it is float put "F" or "f" to the end of the value
     */
        float priceOfShirt = 12.99F;
        float priceOfShoes = 22.99F;

        float total = ( priceOfShirt + priceOfShoes );
        System.out.println("Total = " + total);

    /*
    6)double: "double" is for decimal values and "doubles" can have up to 16 digits in decimal part, it is so sensitive
    double takes 8 bytes space on the memory
     */
        double weightOfACell = 0.0023454567876000005;
        double weightOfRedCell = 0.01293874600052435;

        System.out.println(weightOfACell - weightOfRedCell);

    /*
    7)char: "char" is for "single characters", for example; A, ?, !, s, 3, etc.
           The value of "char data types must be between the 'single quotes
     */
    char initial = 'S';
    char grade = 'B';
    char number = 3;

    /*
    8)boolean: It is for "true" or "false" answers.
     */
    boolean isRetired = true;
    boolean isOld = false;

     /*
        There are 2  data types in Java
        1)Primitive Data Types ==> byte < short < int < long < float < double ==>numaric primitive data types

                                  boolean==> true or false
                                  char  ==> for a single character

         2)Non-Primitive data types==> String ==> used for multiple different characters storage inside an object

         String str = "Tom Hanks 123)?";

         What are the differences between "Primitive Data Types" and "Non-Primitive Data Types"?
         1)Primitive data types have just values but Non-Primitive Data Types have values and methods
         2)Primitive Data Types are created by Java, we cannot create a primitive data type
           But we can create Non-Primitive data types whenever we need

         3) "Primitive data types uses lowercases in naming convention and Non-Primitive ones uses Upper case naming
         convention

         4) Usage of memory for primitive data types changes from data type to data type.
            But Non-Primitive data types use same amount of memory in heap memory

            There are 2 types of memory in Java.
            1)Stack Memory=> 1)Primitive data 2)References(addresses) of Non-Primitive data type are stored
            2)Heap Memory==>< Stores Non-Primitive Data types/values
         */

    /*
    What did we learn today?
    1)How to create "project", "package", "class", "variable"
    2)How to name "project", "package", "class", "variable"
    3)Data types
    4)Primitive data types
     */





    }
}