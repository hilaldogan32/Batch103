package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    /*
        Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
        Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
            i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
            ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.

     */
    public static void main(String[] args) {
        //Example 1: Kullanıcıdan gün isimlerini alınız.
        // o günün hafta sonu mu veya hafta içi mi olduğunu söyleyen bir kod yazınız.
        // Pazartesi== Hafta içi Pazar==Hafta sonu

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz...");
        String gun = input.next();

        if(gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta sonu...");
        }
        else if(gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Hafta içi...");
        }
        else if(gun.equalsIgnoreCase("Sali")){
            System.out.println("Hafta içi...");
        }
        else if(gun.equalsIgnoreCase("Çarşamba")){
            System.out.println("Hafta içi...");
        }
        else if(gun.equalsIgnoreCase("Perşembe")){
            System.out.println("Hafta içi...");
        }
        else if(gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta içi...");
        }
        else if(gun.equalsIgnoreCase("Cumartes")){
            System.out.println("Hafta sonu...");
        }else{
            System.out.println("Geçerli bir gün giriniz");
        }

        // Kod yazarken bir satıra en fazla 80 karakter yazılır.
        // Daha fazla yazmaktan kaçınılır.

        // 2. Yol:
        if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        }else if(gun.equalsIgnoreCase("Pazartesi") || gun.equalsIgnoreCase("Sali") || gun.equalsIgnoreCase("Carsamba") || gun.equalsIgnoreCase("Persembe") || gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

        //3.yol:

        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");

        boolean haftaIci = gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma");

        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {

        } else if (gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma"))
            if(haftaSonu){

                System.out.println("Hafta sonu...");

                if(haftaIci)

                    System.out.println("Hafta ici...");
            } else {
                System.out.println("Gecerli bir gun ismi giriniz...");
            }


    }
}
