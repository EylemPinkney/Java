package mygroup;

public class Day01 {
    public static void main(String[] args) {

        //1- Type a code to find the sum of the minimum value of the byte and the maximum value of
        //short data types.

        byte minValue = Byte.MIN_VALUE;
        short maxValue = Short.MAX_VALUE;

        System.out.println(minValue);
        System.out.println(maxValue);

        //2) Type a code to convert “103” String to byte and to convert “2351” String to short then print
        //the difference on the console.

        String a1 = "103";
        short a2 = 2351;

        byte first = Byte.valueOf(a1);
        short second = Short.valueOf(a2);

        System.out.println(second - first);

        //1) Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other characters
        // are in lower cases on the console.

        String cityName = " mIAMI ";
        String updatedCityName = cityName.trim().toLowerCase();
        updatedCityName = updatedCityName.substring(0,1).toUpperCase() + updatedCityName.substring(1);
        System.out.println(updatedCityName);

        String name = " ParIS";
        String newName = name.trim();
       newName = newName.substring(0,1).toUpperCase()+newName.substring(1,5).toLowerCase();
        System.out.println(newName);

        String city = " bAKu ";
        String newCity = city.trim().toLowerCase();
        newCity = newCity.substring(0,1).toUpperCase()+newCity.substring(1);
        System.out.println(newCity);

        //Create 3 String variables for people's names. Print the sum of the number of characters in
        //all the 3 names except space characters.
        //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

        String name1 = "Ali Can";
        String name2 = "Merve Star";
        String name3 = "Mark Tom";

        int total = (name1 + name2 + name3).replaceAll(" ", "").length();
        System.out.println(total);

        //Create a String variable, print the total number of alphabetical and numeric characters in
        //the String on the console.
        //Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.

        String s = " Miami 33018!!! ";
        System.out.println(s.length());
        int newS = s.trim().replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println(newS);

        //4) Create a String variable, print the number of non-digit characters in the String on the
        //console. Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.

        String m = "Ko12ala!GB..";
        System.out.println(m.length());
        int newM = m.replaceAll("[^a-zA-Z]", "").length();
        System.out.println(newM);









    }
}
