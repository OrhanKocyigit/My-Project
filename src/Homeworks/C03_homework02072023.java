package Homeworks;

import java.util.Scanner;

public class C03_homework02072023 {
    public static void main(String[] args) {

        // Kullanicinin verdigi sayiyi, bire kadar tum sayilari yazdirin
        //(NOT: Eger girilen sayi negatif ise "Gecersiz sayi diyin")


        Scanner scan = new Scanner(System.in);

        System.out.println(" Bitte tragen Sie hier zwei Zahl ein ");

        int zahl1 = scan.nextInt();
        int zahl2 = scan.nextInt();

        for (int i = zahl1; i < zahl2; i++) {
            System.out.println( zahl1 + zahl2<=0 ? "Ungültige Berechnung wurde eingetragen" : " Berechnung lautet : " + i);

        }

    }

    }

