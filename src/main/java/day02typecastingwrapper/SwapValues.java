package day02typecastingwrapper;

public class SwapValues {
    public static void main(String[] args) {

        //Swap meaning changing the place

          /*
        Example 1: Type to swap the integers
        a=12 and b=5 ==> a=5 and b=12
         */

        int a = 12;
        int b = 5;

        System.out.println(a);
        System.out.println(b);

        a = a + b;
        b = a - b;
        a= a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
