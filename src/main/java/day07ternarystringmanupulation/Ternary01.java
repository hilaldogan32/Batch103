package day07ternarystringmanupulation;

public class Ternary01 {
    public static void main(String[] args) {
        // Example: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz
        // Syntex soz dizimi demek

        //1. Yol if-else :
        int a = -12;
        if(a>0) {
            System.out.println("Pozitif");
        }else {
            System.out.println("Pozitif degil");
        }

        //2.Yol: ternary
                        //Condition ?  Condition dogru ise uygulanacak kod   :   Condition yanlis ise uygulanacak kod
        String sonuc =     a>0      ?           "Pozitif"                    :            "Pozitif degil";
        System.out.println(sonuc);


        //Ezample 2 : iki saayidan kucuk olani secn kodu yaziniz

        int b = 12;
        int c = 12;

       int min =  b<c ? b : c;
        System.out.println(min);

        //Ezample 3:Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        // Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
        // Negatif sayilarin mutlak degeriv-1 ile carpilmis halleridir.

        int d = -45;
        int abs = d<0 ? d*(-1) : d;
        System.out.println(abs);

        // Example 4 : iki tane sayi ayni isaretli ise bu sayilari carpiniz farkli isaretli ise "islem yapamam" mesaji veriniz

        int e = 12;
        int f = 10;

        // Ternary farkli data tiplainde  return  ederse sonucun data tipini "Object" yapiniz
        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem yapamam" ;
        System.out.println(islem);

        // Note: Java'da her class'in en az bir tane "parent" class'i vardir.
        // sadece "Object" class'in "parent" class'i yoktur.


        }



    }

