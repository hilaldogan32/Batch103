package day07ternarystringmanupulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
        Verilen yilin "Leap Year" olup olmadiginikontrol eden kodu laziniz.(Leap Year==>Artik yil demektir)
        i) Yil 100 e bolunurse 400 e de bolunmelidir  ==> 1600, 1800
        ii) Yil 100 e bolunmezse 4 e bolunmelidir  ==> 1996, 2001

        ONEMLI:Interwiev sorusu oolabilir
         */
        int year = 2022;
       String leap = year%100==0 ? (year%400 ==0 ? "Leap Year" : "Leap Year degil" ): (year%4==0 ? "Leap Year" : "Leap Year degil");

        System.out.println(leap);

        // Example 2: Asagidaki kurallara gore password un gecerliolup olmadigini kontrol eden kod yaziniz
        //i) 8karakterden fazla olmalidir
        //ii)8 karakterden fazla karakter varsa ilk harfi "i" olmalidir
        //8 karakterden az karakter varsa ilk harfi "K" olmalidir

        String pwd = "i2a3ed54";

        String gecerli = pwd.length()<8 ? (pwd.charAt(0)=='K' ? "Gecerli" : "Gecersiz") : (pwd.charAt(0) =='i' ? "Gecerli" : "Gecersiz");
        System.out.println(gecerli);


    }
}
