package practices.practice04;

public class Q02 {
    public static void main(String[] args) {

        //Type code to print the integers divisible by 4 and 6 from 13 to 211.

        //1.Way
        for (int i = 13; i<212; i++){

            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("=======");

        //2.Way: while-loop

        int i =13;//Starting point starts before while loop

        while (i<212) {//condition
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
            i++;//increment
        }


    }
}
