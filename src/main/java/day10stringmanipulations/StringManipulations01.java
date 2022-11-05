package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydir.";

        //startsWith("kola", 5); kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
        //"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
        boolean b = a.startsWith("kola", 5);
        System.out.println(b);

        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
        //replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
        String c = a.replaceFirst("a", "*");
        System.out.println(c);//J*va kolaydir.

        //concat() method'u iki tane String'i birbirine yapistirmaya yarar.
        //"Concatenation" islemi iki turlu yapilabilir; i)+ ile ii)concat() ile
        //Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
        String d = a.concat(" Anladin mi?");
        System.out.println(d);//Java kolaydir. Anladin mi?

        String e = "    Tom Hanks     ";
        System.out.println(e);// "    Tom Hanks     "

        //trim() methodu bir String'in bas ve sonundaki "space" karakterlerini siler, aradaki "space" karakterlerine dokunmaz
        String f = e.trim();
        System.out.println(f);//"Tom Hanks"

        String h = "Java";
        String i = "Java";

        //h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karşılaştırır.
        //Büyük harf e duyarlıdır.
        //Büyük harf küçük harfe duyarlı olmasını istemezseniz compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); kodda "h"nin alphabetik sırasından "i" nin alfabetik sırası çıkartılır.
        int k = h.compareToIgnoreCase(i);
        System.out.println(k);

        //a.repeat(5); kodu "a" String'ini yanyana 5 kere yapıştırır.
        //Java Documents'a ulaşmak için --> Windows==>Ctrl e basılı tutun ve mouse ile method ismine tıklayın.
        String n =a.repeat(3);
        System.out.println(n);

    }

}