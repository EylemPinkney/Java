package socrates;

public class Try01 {

    int a = 10; //non static

    public static void main(String[] args) {

        Try t1 = new Try();//we create an obj from the class

        Try t2 = new Try();//we create an obj from the class



        t1.a = 12;//go to t1 and make a 12

        t2.a = 13;//go to t2 and make a 13

        System.out.println(t1.a);//go to t1, look at the a --> 12

        System.out.println(t2.a);//13

        /*
        Update an object doesnt effect the other object
         */

    }

}