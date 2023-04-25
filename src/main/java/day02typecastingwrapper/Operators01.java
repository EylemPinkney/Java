package day02typecastingwrapper;

public class Operators01 {

        /*
        1)+,-,*,/ operators are used in Java as if you would be doing in maths.
        Note 1: int / int == int
        Note 2: double/int == double When you use different data types on maths in Java, result is the big data type.

        1)"AND" and "OR" are logical operators in Java.

        i)"AND"
        Note 1: "And" all conditions must be true to get true result from And logical operator.
        Note 2: The symbol for "and"  is &&

        ii)"OR"
        Note 1: Only one true condition is enough to make true "Or" logical operator.
        Note 2:To get a false result, all conditions must be false
        Note 3: "Or" logical operator is like Pollyanna
        Note 4: The symbol for "or"  is ||

        iii)"NOT"
        Note 1: Not operator changes true to false and false to true.
        Note 2:The symbol for "not" is !
        !true = false
        !false = true
        !!true = false

        3)Comparison operators
        > greater than a>b 5>3
        < less than
        >= greater than or equal to
        <= less than or equal to
        == equal to
        != not equal to

        Note: We must use boolean(true or false) when we do comparison operators.

        We use "&&" for And, but "&" a single one can also be used.
            What is the difference?
            "&&" checks only the first condition and doesnt check the following conditions. Therefore, works faster.
            "&" checks all conditions therefore it works slower.
            Consequently, we use "&&"

         */

    public static void main(String[] args) {

        boolean first = 3<5;//T
        boolean second = 3+2 != 5;//F
        boolean third = 2+3*5 >=19;//F

        System.out.println(first);
        System.out.println(second);
        System.out.println(first + "-" + second + "-" + third);

        System.out.println(first && second);
        System.out.println(second || third);


    }


}
