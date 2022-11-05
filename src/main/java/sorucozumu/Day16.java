package sorucozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day16 {

    public static <arr4> void main(String[] args) {

         /*
          ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.

          Array ile ArrayList'in farki nedir?
              1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz,
                 soyledigimiz eleman sayisindan fazla eleman koyamayiz.
                Array'ler eleman sayisinda "fixed" dirler.
                ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
              2)Array'lerin icine "primitive" ve "reference" lar konabilir.
                ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
              3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
              Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
                    eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin

       */

        //Example 1: nums ArrayList'indeki tum sayilari 11 artirdiktan sonra ekrana yazdiriniz
        //[21, 50, 23, 200, 18, 20, 23, 185]

        List<Integer> list=new ArrayList<>();
        list.add(21);
        list.add(50);
        list.add(23);
        list.add(200);
        list.add(18);
        list.add(20);
        list.add(23);
        list.add(185);

        list.set(3, 25);
        list.remove(3); //remove() method'unu icine tamsayi koyarsaniz Java onu index olarak kabul eder
        boolean bos1=list.isEmpty();
        System.out.println(bos1);


        System.out.println(list);


        List<Integer> yeniList=new ArrayList<>();
        int toplam=11;
        int idx=0;

            for (Integer w : list) {
                list.set(idx, w + 11);
                idx++;
            }
            System.out.println(list);

        //Example 1: nums ArrayList'indeki tum tek sayilari 11 artiran çift sayıları 10 azaltan kodu yaziniz.(soruyu değiştirdim)
        int ind=0;
        for (int w:list) {
            if (w%2==0){
                list.set(ind,w=w-10);

            }else{
                list.set(ind,w=w+10);

            }
            ind++;

        }System.out.print(list);

        /*
            Hocanın çözümü bu şekilde indexOf() metodunu ile.
          *** indexof() aranılan karakterin bulunduğu ilk indis değerini döndürür
          *** lastindexof() aranılan karakterin String ifede içerisindeki son indexini verir.
            for(int w : nums){
            if(w%2!=0){
                nums.set(nums.indexOf(w), w+11);
            }
        }
        System.out.println(nums);

         */
        System.out.println();

        //Example 2: ArrayList'den 34 elemaninin ilk gorunumunu siliniz
        list.add(34);
        list.add(2,34);

        System.out.println(list);
        //int sayi=34;//sayi wrapper olmadığı için remove() metodunu direkt kullanamadık.
        //list.remove(list.indexOf(sayi));
        Integer sayi=34;//wrapper sayi yı direkt ilk index te sildi
        list.remove(sayi);
        System.out.println(list);


        //Note 1: Tum tamsayilar Java icin aksi soylenmedikce primitive'dir, yani "int" dir.
        //Note 2: "primitive" ler ArrayList'lerin elemani olamazlar.
        //Note 3: "primitive" i "Wrapper Class" a cevirirseniz, non-primitive olur ve non-primitive ler ArrayList'lerin elemani olur, index olamaz

        //**************************MULTİDİOMENSİONAL ARRAYS***********************************
         /*
            Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
            Array veya Collection var ama "index" kullanmak zorunda iseniz o zaman "for-each-loop" calismaz,
             "for-loop" veya "while-loop" veya "do-while-loop" kullanmalisiniz
         */

        //Example 3: Bir tane integer multidimensional array olusturunuz
                    //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.
        int arr3[][]={{2,1,4},{4,5,6},{8,6},{9}};
        int sum=0;
        for (int[] w:arr3) {
            for (int k:w) {
                sum=sum+k;

            }

        }
        System.out.println(sum);

        //Example 4: Bir multidimensional array'i normal array'e ceviren kodu yaziniz
        //{ {2, 5, 1}, {32, 75} } ==> { 2, 5, 1, 32, 75}
        int[][] arr4 ={ {2, 5, 1}, {32, 75} };
        int toplam1=0;
        int indx=0;

        for (int[] w:arr4) {
            toplam1 = toplam1 + w.length;
        }
        System.out.println(toplam1);

        int arr4Yeni[] = new int[toplam1];
            for (int[] w:arr4) {
                for (int k:w) {
                    arr4Yeni[indx]=k;
                    indx++;

                }

            }


        System.out.println(Arrays.toString(arr4Yeni));


        //Example 5: Bir multidimensional array deki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz
        //{ {2, 5, 1}, {32, 75} }
        int arr5[][]={ {3, 6, 2}, {23, 57}, {8} };
        int in=0;
        int elSayisi=0;

        for (int[] w:arr5) {
            elSayisi=elSayisi+w.length;
        }
        System.out.println(elSayisi);
        int arr5Yeni[]=new int[elSayisi];
        for (int[] w:arr5) {
            for (int k:w) {
              arr5Yeni[in]=k;
              in++;
            }

        }
        System.out.println(Arrays.toString(arr5Yeni));
        Arrays.sort(arr5Yeni);

        System.out.println(Arrays.toString(arr5Yeni));
        System.out.println(arr5Yeni[0]+arr5Yeni[arr5Yeni.length-1]);

        int toplam3=arr5Yeni[0]+arr5Yeni[arr5Yeni.length-1];
        System.out.println(toplam3);

        //2. Yol
        //int arr5[][]={ {3, 6, 2}, {23, 57}, {8} };
        int maxEleman=arr5[0][0];
        int minEleman=arr5[0][0];

        for (int[] w:arr5) {
            for (int k:w) {
                maxEleman=Math.max(maxEleman,k);
                minEleman=Math.min(minEleman,k);

            }

        }
        System.out.println(maxEleman);
        System.out.println(minEleman);
        System.out.println(maxEleman+minEleman);


    }
}
