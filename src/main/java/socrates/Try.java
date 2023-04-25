package socrates;

public class Try {

        static int a = 10;

        public static void main(String[] args) {

            Try t1 = new Try();

            Try t2 = new Try();



            t1.a = a + 2;

            t2.a = a + 3;

            System.out.println(t1.a);//15

            System.out.println(t2.a);//15

            /*
            Static keyword is attached to the class. Static --> moon in the sky, Non-Static --> head of the person
            From Try class we created an object; t1 and t2.
             t1.a = a + 2; --> Increase the value by two
             t2.a = a + 3; --> Increase the value by three


             */

        }

    }

