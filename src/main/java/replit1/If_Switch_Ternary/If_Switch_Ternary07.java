package replit1.If_Switch_Ternary;

public class If_Switch_Ternary07 {
    public static void main(String[] args) {

      /*
                  Create 2 words : name1 and name2

            if the name1 has even numbers of characters,

            then insert the second word in the middle of the first name

            if the first word has odd numbers

            Then print the “Name2 cannot be inserted in the name1”

            e.g:

            name1= mehmet

            name2= ahmet

            Print ==> mehahmetmet
       */

        String n1 = "mehmet";

        String n2 = "ahmet";

        if (n1.length() % 2 == 0) {
            System.out.println(n1.substring(0, (n1.length()) / 2) + n2 + n1.substring((n1.length()) / 2));

        }
    }
}
