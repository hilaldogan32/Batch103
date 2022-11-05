package day02methodcreation;

public class MemoryKullanimi {

    /*
        1)Java'da iki turlu "memory" var
            i)Stack Memory:
                a)Kucuk memory'dir
                b)Primitve ve Non-Primitive'lerin adreslerini(Reference) icerir
           ii)Heap Memory:
                a)Buyuk Memory'dir
                b)Non-Primitive'leri icerir
        2)Java Heap Memory'ye yerlestirilen her non-primitve data icin bir address(Reference) olusturur ve bu adresi(Reference)
          Stack Memory'ye koyar.
          Herhangi bir sebeple address(Reference) silinirse Java adresi(Reference) olmayan Heap deki non-primitive data yi otomatik siler.
          Memory'nin temizligini saglayan "Garbage Collector" vardir.


         *** Stack Memory: Primitive data lar içine konur. Huge a göre daha küçüktür.
                        byte, short, int, long, float, double, boolean, char burada saklanır.
                        Huge çok büyük olduğu için Java Huge a sakladığı bilgilerin adresini oluşturup Stack hafızaya
                        saklar. Huge'daki saklanan bilgilerin adresi kaybolmuş ise Java o bilgileri siler.

          ***Heap Memory (çok büyük hafıza): Non-Primitive data lar burada saklanır.
                        String, Oluşturduğumuz Class'lar burada saklanır.

           Note: Class ==> Variable ==> Object
                           Method
     */



}
