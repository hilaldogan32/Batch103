package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Example 1: Kullanıcı gün numarasını girsin, kod gün ismini yazsın
        //          2==>Pazartesi    5==>Perşembe
        Scanner input = new Scanner(System.in);
        System.out.println("Gün numarasını giriniz...");
        byte gunNo = input.nextByte();

        if (gunNo == 1 ){
            System.out.println("Pazar");
        } else if (gunNo == 2) {
            System.out.println("Pazartesi");
        } else if (gunNo == 3) {
            System.out.println("Salı");
        } else if (gunNo == 4) {
            System.out.println("Çarşamba");
        } else if (gunNo == 5) {
            System.out.println("Perşembe");
        } else if (gunNo == 6) {
            System.out.println("Cuma");
        } else if (gunNo == 7) {
            System.out.println("Cumartesi");
        }else{
            System.out.println("Geçerli bir gün numarası giriniz. Geçerli gün numaraları 1,2,3,4,5,6,7 de birileridir");
        }
    }
}