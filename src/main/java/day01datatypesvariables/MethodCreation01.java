package day01datatypesvariables;

public class MethodCreation01 {

    /*How do we create methods in Java?

        1)They are created outside of the main method.
        2)Access modifier + static + Return Type + Method Name + () + {}

        How do we use the method we created?
        1)We use it from inside the main method
        2)Write name of the method and ()
        3)The numbers we want to use, write it in the parenthesis
        4)


     */

    public static void main(String[] args) {

        int result = add(30,50);
        System.out.println(result);

        long multiplyResult = multiply(3, 6);
        System.out.println(multiplyResult);

        double complex = multiplyAndAdd(3.2, 5.2, 2.2);
        System.out.println(complex);

        double cubeResult = getCube(3);
        System.out.println(cubeResult);


    }

    public static int add(int a, int b){
        return a+b;
    }

    protected static long multiply(int a, int b){
        return a*b;

    }

    private static double multiplyAndAdd(double a, double b, double c){
        return a*b+c;
    }

    static double getCube(double a){
        return a*a*a;
    }

    /*
    Ornek 1: Create a method for; Multiply the first 2 numbers from the given 3 numbers,
     add the result to the 3rd number. And use the method.

    Ornek 2: Create a method for; calculate the cube of the given number and use it

    Note: When you use default Access Modifier, dont write default, leave it blank
     */

    /*
    Homework;
    1)Dikdortgenin alanini hesaplayan methodu olustur ve kullan.
    2)Dikdortgenin cevresini ...
    3)Dairenin cevresini
    4)Dairenin alanin

     */

}
