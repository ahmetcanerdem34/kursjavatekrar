package MentorBizimHTableTReeMapSorulari;

import java.util.Scanner;
import java.util.TreeMap;

public class HashMap_02_Soru {

    public static void main(String[] args) {

        //TODO TreeMap kullanarak bir c�mlenin i�indeki harflerin frekans�n�(tekrarl� de�erler) method ile bulunuz.

        Scanner scan= new Scanner(System.in);
        System.out.print("C�mle giriniz :");
        String cumle=scan.nextLine().toLowerCase();

        frekans(cumle);

        //java �al��t�k�a geli�en bir dildir: j=1, a=4, �=2 ....

    }

    private static void frekans(String cumle) {

        TreeMap<Character,Integer> fr=new TreeMap<>();//KONTEYNIRIMIZ, char ve �nt olarak java de�erlendirir

        for (int i = 0; i < cumle.length(); i++) {

            if(fr.containsKey(cumle.charAt(i))){//girilen cumlenin ilk harfini al�r buraya bakar ilk oldu�u i�in else ye gider, her biri i�in b�yle �al���r
                fr.replace(cumle.charAt(i),fr.get(cumle.charAt(i))+1);//virg�l�n ilk k�sm� character k�sm�, ikinci k�s��m map in �nteger k�sm�

            }else{
                fr.put(cumle.charAt(i),1);//harf ilk oldu�u i�in ona 1 de�eri atar, birden fazla ise if k�sm� zaten devreye girecek, buraya gelmeyecek
            }

        }
        System.out.println(fr);
    }
}
