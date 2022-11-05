package day06nestedifswitch;


public class Nestedif01 {
    public static void main(String[] args) {
        /*
            Password un ilk harfi buyuk harf ise
             'A' olursa gecerli Password aksi halde gecersiz Password
             Password un ilk harfi kucuk harf ise 'Z' olursa gecerli pPasswod aksi halde gecersiz Password
             anlamina gelen kodu yaziniz.

         */

        String pwd = "Axy12!";

        char ilkHarf = pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {


            if (ilkHarf == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");

            }
        }else if(ilkHarf>='a' && ilkHarf<='z'){
            if(ilkHarf=='z') {
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }
            }else {
                System.out.println("Ilk karakter harf olmalidir");
            }
        }
    }

