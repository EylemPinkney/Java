package questionbank.ifswitch;

import java.util.Scanner;

public class If06 {

    /*
        Type code to create a converter which converts mile to km, second to hour, fahrenheit to celsius.
        Find the formulas for conversions from Google.
    a) When user entered 10 and mileToKm String, your code should print "16 km"
    (The number will be dynamic) on the console
    b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"
    (The number will be dynamic) on the console
    c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333 celsius"
    (The number will be dynamic) on the console
     */

    public static void main(String[] args) {

        int mile = 10;
        int seconds = 7200;
        double fah = 83;

        String converter = "fahrenheitToCelsius";

        if(converter.equals("mileToKm")){
            System.out.println((mile*1.6 ) + ("km"));

        } else if (converter.equals("secondsToHours")){
            System.out.println((seconds/3600 )+"Hours");

        } else if (converter.equals("fahrenheitToCelsius")) {
            System.out.println(((fah-32)*5/9 ) + ("celsius"));

        } else{
            System.out.println("Invalid");

        }



        /*
         switch (converter){
            case "mileToKm":
                System.out.println((number*1.6) + ("km"));
                break;
            case "secondsToHours":
                System.out.println((number/3600)+"Hours");
                break;
            case"fahrenheitToCelsius":
                System.out.println(((number-30)/2) + "celsius");
         */

    }
}
