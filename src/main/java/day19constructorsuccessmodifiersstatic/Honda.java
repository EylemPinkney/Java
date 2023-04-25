package day19constructorsuccessmodifiersstatic;

public class Honda {

    public static int numOfCarsProduced = 0;

    public int price = 20000;

    /*
    Object construction steps;
    1-Access modifier ==> public
    2-Class name ==> Honda
    3-Parenthesis ==> variables
    4-Curly braces ==> method?
     */

    public Honda(){
        numOfCarsProduced++;
        price = price + 200;
    }

}
