package mygroup;

public class Day02 {

    public static void main(String[] args) {

        //1 - Create double variables for the prices of any 3 items. Print the sum of the prices on the
        //console with a label.

        double a = 12.99;
        double b = 23.99;
        double c = 15.99;

        double sum = a + b+ c;
        System.out.println("Sum= " + sum);

        //2-Create a float variable, a long variable, and an integer variable for any 3 items. Print the
        //multiplication of the values on the console with a label.

        float d = 15.99F;
        long e = 13L;
        int f = 12;

        float sum1 = d*e*f;

        System.out.println("Multiply= " + sum1);

        //3-Type a code to find simple interest.
        //Note: Simple interest formula = principal * rate * numberOfYear / 100

        int prin = 10000;
        int rate = 6;
        int numberOfYear = 3;

        int simpleInterest = (prin*rate*numberOfYear)/100;

        System.out.println("Simple Interest is = " + simpleInterest);

        //4- Create a String and two Long variables. Print the sum and the multiplication of the long
        //variables with the String on the console.

        String a1 = "Hello";
        long k = 123L;
        long m = 9123456782L;

        long mult = k*m;
        long sum3 = k+m;

        System.out.println(a1 + " Multipication= " + mult + " Sum= " + sum3);

        //5- Create two boolean variables whose values are different and print their values in the same
        //line with a space between two consecutive values.

        boolean isRetired = false;
        boolean isActive = true;

        System.out.print(isRetired + " " + isActive);
        System.out.println();

        //6-Create 3 float variables for the price of a book, notebook, and laptop.
        //Print the total price of 2 books, 4 notebooks and 3 laptops on the console

        float book = 12.99F;
        float notebook = 23.45F;
        float laptop = 34.12F;

        float totalPrice = 2*book + 4*notebook + 3*laptop;

        System.out.println("Total price = " + totalPrice);

        //7-Type a code to swap two integers.

        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 integers");
        int c1 = input.nextInt();
        int c2 = input.nextInt();

        System.out.println("c1= " + c1 + " " + "c2= " + c2);

        c1 = c1+c2;
        c2 = c1-c2;
        c1 = c1-c2;

        System.out.println("c1= " + c1 + " " + "c2= " + c2);

       */

        //8- Create a short variable and convert it to an int variable.

        short num1 = 12;
        int num2 = num1;

        System.out.println(num2);

        //9-Create a long variable and convert it to an int variable.

        long num3 = 123456L;
        int num4 = (int)num3;

        System.out.println(num4);

        //10-Create a double variable and convert it to a float variable

        double num5 = 123.89;
        float num6 = (float)num5;
        System.out.println(num6);

        //11- Create a double variable and convert it to a short variable, then print the value of the short
        //variable on the console. Be careful about the output, it will not be a decimal value.

        double num7 = 12.99;
        short num8 = (short)num7;

        System.out.println(num8);

        //12- Create a byte variable and convert it to a double variable, then print the value of the double
        //variable on the console. Be careful about the output, it will be a decimal number.

        byte num9 = 123;
        double num10 = num9;

        System.out.println(num10);

        //
















    }
}
