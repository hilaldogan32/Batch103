package sorucozumu;

import java.util.Arrays;
import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {

        //ARRAYS01
        //binarySearch() Method: Bu method'u kullnarak bir elemanin Array'de olup olmadigini anlariz.
        //                       binarySearch() Method'unu kullanmadan once mutlaka "Arrays.sort()" kullanilmalidir.
        //                       binarySearch() Method'u aradiginiz eleman Array'de varsa o elemanin indexini return eder.

        //                       binarySearch() Method'u aradiginiz eleman Array'de yoksa "- a" seklinde bir negatif sayi alirsiniz.
        //                       Bu sayidaki "-" isaretinin anlami bu eleman Array'de yok demektir, "a" nin anlami olsaydi kacinci sirada olurdu demektir.

        //                       binarySearch() Method'u tekrarlayan elemanlar icin kullanilmaz.

        //Example 1: Altı elemanlı bir array olışturun ve bu elemanların arrain içinde olup olmadığını veren kodu yazını.
        int arr[]={12,43,23,25,32,11};
        int sayi1=11;
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

       int sonuc= Arrays.binarySearch(arr,sayi1);
        System.out.println(sonuc);

        int sayi2=23;
        int sonuc2=Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc2);

        int sayi3 =10;
        int sonuc3=Arrays.binarySearch(arr,sayi3);
        System.out.println(sonuc3);

        //ARRAYS02
        //Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer array'deki "en buyuk negatif"
        // ve "en kucuk pozitif" elemani bulunuz.
        int arr1[]={3, 4, 23, -12, -21, 17, 31, -5};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int minNegative=arr1[0];
        int maxPozitif=arr1[arr1.length-1];

        for (int w:arr1) {
            if (w<0){
                minNegative=Math.max(minNegative, w);
            }else if(w>0){
                maxPozitif=Math.min(maxPozitif, w);
            }

        }
        System.out.println("Arraydeki en büyük negatif sayı: " + minNegative );
        System.out.print("Arraydeki en küçük pozitif sayı: " + maxPozitif);

        System.out.println();

        //Example 1: Bir String'deki sesli harflerin sayisini bulan kodu yaziniz
        //           a - e - i - o - u - A - E - I - O - U
        String str="Java öğrenmek için vakit bulmak düşündüğümden daha zor";
        String str1[]=str.toLowerCase().split("");
        System.out.println(Arrays.toString(str1));
        Arrays.sort(str1);
        int counter=0;
        for (String w:str1) {
            switch(w){
                case"a":
                case"e":
                case"i":
                case"o":
                case"u":
                    counter++;
            }

        } System.out.println(counter);

        //Example 1: String bir Multidimesional Array olusturunuz.
        //           Elemanlari ekleyiniz
        //           Toplam eleman sayisini ekrana yazdiran kodu yaziniz

        String arr2[][]=new String[3][2];

        arr2[0][0]="Java";
        arr2[0][1]="Öğrenmek";

        arr2[1][0]="için";
        arr2[1][1]="vakit";

        arr2[2][0]="olması";
        arr2[2][1]="gerek";

        System.out.println(Arrays.deepToString(arr2));
        int toplam=0;
        int toplamHarf=0;

        for (String[] w:arr2) {
            toplam=toplam+w.length;
            for (String k:w) {
              toplamHarf=toplamHarf+k.length();
            }
        }
        System.out.println(toplamHarf);
        System.out.println(toplam);


        //Bir String multidimensional array'de icinde "a" olan elemanlari concole'a yazdiriniz.
        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        for (String[] w:brr) {
            for (String k:w) {
                if (k.contains("a")){
                    System.out.print(k+" ");
                }

            }

        }



    }
}
