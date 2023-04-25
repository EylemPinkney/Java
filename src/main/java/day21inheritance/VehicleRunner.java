package day21inheritance;

public class VehicleRunner {//Runner class is for running the other classes. If you want to run many classes in a single
    //class, create runner class, put main method in it and then create object and use whichever method I want.

    public static void main(String[] args) {

        Civic myCivic = new Civic(true);
        myCivic.move();
        myCivic.engine();
        myCivic.ecoSystem();
        int hashCode = myCivic.hashCode();
        System.out.println(hashCode);



    }

}
