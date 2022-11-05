public class Ornek {

    // main method içinde kullanacağınız her şey static olamlıdır.
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));
        System.out.println(ucSayiyiCarp(2, 1.5, 6));
        System.out.println(ikiSayiyiToplaucuncuilecarp(2, 8, 3.2));
    }

    //Example 1: Toplama işlemi yapan bir method oluşturunuz
    public static double toplamaYap(double a, double b){
        return a+b;
    }
    // Example 2: Üç sayıyı birbiri ile çarpan bir method oluşturunuz.
    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;

    }
    //Example 3: Üç sayıdan ilk ikisini toplayıp üçüncü ile çarpan method oluşturup sonucu ekrana yazdırınızthod.
    public static double ikiSayiyiToplaucuncuilecarp(double a, double b, double c) {
        return (a + b) * c;


    }

}


