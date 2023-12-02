package Homeworks;

import java.util.Scanner;

public class C04_homework02072023 {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir sayi alin,
        //   1’den baslayarak sayiya kadar tum tamsayilari yazdirin(sayi dahil), sira
        //	- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //	- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //	- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println(" Bitte tragen Sie zahl ein");

        int zahl1 = scan.nextInt();

        for (int i = 1 ; i < zahl1; i++) {

            if (i % 3 == 0) System.out.println(" fizz ");
            else if (i % 5 == 0) System.out.println(" buzz ");

            else  System.out.println( zahl1%3 + zahl1%5 == 0 ? " fizzBuzz " : " Digga Bedaulicherweise ungültig " + i );

            // else if (i % 3 + i % 5 == 0) System.out.println(" fizzBuzz " + i);
        //else { System.out.println( " Digga Bedaulicherweise ungültig " );

            }

        }

    }



