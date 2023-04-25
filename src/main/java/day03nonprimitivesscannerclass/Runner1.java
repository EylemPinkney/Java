package day03nonprimitivesscannerclass;

public class Runner1 {

    public static void main(String[] args) {

        Table myTable = new Table();
        System.out.println(myTable.price);
        System.out.println(myTable.forDinner);

        myTable.extend();
        myTable.holds();

    }
}
