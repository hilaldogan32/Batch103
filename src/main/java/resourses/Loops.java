package resourses;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Soru 1: Ekrana 10 kez Java güzeldir yazdırın.
        for (int i = 1; i < 11; i++) {
            System.out.println("Java Güzeldir");
        }

        //Soru 2: 10 ile 30 arasındaki(10 ve 30 dahil) sayıları aralarında virgül olarak aynı satıra yazdırın.

        for (int i = 10; i < 31; i++) {
            System.out.print(i + ",");
        }
        System.out.println();

        //Soru 3: 100 den başlayarak 50 ye(50 dahil) kadar olan sayıları aralarında virgül olarak yazdırınız.
        for (int i = 100; i > 49; i--) {
            System.out.print(i + ",");
        }
        System.out.println();

        //Soru 4: Kullanıcıdan 100 den küçk bir tamsayı isteyin.
        // 1 den başlayarak girilen sayıya kadar 3 ün katları olan sayıları yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.println("100 den küçük bir samsayı giriniz");
        int sayi = input.nextInt();

        if (sayi < 101 && sayi > 0) {

            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }


        } else {
            System.out.println("100 den küçük pozitif bir tamsayı giriniz");
        }
        System.out.println();
        //Soru 5: Kullanıcıdan 100 den küçük bir tamsayı isteyin.
        // 1 den başlayarak girilen sayıya kadar 3 ün veya 5 in katları olan sayıları yazdırın.

        Scanner input2 = new Scanner(System.in);
        System.out.println("100 den küçük pozitif bir tamsayı giriniz");
        int sayi2 = input.nextInt();
        if (sayi2 < 100 && sayi2 > 0) {
            for (int i = 1; i <= sayi2; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("100 den küçük pozitif bir tamsayı giriniz");


        }
        System.out.println();

        // Soru 6:Kullanıcıdan 100 den küçük bir tamsayı isteyin ve istenen sayıya kadar tüm sayıları ekrana yazdırınız.
        Scanner input3 = new Scanner(System.in);
        System.out.println("100 den küçük bir tamsayı giriniz");
        int sayi3 = input.nextInt();

        if (sayi3 < 100 && sayi3 > 0) {
            for (int i = 1; i < sayi3; i++) {
                if (i % 3 == 0 && i%5 == 0)  {
                    System.out.print("Java Güzeldir ");
                } else if (i % 5 == 0) {
                    System.out.print("Güzeldir ");

                } else if (i%3 == 0) {
                    System.out.print("Java ");

                }else {
                    System.out.print(i + " ");
                }

            }

        }
    }
}



