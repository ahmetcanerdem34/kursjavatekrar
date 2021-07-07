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
        System.out.println(map1);//bu kýsmda bize en baþta map1 in normal þeklini verir
        //{101=Ali Can, java, 102=Veli Yan, java, 103=Ali Yan, C#}

        String istenenDil = "Java";

        List<String> isimList = javaBilenler(map1, istenenDil);
        System.out.println(isimList);//[Ali Can, Veli Yan]

       // System.out.println(javaBilenler(map1, istenenDil));
    }

    private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {

        List<String> isimList = new ArrayList<>();

        for (String each : map1.values()) {//her bir valyuyu alýp aþaðýda splitlerle arraya çevireceðiz

            String arr[] = each.split(", ");
            //burayý yazdýrmak istediðimizde her bir valyue array olarak ayrý ayrý yazýlmýþ olur
            // System.out.println(Arrays.toString(arr));
            /*
[Ali Can, java]
[Veli Yan, java]
[Ali Yan, C#]

             */

            //sonra arr nin her bir elemanýný alýp, yeni listede ki istenen dilde  yoksa eklemsini saðlarýz

            if (arr[1].equalsIgnoreCase(istenenDil)) {//ar nin birinci elemaný dil kýsmý, 0 ise isim kýsmý
                                                    //biz dil kýsýmlarýna bakýyoruz javaya eþitse
                                                    //isimlistesine arr nin 0 olan yani isim soyisim kýsmýný ekle diyoruz

                isimList.add(arr[0]);//listeye 0 ve 1. index olarak isim soyisim ile bilgisayar alnýný yazacak
               // isimList.add(arr[1]);//listeye 0 ve 1. index olarak isim soyisim ile bilgisayar alnýný yazacak
            }

        }
        return isimList;
    }
}
