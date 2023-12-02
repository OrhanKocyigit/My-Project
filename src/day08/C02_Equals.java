package day08;

public class C02_Equals {
    public static void main(String[] args) {

        String ahmet = "ahmet";
        String orhan = "orhan";

        System.out.println(ahmet.equals(orhan));

        String str1 = "Java";
        String str2 = "jaVa";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true

        // Esittir mi sorusuna cevap almak icin kullanilan kod //

        String abdü = " abdü ";
        String ahmet2 = " ahmet ";

        System.out.println(abdü.equals(ahmet2)); //false


    }
}
