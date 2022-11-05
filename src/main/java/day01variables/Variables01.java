package day01variables;

public class Variables01 {

    // Variable nasıl oluşturulur?

    // 1) Access Modifier   2)Data Type   3)Variable ismi    4) =    5)Değer    6);
    // Java'da ";" İngilizce'deki "." gibidir.
    // İngilizce'de "cümle" deriz, Java'da "satatement" deriz.

    // "=" sembolü "Assignment(Atama) Operatör" olarak adlandırılır.
    // "Assignment(Atama) Operatörü" sağdaki değeri alır soldaki variable'ın içine koyar.

    public int age = 13;
    public int height = 183;

                    // Java'da Data Type'ları
/*
        1) int: Integer'in kısaltması. Integer tamsayı demektir. 32 bit kullanılır.
                Matematik'de tamsayıların başı ve sonu yoktur fakat Java'da tamsayıların başı ve sonu vardır.
                En küçük int = -2,147,483,648
                En büyük int = 2,147,483,647

        2) byte: Tamsayılar için kullanılır. 8 bit kullanır.
                En küçük byte = -128
                En büyük byte = 127

        3) short: Tamsayılar içindir. 16 bit kulanılır.
                  En küçük short = -32768
                  En büyük short = 32767

        4) long: Tamsayılar içindir. 64 bit kulanılır.
                 En küçük long = -9,223,372,036,854,755,808
                 En büyük long =  9,223,372,036,854,755,807

         5) float: Ondalıklı sayılar içindir. 32 bit kullanılır.
                   "float" virgülden sonra 7 basamak içerebilir.
                   "float" değerlerinde sona "f" veya "F" koymanız gerekir.

          6) double: Ondalıklı sayılar içindir. 64 bit kullanılır.
                     "double" virgülden sonra 16 basamak içerebilir.

          7) boolean: "true" veya "false" değerleri için kullanılır. 1 bit kullanır.

          8) char: Tek karakterler için kullanılır. 16 bit kullanır.
                   A, c, 2, ?, _, =,
                   NOTE: "char" lara değer verirken, değeri tek tırnak arasına koyunuz. Yoksa hata verir.

                   NOTE: Java büyük ve küçük harflere duyarlıdır.
                         Java için TRUE ile true tamamen farklıdır.

           NOTE: Numeric Data Types: byte < short < int < long < float < double
                 Numeric olmayan Data Types: boolean - char

                                Non-Primitive Data Types
           String: İsim, adres, kimlik numarası gibi bir veya birden fazla karakter içeren değerlerde kullanılır.
                   String değerleri mutlaka çift tırnak arasına konulmalıdır.
                   String non-primitive dir. Yani bir string oluşturduğunuzda Java size bir sürü method verir.

                   Primitive ile Non-Primitive lerin farkı nedir? * İş görüşmesi sorusu olabilir.
        1)Non-Primitive data tiplerinde değerin yaninda metodlar vardir.
          Primitive data type'larinda ise sadece deger vardir, method yoktur.
        2)Primitive data type'lari Java tarafindan da olustrulmuştur, toplam 8 tanedir, biz Primitive data oluşturamayız.
          Non-Primitive data type'ları Java tarafından da olşturulmuştur, biz de oluşturabiliriz.
          Non -Primitive sayilamayacak kadar çoktur, çünkü her developer Non-Primitive data type oluşturabilir.
        3)Primitive data type isimleri küçük harflerle başlar.
          Non-Primitive daya type isimleri büyük harfle başlar.
        4)Primitive data type'lar memory'de farklı büyüklükte yerler kullanır.
          Non-Primitive'lerin hepsi memory'de aynı büyüklükte yer kullanırlar.
*/
    public byte price = 12;
    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99F;
    public double weightOfCell = 0.000012045;

    // Siz "long" demenize rağmen Java verilen sayıyı "int" kabul eder.
    // Bu yüzden, long bir variable'a "int" aralığının dışında bir sayı verirseniz mutlaka sonuna "L" veya "l" koyunuz.
    public long populationOfWorld = 7000000000L;

    // Burada "L" koymadığımız halde problem yok çünkü "1234" int aralığına uyar.
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S';

    public String name = "Tom Hanks";

    // Note: "main method" arabanın motoru gibidir.
    //       "main method" çalışmadan hiçbirşey çalşmaz
    //psvm yazıp enter tuşuna basınca aşağıdaki main method otomatik çıkıyor.
    public static void main(String[] args) {

    }

}
