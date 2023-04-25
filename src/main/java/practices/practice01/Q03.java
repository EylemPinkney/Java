package practices.practice01;

public class Q03 {

    public static void main(String[] args) {

        /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
       Calculate the average of these numbers.
     */
    //There are different ways of doing this;

        double num1 = 23.4, num2 = 24.0, num3 = 12, num4 = 450.3, num5 = 23000;

        //1
        System.out.println((num1+num2+num3+num4+num5)/5);

        //2
        double num6 = 23.4, num7 = 24.0, num8 = 12, num9 = 450.3, num10 = 23000;
        double sum = num6+num7+num8+num9+num10 ;
        double average = sum/5;
        System.out.println("average = " + average);


    }
}
