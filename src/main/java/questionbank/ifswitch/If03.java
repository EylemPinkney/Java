package questionbank.ifswitch;

public class If03 {

    public static void main(String[] args) {

                /*
                       Type code to print
        a) "Round up by last digit:" and print the rounded value if the last digit is greater than
        or equal to 5
        b) "Round down by last digit" and print the rounded value if the last digit is less than 5

        */

    int a = 126;

    if(a%10>=5){
        a=(a/10+1)*10;
        System.out.println("Round up by last digit: " + a);
    } else if (a%10<=5) {
        a=(a/10)*10;
        System.out.println("Round down by last digit: " + a);

    }else{
        System.out.println("invalid");
    }


    }
}
