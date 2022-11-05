package sorucozumu;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz

        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2. Yol:
        int i = 3;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        for (int i1 = 17; i1 > 3; i1--) {
            if (i1 % 2 == 0) {
                System.out.print(i1 + " ");
            }
        }

        System.out.println();
        //2.Yol:
        int i1 = 17;
        while (i1 > 3) {
            if (i1 % 2 == 0) {
                System.out.print(i1 + " ");
            }
            i1--;

        }
        System.out.println();

        //Example 3: 12 den 14 e kadar sayilarin toplamini veren kodu yaziniz
        int sum = 0;
        for (int i2 = 12; i2 < 15; i2++) {
            sum = sum + i2;

        }
        System.out.println(sum);

        //2.yol:
        int i3 = 12;
        int sum1 = 0;
        while (i3 < 15) {
            sum1 = sum1 + i3;
            i3++;
        }

        System.out.println(sum1);

        //Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz
        int sayi2 = 385;
        int toplam = 0;
        while (sayi2 > 0) {
            toplam = toplam + sayi2 % 10;
            sayi2 = sayi2 / 10;

        }
        System.out.println(toplam);


        //Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        //          3 ==> 3x1=3   3x2=6  3x3=9  ...  3x10=30
        Scanner input=new Scanner(System.in);
        System.out.println("Çarpım toblosunu görmek istediğiniz sayıyı giriniz");
        int sayi3= input.nextInt();
        System.out.println("Girdiğiniz sayının çarpım tablosu: ");
        for (int i2=1;i2<11;i2++){
            System.out.print(" "+sayi3+"x"+i2+"="+sayi3*i2);

        }
        System.out.println();

        //2.Yol:
        Scanner input1=new Scanner(System.in);
        System.out.println("Çarpım toblosunu görmek istediğiniz sayıyı giriniz");
        int sayi4= input1.nextInt();
        System.out.println("Girdiğiniz sayının çarpım tablosu: ");

        int i4=1;
        while (i4<11){
            System.out.print(" "+sayi4+"x"+i4+"="+sayi4*i4);
            i4++;
        }
        System.out.println();





        //Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //           24.5673 ==> 5+6+7+3 = 21
        double num = 24.5673;
        System.out.println(num);
        String str = String.valueOf(num);
        System.out.println(str);
        String decimalpart = str.split("\\.")[1];
        int numyeni = Integer.valueOf(decimalpart);
        System.out.println(decimalpart);

        int top = 0;
        do {
            top = top + numyeni % 10;
            numyeni = numyeni / 10;

        } while (numyeni > 0);
        System.out.println(top);



        //Example 1: Asagidaki sekli ekrana yazdiran kodu yaziniz
        //          ****
        //          ****
        //          ****


        Scanner input2=new Scanner(System.in);
        System.out.println("Lütfen sütun sayısını giriniz");
        int sutun= input.nextInt();
        System.out.println("Lütfen satır sayısını giriniz");
        int satir= input.nextInt();
        System.out.println("Lütfen karakteri giriniz");
        char chr=input.next().charAt(0);


        for (int i2=0;i2<satir;i2++){
            for (int k=0;k<sutun;k++){
                System.out.print(chr+" ");
            }
            System.out.println();
        }





        /*
                Example 2: Asagidaki sekil cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5


 */
        for (int k = 1; k < 6; k++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }



        /*
                Example 3: Asagidaki sekil cizen kodu yaziniz

                            * * * *
                            * * *
                            * *
                            *
         */

        for (int l = 4; l > 0; l--) {
            {
                for (int m = 1; m <= l; m++) {
                    System.out.print("*" + " ");
                }


            }
            System.out.println();

        }
        //Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int satir1= input.nextInt();
        System.out.println("Sütun sayısını giriniz");
        int sutun1= input.nextInt();

        for (int i5 =1; i5 <=satir1; i5++) {
            for (int k1 =sutun1; k1 >= i5; k1--) {
                System.out.print("%" + " ");
            }System.out.println();
        }
        //Girilen bir sayının rakamları toplamını bulunuz
        System.out.println("lütfen üç basamaklı bir sayı giriniz");
        int sayi1= input.nextInt();
        sayi1=Math.abs(sayi1);
        int sum2=0;
        while(sayi1>0){
            sum2=sum2+sayi1%10;
            sayi1=sayi1/10;
        }


        System.out.println(sum2);




        }


    }

