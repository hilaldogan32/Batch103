package sorucozumu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan bir sayi aliniz, sayi 100 den kucuk ise ekrana "Kazandiniz!" yazdiriniz
        //           Aksi halde ekrana "Kaybettiniz!" yazdiriniz.
        //           Kullanici kazandikca oyun devam etmeli.
        Scanner input = new Scanner(System.in);
        System.out.println("oyundan çıkmak için 0 tuşuna basınız");

        int num=0;
        do {
            System.out.println("bir sayı giriniz");
            num = input.nextInt();
        if (num<100) {
            System.out.println("Kazandınız");
        }
        }while (num<100);

            System.out.println("Kaybettiniz");

        System.out.println();

        //Example 2: Kullanicidan isimler aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz

        do{
        System.out.println("Bir isim yazınız");
            String isim= input.nextLine();
            if (isim.charAt(0)>='A'&& isim.charAt(0)<='Z'){
                System.out.println("Büyük harf ile başlayan bir isim yazdınız");
            }else if (isim.charAt(0)>='a'&& isim.charAt(0)<='z'){
                System.out.println("Küçük harf ile başlayan bir isim yazdınız");
            }else {
                System.out.println("Geçersiz bir ifade girdiniz");
                break;
            }
        }while(true);{


        }

        //*******************************************ARRAYS01************************************************
        // Bir int, String ve char arrayleri oluşturup, bunları yazdırınız ve elemanlarını küçükten büyüğe doğru
        //sıralayınız.
        String str[]={"Ali","Ayşe","Ahmet","Beyza","Doğan","Gülnur","Mehmet","Ümmüşan"};
        int say[]={12,15,23,46,54,78,46,38,22,91,44};
        char chr[]={'A','c','f','H','i','K','L','m'};
        System.out.println(Arrays.toString(str));
        System.out.println(str[4]);
        System.out.println(Arrays.toString(say));
        System.out.println(say[3]);
        System.out.println(Arrays.toString(chr));
        System.out.println(chr[0]);


        //Example 1: Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz
        Arrays.sort(say);
        System.out.println(Arrays.toString(say));
        int enkucuk=say[0];
        int enbuyuk=say[say.length-1];
        int top =enkucuk+enbuyuk;
        System.out.println(top);

        //Example 2: say Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
        //1.Yol: for-loop
        int t=0;
        for (int i=0;i<say.length;i++){
            t=t+say[i];
        }
        System.out.println(t);
        //2.Yol: while-loop
        int t1=0;
        int k=0;
        while (k<say.length){
            t1=t1+say[k];
            k++;
        }System.out.println(t1);
        //3.Yol: do-while-loop
        int t2=0;
        int j=0;
        do {
            t2=t2+say[j];
            j++;
        }while (j<say.length);
        System.out.println(t2);
        //4.Yol: for each loop Array'lerde ve Collections'larda kullanilir
        int t3=0;
        for (int w:say) {
            t3= t3+w;
        }
        System.out.println(t3);

        //Example 3: String bir array olusturunuz
        //           Bu Array'e 5 tane isim yerlestiriniz
        //           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz
        //              String str[]={"Ali","Ayşe","Ahmet","Beyza","Doğan","Gülnur","Mehmet","Ümmüşan"};
        int karakter=0;
        for (String w:str) {
            karakter=karakter+w.length();
        }
        System.out.println(karakter);

        //Example 4: Char bir array olusturunuz
        //           Bu array'e 5 eleman ekleyiniz
        //           Bu array;deki sadece buyk harfleri ekrana yazdiriniz
        //          char chr[]={'A','c','f','H','i','K','L','m'};
        for (char w:chr) {
            if (w>='A' && w<='Z') {
                System.out.print(w);
            }

        }


    }
}