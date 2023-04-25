package socrates;

public class Counter {

    int count=0;//this will be attached to the objects.

    Counter(){

        count+=2;

        System.out.println(count);

    }

    public static void main(String args[]){

        Counter c1=new Counter();//What does counter conts. do? It increases the count by 2. As this is not static, it wont affect others.

        Counter c2=new Counter();

        Counter c3=new Counter();

        /*

       We created 3 objects from the counter constructor.
         */

    }

}


