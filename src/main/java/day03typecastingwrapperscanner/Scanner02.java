package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

//Example 1: Sayilari kullanicidan alan ve toplama islemi yapan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz");
        double sayi1= input.nextDouble();

        System.out.println("ikinci sayiyi giriniz");
        double sayi2 = input.nextDouble();

        System.out.println("Iki sayinin toplami="+ (sayi1+sayi2));

    }
}
