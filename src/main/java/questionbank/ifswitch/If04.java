package questionbank.ifswitch;

public class If04 {
    /*
    Type code to print the name of the month when you entered the number of the month.
    Example; For 1 output is "January", for 2 output is "February" etc.
     */

    public static void main(String[] args) {
        int numOfMonth = 12;

        if(numOfMonth == 1){
            System.out.println("1 = " +  "Jan");

        } else if (numOfMonth==2) {
            System.out.println("2 = " +  "Feb");

        }else if (numOfMonth==3) {
            System.out.println("3 = " +  "Mar");

        }else if (numOfMonth==4) {
            System.out.println("4 = " +  "Apr");

        }else if (numOfMonth==5) {
            System.out.println("5 = " +  "May");

        }else if (numOfMonth==6) {
            System.out.println("6 = " +  "Jun");

        }else if (numOfMonth==7) {
            System.out.println("7 = " +  "Jul");

        }else if (numOfMonth==8) {
            System.out.println("8 = " +  "Aug");

        }else if (numOfMonth==9) {
            System.out.println("9 = " +  "Sep");

        }else if (numOfMonth==10) {
            System.out.println("10 = " +  "Oct");

        }else if (numOfMonth==11) {
            System.out.println("11 = " +  "Nov");

        }else if (numOfMonth==12) {
            System.out.println("12 = " +  "Dec");

        }else{
            System.out.println("Invalid");
        }
    }


}
