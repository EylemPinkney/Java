package day05stringmanipulations;

public class Exercise {

    public static void main(String[] args) {

       //1- All characters upper case

        String s = "Java is easy";

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        String sLower = s.toLowerCase();
        System.out.println(sLower);

        char secondFirst = s.charAt(1);
        char secondLast = s.charAt(10);
        System.out.println("" +secondFirst + secondLast);

        int length = s.length();
        System.out.println(length);
        


    }
}
