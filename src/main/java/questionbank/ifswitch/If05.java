package questionbank.ifswitch;

public class If05 {
    /*
        Type code to print
    a) "Isosceles Triangle" if two sides of a triangle are equal in length.
    b) "Equilateral Triangle" if all sides of a triangle are equal in length.
    c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
     */

    public static void main(String[] args) {

        int a = 2;
        int b = 9;
        int c = 7;

        if(a==b && b==c){
            System.out.println("Equilateral Triangle");

        } else if (a==b && b!=c || a==c && a!=b || b==c && c!=a) {
            System.out.println("Isosceles Triangle");

        } else  {
            System.out.println("Neither isosceles, nor equilateral");


        }
    }
}
