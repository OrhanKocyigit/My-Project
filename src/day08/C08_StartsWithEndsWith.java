package day08;

public class C08_StartsWithEndsWith {
    public static void main(String[] args) {
        String str= "Java mutluluktur";
        System.out.println(str.startsWith("j"));//false
        System.out.println(str.startsWith("J"));//true
        System.out.println(str.startsWith("Java"));//true

        System.out.println(str.endsWith("r"));//true
        System.out.println(str.endsWith("mutluluktur"));//true

    //------------------------------------------------------------------

        String str2 = "Javayla programlama iyi ögrenilir";
        System.out.println(str2.startsWith("j"));
        System.out.println(str2.startsWith("J"));
        System.out.println(str2.startsWith("Javayla"));

        System.out.println(str2.endsWith("r"));
        System.out.println(str2.endsWith("ögrenilir"));

    }
}
