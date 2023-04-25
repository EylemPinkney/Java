package socrates;

public class Try02 {


        public static void main(String[] args) {


        }

        public static void m1(float x) {

            System.out.println("Method 1");

        }

        public static void m1(int x, double y) {

            System.out.println("Method 2");

             /*
      If the following codes are printed inside the main method, which ones are false?

      A- 33.3,44 ==> Java will put these values in main method and look for m1 methods. There are two m1 methods.
      Java cant use both numbers on either methods. ==> False

      B- 33 ==> Can you put 33 in float. Yes! int is smaller than float and Java will do Auto Widening AW ==> True

      C- 33.3 ==> We cant put 33.3 in float. When we use decimal values, Java will accept it as a double as a default.
      So, as this is a double we cant use the first method. We cant do Autowidening. ==> False

      D- 33, 44 ==> We can put 44 inside double container AW ==> True

     */

        }

    }




