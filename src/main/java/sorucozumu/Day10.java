package sorucozumu;

public class Day10 {

    public static void main(String[] args) {


        //Example 1: Ekrana 5 kere "Hi" yazdiriniz.
        for (int i=1;i<6;i++){
            System.out.print("Hi"+" ");
        }
        System.out.println();

        //Example 2: 4 den 7 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=4;i<8;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //Example 3: 14 den 5 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=14;i>4;i--){
            System.out.print(i+" ");
        }
        System.out.println();

        //Example 4: 13 den 5 e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=12;i>5;i=i-2){
            System.out.print(i+" ");
        }
        System.out.println();
        // 2. Yol
        for (int i=13;i>5;i--){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //Example 5: 28 den 157 e kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=28;i<158;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //Example 6: "Java" String'ini "J*a*v*a*" String'ine ceviren kodu yaziniz
        String str = "Java";
        for (int i=0; i<str.length();i++){
            char c=str.charAt(i);
            System.out.print(c+"*");
        }
        System.out.println();

        //Example 7: Size verilen String'de tekrarsiz karakterleri ekrana yazdiriniz
        //           "Hellooo Ali" ==> He Ai
        String str1= "Helooo Ali";
        for (int i=0; i<str1.length();i++){
            char ch1=str1.charAt(i);
            if (str1.indexOf(ch1)==str1.lastIndexOf(ch1)){
                System.out.print(ch1);
            }

        }


    }
}
