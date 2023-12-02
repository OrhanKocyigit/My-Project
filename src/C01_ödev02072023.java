import java.io.StringBufferInputStream;

public class C01_ödev02072023 {
    public static void main(String[] args) {

        //Gittigimiz web sayfasindan aldigimiz
        //String arama sonuclarinda
       // arama sayisinin 50'den az oldugunu test edin



        String input = "1-48 of 87 results for \"nutella\"";
        int indexOfInput = input.indexOf("of");
        int indexResults = input.indexOf("results");
        String seksenYediString = input.substring(indexOfInput+3,indexResults-1) ;
        int sayi = Integer.parseInt(seksenYediString);

        if (sayi<50){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }


    }
}
