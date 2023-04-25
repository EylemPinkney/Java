package day32lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        printSortedUpperUnique(names);
        System.out.println();
        printUpperUniqueSortWithLength(names);
        System.out.println();
        printUpperUniqueSortWithLastChar(names);
        System.out.println();
        printSortedByLengthThenFirstChar(names);
        System.out.println();
        printSquaresOfLengthDistinctlyInReverseOrder(names);
        System.out.println();
        System.out.println(checkLengthsToBeLessThanTwelve(names));
        System.out.println();
        System.out.println(checkInitialsNotToBeX(names));
        System.out.println();
        System.out.println(checkLastCharToBeLowerCaseR(names));

    }
    //1)Print the list elements on the console in natural order, with upper cases, and un-repeatedly
    public static void printSortedUpperUnique(List<String> names){
        names.stream().distinct().sorted().map(String :: toUpperCase).forEach(Utils :: printInTheSameLineWithSpace);
    }

    //2)Print the list elements on the console by ordering them according to their lengths, with upper cases, and un-repeatedly
    public static void printUpperUniqueSortWithLength(List<String> names){
        names.stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length)).//Comparator is a class to compare the elements in Java
                forEach(Utils::printInTheSameLineWithSpace);
    }
    //3)Print the list elements on the console by ordering them according to their last characters, with upper cases, and un-repeatedly
    public static void printUpperUniqueSortWithLastChar(List<String> names){
        names.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t + " "));
    }

    //4)Create a method to sort the elements according to their lengths then according to their first characters
    //  TOM JIM ALEX ALEX MARY MICHAEL ALEXANDER ==> JIM TOM ALEX ALEX MARY MICHAEL ALEXANDER
    public static void printSortedByLengthThenFirstChar(List<String> names){
        names.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).//If a method needs paramete it cannot be used in "Method Reference"
                        forEach(Utils::printInTheSameLineWithSpace);// Jim Tom Alex Alex Mary Michael Alexander

        /*
        How to use method reference;
        1-Class name
        2-Double colon
        3-Method name. Dont use method parenthesis, just the name

        **If the method not using any parameter, we can use method reference.

        **Sometimes we cant use method reference. For example, charAt() has to have parenthesis..

        **If you need very specific method for your project, create it, put it into Utils class and then call it.

        -->> (String::length) --> (Utils::printInTheSameLineWithSpace)



         */
    }

    //5)Create a method which takes the square of the length of every element, prints them distinctly in reverse order
    public static void printSquaresOfLengthDistinctlyInReverseOrder(List<String> names){
        names.
                stream().
                map(String::length).
                distinct().
                map(Utils::getSquare).
                sorted(Comparator.reverseOrder()).
                forEach(Utils::printInTheSameLineWithSpace);
    }

    //6)Create a method to check if the lengths of "all elements" are less than 12
    public static boolean checkLengthsToBeLessThanTwelve(List<String> names){
        return names.stream().allMatch(t->t.length()<12);
    }

    //7)Create a method to check if the initial of any element is not ‘X’
    public static boolean checkInitialsNotToBeX(List<String> names){
        return names.stream().noneMatch(t->t.startsWith("X"));
    }

    //8)Create a method to check if at least one of the elements ending with "r"
    public static boolean checkLastCharToBeLowerCaseR(List<String> names){
        return names.stream().anyMatch(t->t.endsWith("r"));
    }

    /*
    These last three methods are very important; allMatch, noneMatch and anyMatch. Learn them well!!!
     */
}