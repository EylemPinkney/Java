package replit1.If_Switch_Ternary;

import java.util.Scanner;

public class If_Switch_Ternary02_extra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kredi kartı numaranızı girin: ");
        String cardNumber = scanner.nextLine();

        System.out.print("İsminizi girin: ");
        String firstName = scanner.next();

        System.out.print("Soyisminizi girin: ");
        String lastName = scanner.next();

        System.out.print("isim-soyisim: " + firstName.toUpperCase().charAt(0) +
                firstName.substring(1).replaceAll("[a-zA-Z]","*") );

        System.out.println(" " + "soyisim: " + lastName.toUpperCase().charAt(0) +
                lastName.substring(1).replaceAll("[a-zA-Z]","*") );

        String maskedCardNumber = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);

        System.out.println("kart no: " + maskedCardNumber);
    }
}
