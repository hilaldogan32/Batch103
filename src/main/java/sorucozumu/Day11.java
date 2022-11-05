package sorucozumu;

public class Day11 {

    public static void main(String[] args) {

        //Example 1: 3 den 6 a kadar tamsayilarin toplamini bulan kodu yaziniz
        int sum=0;
        for (int i=3;i<7;i++){
            sum=sum+i;
            System.out.print(sum+":");
        }
        System.out.println();
        System.out.println(sum);

        //Note:  System.out.println(sum); loop'un disina yazilirsa "sum"in sadece son degerini ekrana yazdirir.
        //       System.out.println(sum); loop'un icine yazilirsa her bir loop icin "sum"in hangi degerleri aldigini yazdirir.

        //Example 2: 6 den 3 a kadar tamsayilarin carpimini bulan kodu yaziniz
        int multiply=1;
        for (int i=6;i>2;i--){
            multiply=multiply*i;
            System.out.print(multiply*i+":");

        }
        System.out.println();
        System.out.println(multiply);

        //Example 3: Size verilen bir tamsayinin rakamlari toplamini bulunuz
        //******bir daha yap
        int sayi=-385;
        sayi=Math.abs(sayi);
        int toplam=0;
        for (int i=sayi;i>0;i=i/10){
            toplam=toplam+i%10;
        }
        System.out.println(toplam);

        //Example 4: Size verilen bir String'i ters ceviren kodu yaziniz.
        //           "Kaba" ==> "abaK"
        String str="Kaba";
        String yenistr="";
        for (int i=str.length()-1;i>-1;i--){
            char chr=str.charAt(i);
            yenistr=yenistr+chr;

        }
        System.out.println(yenistr);

        //Example 5: Bir String'deki "m" karakteri haric tum karakterleri yazdiriniz
        //Andromeda ==> Androeda
        String str1="Andromeda";
        for (int i=0; i<str1.length();i++){
            char ch=str1.charAt(i);
            if (ch=='m'){
                continue;
            }
            System.out.print(ch);

            }
        System.out.println();

        //2. Yol:
        for (int i=0; i<str1.length();i++){
            char ch=str1.charAt(i);
            if (ch!='m'){
                System.out.print(ch);
            }

        }

        System.out.println();

        //Example 6: 1'den 100 e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz
        for (int i=1;i<51;i++) {
            if (i % 6 != 0) {
                System.out.print(i + " ");
            }
        }//Tek satırda çok uzun oluyor diye iki satıra böldüm.
            System.out.println();

            for (int i=50;i<101;i++) {
                if (i % 6 != 0) {
                    System.out.print(i + " ");
                }
            }
        System.out.println();

        //Example 7: Size verilen bir String'deki 'm' den onceki karakterleri yazdiriniz
        //           Luxemburg ==> Luxe
            String str2="Luxemburg";
            for (int i=0;i<str2.length();i++){
                char ch2=str2.charAt(i);

                if (ch2=='m'){
                    break;

                }
                System.out.print(ch2);
            }
        System.out.println();
        /*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        for (int i=1;i<5;i++){
            System.out.println("Week: "+i);

            for (int k=1;k<8;k++){
                System.out.println("Day: "+k);

            }
            System.out.println();
        }


    }
}
