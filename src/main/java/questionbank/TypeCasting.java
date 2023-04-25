package questionbank;

public class TypeCasting {

    public static void main(String[] args) {

        /*
        Q1 - Create a short variable and convert it to an int variable.
         */

        short a = 1000;
        int b = a;
        System.out.println(b);

        short age = 28;
        int newAge = age;
        System.out.println("Precious age =  " + newAge);

        /*
        Q2 - Create a long variable and convert it to an int variable.
         */

        long population = 1000000000000000000L;
        int newPopulation = (int)population;
        System.out.println(newPopulation);

        /*
        Q3 - Create a double variable and convert it to a float variable
         */

        double daisiesInAField = 123.567876886766589;
        float newdaisiesInAField = (float)daisiesInAField;
        System.out.println(newdaisiesInAField);

        /*
        Q4 - Create a double variable and convert it to a short variable, then print the value of the short
        variable on the console. Be careful about the output, it will not be a decimal value.
         */

        double shirtPrice = 12.99;
        short newShirtPrice = (short)shirtPrice;
        System.out.println(newShirtPrice);

        /*
        Create a byte variable and convert it to a double variable, then print the value of the double
        variable on the console. Be careful about the output, it will be a decimal number.
         */

        byte apartmentNumbers = 123;
        double newApartmentNumbers = apartmentNumbers;
        System.out.println(newApartmentNumbers);

    }
}
