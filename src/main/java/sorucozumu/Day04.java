package sorucozumu;

public class Day04 {


    public static void main(String[] args) {
        // Example 1: sayi pozitif ise ekrana pozitif yazdirin
        byte s = 0;
        if(s>0){
            System.out.println("Pozitif");

        } else if (s<0) {
            System.out.println("Negatif");

        }else{
            System.out.println("Nötür");
        }

        //Example 2: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdirin

        char kr = 'h';

        if(kr >='A' && kr<='Z'){
            System.out.println("Büyük harf");
        }else{
            System.out.println("Küçük harf");
        }

        //Example 3: Verilen bir sayi uc basamakli ise ekrana "Uc basamakli" yazdiriniz.


        int n = 0;
        n = Math.abs(n);

        if (n>99 && n<1000) {
            System.out.println("Üç basamaklı");
        } else if (n<100 && n>9) {
            System.out.println("İki basamaklı Sayı");
        } else if (n<10 && n!=0) {
            System.out.println("Tek basamaklı Sayı");

        }else{
            System.out.println("Sıfır sayısını yazdınız");
        }

        //Example 4: Verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz

        int sayi = 13;

        if (sayi%2==0) {
            System.out.println("Sayı çift sayıdır");
        }else if (sayi%2==1) {
            System.out.println("Tek sayi");

        }
        //Example 5: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana "Harika sayi" yazdirin


        /*
            Kullanicidan ilk, orta ve soy ismini, kimlik numarasini aliniz ve asagidaki formatta ekrana yazdiriniz
            Ali Mer Can
            123456789
            1. yol, 2. yol, 3.yol
         */

        //Example : Kullanicidan ilk ve soy ismini aliniz, ilk ve soy isminin ilk harflerini ekrana yazdiriniz.
        //Ali Can ==> AC


    }
}
