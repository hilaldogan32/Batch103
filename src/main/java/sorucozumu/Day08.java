package sorucozumu;


import java.util.Scanner;

public class Day08 {


    public static void main(String[] args) {

        //Example 1: Kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiriniz
        //           Ramazan ==> Rn

        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Lütfen isminizi giriniz");

        String isim = input.next();

        //1. Yol:
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length()-1);

        System.out.println(""+ilkHarf+sonHarf);

        //2. Yol:

        String ilk = isim.substring(0,1);
        String son = isim.substring(isim.length()-1);

        System.out.println(ilk+son);

        //Example 2: Verilen String'deki sadece hayvan isimlerini ekrana yazdiriniz
        //           "Ben kedi, esim tavuk, oglum sever inek"

        String cumle = "Gülnur inek, Beyza tavuk, Hilal balık";
        String kedi = cumle.substring(0,6);
        String tavuk = cumle.substring(13,18);
        String inek = cumle.substring(26);

        System.out.println(kedi+tavuk+inek);



        //Example 3: Ilk isim ve soy isimi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdiriniz
        //           Ali Can ==> AC       Tahsin Yurdakul ==> TY


        System.out.println("Lütfen isminizi ve soyisminizi giriniz");
        String tamIsim = input.nextLine();
        String isimIlkHarfi = tamIsim.substring(0,1);
        String soyIsimIlkHarf = tamIsim.split(" ")[1].substring(0,1);

        System.out.println(isimIlkHarfi+soyIsimIlkHarf);


        //Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti." ==> 14


        String cumle = "Ali okula gitti.";
        int cumleHrfSayisi = cumle.replace(" ","").length();

        String deneme = "Bugün işte herzamanki gibi çook çalıştım!! :)";
        String deneme1 = deneme.replace("ş", "s");
        String deneme2 = deneme.replace(" ","-");
        int denemesayi = deneme2.length();
        System.out.println(cumleHrfSayisi);
        System.out.println(deneme1);
        System.out.println(deneme2);
        System.out.println(denemesayi);

        */

        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz
        // "Ankara'nın taşına gözlerimin yaşına bak"

        String cumle3 = "Ankara'nın taşına gözlerimin yaşına bak";

        String yenicumle3 = cumle3.replace("A","a");
        System.out.println(yenicumle3);

        //Example 3: Bir String'deki tüm "kara" kelimelerinin yerine "*" koyunuz
        String cumle4= "Kara kara düşünme Ankara";
        String yenicumle4 = cumle4.replace("kara","*");
        System.out.println(yenicumle4);

        // Example 4: Bir String'deki tüm sayıları "*" a çeviriniz.
        String stdId = "AC202117004";
        String yenistdId = stdId.replaceAll("[0-9]","*");
        System.out.println(yenistdId);

        // Example 5: Verilen bir Strin'de kullanılan noktalama işareti ve rakamlar ve
        // space karakteri hariç tüm karakterlerin sayısını bulan kodu yazınız.
        String cumle5 = "Hil al_2 ,4.3;!";
        String yenicumle5 = cumle5.replaceAll("[ ]","");
        System.out.println(yenicumle5);

        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli

        //Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz


        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //           aksi halde "Normal" yazdirin.



    }
}
