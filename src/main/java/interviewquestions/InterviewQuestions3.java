package interviewquestions;

public class InterviewQuestions3 {
    public static void main(String[] args) {

        //Example 5: Type code to check if a given character is unique or not in a given String
        //          miami ==>     'a' ==> unique    'i'==> not unique

        //If a character is unique in a String indexOf and lastIndexOf gives the same outlook. This is the logic to
        // find the unique character. 'a' is the only 'a'and it has the same index number for both.

        String y = "miami";
        char ch = 'a';

        boolean r1 = y.indexOf(ch) == y.lastIndexOf(ch);
        System.out.println(r1);

        //Example 2: Create an integer array, type code to find the sum of the min and the max value.
        //           [12, 45, 9, 56] ==> 9+56=65

        /*
         -We have to create object to access non-static variables or non-static methods == If you want to touch my head,
    you have to create me first. Without creating me first, you cant touch my head.==> This is a very common interview
    question.
         */


    }
}
