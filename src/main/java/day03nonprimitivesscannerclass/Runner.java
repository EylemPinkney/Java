package day03nonprimitivesscannerclass;

public class Runner {

    public static void main(String[] args) {

        //How do we create objects?
        //We create objects in 5 steps;
        //Class name    Object Name   assignment operator   "new" keyword          Constructor
             Car           myCar            =                new                      Car();

        System.out.println(myCar.price);
        System.out.println(myCar.model);
        myCar.move();
        myCar.stop();

        Student tomHanks = new Student();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.address);

        tomHanks.study();
        tomHanks.feed();
    }
}
