package practices.practice01;

public class Q01 {

    public static void main(String[] args) {

        //Initialize variables

        int age =  51;
        int weight = 75;

        //println means print and go to line next

        //Print variables and print with labels = sout and weight.

        System.out.println(age);

        System.out.println("weight = " + weight);
        System.out.println("age = " + age);

        //Copy the variable's value
        int myAge = age;
        System.out.println(myAge);
        System.out.println("myAge = " + myAge);

        //Declare multiple variables in the same line

        int year = 2022, month = 12, day =  29;

        System.out.println("day = " + day);

        //Update a variable

        day = 30;
        System.out.println("day = " + day);

        //Declare a variable : x

        int x;
        //Initialize another variable : y

        int y = 4;

        //Initialize another variable : z

        int z = 8;

        //Initialize variable x by z

        x = z;

        //Update the variable y

        y = 10;

        //Print the variables

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }


}
