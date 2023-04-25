package day02typecastingwrapper;

public class AsciiValues {

    //Every character in Java has a numerical value.
    //These values are called "ASCII Values"
    //The table that shows all ASCII Values is called ASCII Table.

    public static void main(String[] args) {

        //To find an Ascii value of a character, you need to put that value in an int data type.

        int ch = 'A';
        System.out.println(ch);

        int exclamation = '!';
        System.out.println(exclamation);

        char c1 = 'K';
        char c2 = '?';

        //If you use char for mathematical operation, Java uses Ascii value of char

        System.out.println(c1 + c2);//138


    }
}
