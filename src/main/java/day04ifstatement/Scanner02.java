package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
        Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onları ASCII degerlerini kullanir.
            ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir.
        Not: Java'da "+" sembolunun iki anlami vardir. i) Toplama islemi  İİ) Birleştirme Islemi (Concatenation)
            Java "%é sembolu gorunce once toplama yapmaya calisir, yapamazsa birleştime islemi yapmaya calisir, o da olmazsa hata verir,

     */
    public static void main(String[] args) {

        //Example : Kullanicidan ilk ve soy ismini aliniz, ilk ve soy isminin ilk harflerini ekrana yazdiriniz.
        //Ali Can ==> AC

        Scanner input = new Scanner(System.in);

        // 1.yol:

        /*
        System.out.println("Ilk isminizi giriniz...");

        char ilk = input.next().charAt(0); // A

        System.out.println("Soy isminizi giriniz...");


        char son = input.next().charAt(0); //C

        System.out.println("" + ilk+son);
        */

        // 2. yol:
        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input.nextLine(); // Ali Can

        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);





    }
}
