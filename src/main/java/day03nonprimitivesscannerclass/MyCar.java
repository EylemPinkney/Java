package day03nonprimitivesscannerclass;

public class MyCar {

    public String model = "BWW";
    public int price = 1200;

    public int totalPrice(int price, int vat){
        return price+vat;
    }

    public void basePrice(int price){
        System.out.println(price);
    }

    public void speed(){
        System.out.println("BMW is fast");
    }

}


