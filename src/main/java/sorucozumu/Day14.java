package sorucozumu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {

        //Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
        String arr[] = {"Mark", "Mary", "Martin", "Tom", "Chris", "Jane"};
        for (String w : arr) {
            System.out.println(w);
            if (w.equals("Tom")) {
                break;
            }

        }

        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        String brr[] = {"Mark", "Mary", "Martin", "Tom", "Chris", "Jane"};
        for (String w : brr) {
            if (w.equals("Tom") || (w.equals("Jane"))) {
                continue;
            }
            System.out.print(w + " ");

        }
        System.out.println();
        //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç öğrenci ismi gireceğinizi yazınız");
        int StdSayisi = input.nextInt();
        String names[] = new String[StdSayisi];
        System.out.println("Eğer sistemden çıkmak isterseniz 'Q' harfine basınız");
        for (int i = 1; i <= StdSayisi; i++) {
            System.out.println("Lütfen " + i + ". Öğrencinin İsmini Giriniz");
            String Stdname = input.next();
            if (Stdname.equalsIgnoreCase("q")) {
                break;
            }

            names[i - 1] = Stdname;
        }
        System.out.println(Arrays.toString(names));


        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]
        int original[] = {0, 2, 3, 0, 12, 0};
        int neworiginal[] = new int[original.length];

        int sy = 0;
        for (int i = 0; i < original.length; i++) {

            if (original[i] != 0) {
                neworiginal[sy] = original[i];
                sy++;
            }
        }
        System.out.println(Arrays.toString(neworiginal));




    //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden
    // ve kac kere tekrarlandigini gosteren kodu yaziniz
    //           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
    //                             ==> Kullanici 6'yi sordu ==> 6 array'de yok
    int ary[] = {2, 1, 2, -3, 2,7};
    int kontrol=7;
    int counter = 0;
        for (int w:ary) {
            if (kontrol==w){
              counter++;
            }

        }if (counter>0){
            System.out.println(kontrol+" elemanı "+counter+" defa var");
        }else{
            System.out.println(kontrol+" elemanı yok");
        }





    //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
    //           "Java kolaydir calisana, ne kolay ki calismayana." ==> calismayana

        String bry = "Java kolaydir calisana, ne kolay ki calismayana.";
        bry=bry.replaceAll("\\p{Punct}","");
        System.out.println(bry);

        String cry[]=bry.split(" ");
        System.out.println(Arrays.toString(cry));

        Arrays.sort(cry,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(cry));

        System.out.println(cry[cry.length-1]);
    }


}