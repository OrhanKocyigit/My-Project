package day09;

public class C01_forLoop {
    public static void main(String[] args) {

        //10 kere "Hello World" yazdiralim
        //ama her yazilisinda 1 den 10 a kadar(10 dahil) sira no ile yazdiralim

        System.out.println("1- Hello World");
        System.out.println("2- Hello World");
        System.out.println("3- Hello World");
        System.out.println("4- Hello World");
        System.out.println("5- Hello World");
        System.out.println("6- Hello World");
        System.out.println("7- Hello World");
        System.out.println("8- Hello World");
        System.out.println("9- Hello World");
        System.out.println("10- Hello World");

        System.out.println("-----------------");

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + "- Hello World");
        }
    }
}
