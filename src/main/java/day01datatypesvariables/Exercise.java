package day01datatypesvariables;

public class Exercise {

    public static void main(String[] args) {



        //Access modifier + static + Return Type + Method Name + () + {}



        int deduct1 = deduct(9,7);
        System.out.println(deduct1);

        double add1 = add(2,3);
        System.out.println(add1);

        int a1 = multiplyAdd(3,5,5);
        System.out.println(a1);

        double a2 = cube(3.2);
        System.out.println(a2);

        float a3 =areaOfRectengular(2.2F, 3.2F);
        System.out.println(a3);

        int a4 = perimeterOfRectengular(2, 3);
        System.out.println(a4);

        double pi = 3.14;
        double r = 4;

        double a5 = circumferenceOfACircle(pi, r);
        System.out.println(a5);

        double a6 = areaOfACircle(pi, r);
        System.out.println(a6);



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

    public static int deduct(int a, int b){
        return a-b;

    }

    private static double add(double a, double b){
        return a+b;
    }

    public static int multiplyAdd(int a, int b, int c){
        return a*b+c;
    }

    static double cube(double a){
        return a*a*a;

    }

    protected static float areaOfRectengular(float a, float b){
        return a*b;
    }

    static int perimeterOfRectengular(int a, int b){
        return 2*(a+b);
    }

    public static double circumferenceOfACircle(double pi, double r){
        return 2*pi*r;
    }

    private static double areaOfACircle(double pi, double r){
        return pi*(r*r);
    }

}
