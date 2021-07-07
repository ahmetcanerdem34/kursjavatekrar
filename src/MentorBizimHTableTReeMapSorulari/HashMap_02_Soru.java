package MentorBizimHTableTReeMapSorulari;

import java.util.Scanner;
import java.util.TreeMap;

public class HashMap_02_Soru {

    public static void main(String[] args) {

        //TODO TreeMap kullanarak bir cümlenin içindeki harflerin frekansýný(tekrarlý deðerler) method ile bulunuz.

        Scanner scan= new Scanner(System.in);
        System.out.print("Cümle giriniz :");
        String cumle=scan.nextLine().toLowerCase();

        frekans(cumle);

        //java çalýþtýkça geliþen bir dildir: j=1, a=4, ç=2 ....

    }

    private static void frekans(String cumle) {

        TreeMap<Character,Integer> fr=new TreeMap<>();//KONTEYNIRIMIZ, char ve ýnt olarak java deðerlendirir

        for (int i = 0; i < cumle.length(); i++) {

            if(fr.containsKey(cumle.charAt(i))){//girilen cumlenin ilk harfini alýr buraya bakar ilk olduðu için else ye gider, her biri için böyle çalýþýr
                fr.replace(cumle.charAt(i),fr.get(cumle.charAt(i))+1);//virgülün ilk kýsmý character kýsmý, ikinci kýsýým map in ýnteger kýsmý

            }else{
                fr.put(cumle.charAt(i),1);//harf ilk olduðu için ona 1 deðeri atar, birden fazla ise if kýsmý zaten devreye girecek, buraya gelmeyecek
            }

        }
        System.out.println(fr);
    }
}
