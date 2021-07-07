package MentorBizimHTableTReeMapSorulari;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap_07_SoruTekrarCozum {

    public static void main(String[] args) {
        // Asagida verilen map'de yazilim dili java olan kisi isimlerini bir liste olarak donduren
        // bir method yaziniz

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "Ali Can, java");
        map1.put(102, "Veli Yan, java");
        map1.put(103, "Ali Yan, C#");
        System.out.println(map1);//bu k�smda bize en ba�ta map1 in normal �eklini verir
        //{101=Ali Can, java, 102=Veli Yan, java, 103=Ali Yan, C#}

        String istenenDil = "Java";

        List<String> isimList = javaBilenler(map1, istenenDil);
        System.out.println(isimList);//[Ali Can, Veli Yan]

       // System.out.println(javaBilenler(map1, istenenDil));
    }

    private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {

        List<String> isimList = new ArrayList<>();

        for (String each : map1.values()) {//her bir valyuyu al�p a�a��da splitlerle arraya �evirece�iz

            String arr[] = each.split(", ");
            //buray� yazd�rmak istedi�imizde her bir valyue array olarak ayr� ayr� yaz�lm�� olur
            // System.out.println(Arrays.toString(arr));
            /*
[Ali Can, java]
[Veli Yan, java]
[Ali Yan, C#]

             */

            //sonra arr nin her bir eleman�n� al�p, yeni listede ki istenen dilde  yoksa eklemsini sa�lar�z

            if (arr[1].equalsIgnoreCase(istenenDil)) {//ar nin birinci eleman� dil k�sm�, 0 ise isim k�sm�
                                                    //biz dil k�s�mlar�na bak�yoruz javaya e�itse
                                                    //isimlistesine arr nin 0 olan yani isim soyisim k�sm�n� ekle diyoruz

                isimList.add(arr[0]);//listeye 0 ve 1. index olarak isim soyisim ile bilgisayar aln�n� yazacak
               // isimList.add(arr[1]);//listeye 0 ve 1. index olarak isim soyisim ile bilgisayar aln�n� yazacak
            }

        }
        return isimList;
    }
}
