package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz");
        int kisaKenar = input.nextInt();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz");
        int uzunKenar = input.nextInt();

        System.out.println("Dikdortgenin cevresi = "+2*(kisaKenar+uzunKenar));
        System.out.println("Dikdortgenin Alani = "+ kisaKenar*uzunKenar);


    }
}
