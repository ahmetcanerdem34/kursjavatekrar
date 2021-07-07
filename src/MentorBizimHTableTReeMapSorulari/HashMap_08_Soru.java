package MentorBizimHTableTReeMapSorulari;

import java.util.*;

public class HashMap_08_Soru {

     public static void main(String[] args) {

          // Verilen bir Stringdeki harfleri ve harflerin kacar kez kullanildigini
          // return eden bir method yaziniz
          //  Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3

//1. yol Array s�n�f�ndan faydalanarak yapal�m

          String inPut="Hellooo";

          Map<String, Integer> map = harfSayisi(inPut); //neden hashmap yapt�k, ��nk� �nce harfi alaca��z
                                                       //ona birde string say� atayarak saymaya �al��aca��z
          System.out.println("1. yol :" + map);//1. yol :{e=1, H=1, l=2, o=3}

           Map<Character,Integer> mapChar = frekans(inPut);//frekans ad�nda bir method olu�turup parametree olarak inPut girdik
                                                        // Map collectionuna e�itledik

         System.out.println("2. yol"+mapChar);//2. yol{e=1, H=1, l=2, o=3}
     }




    private static Map<String, Integer> harfSayisi(String inPut) {
        String harfler []=inPut.split("");// bu �ekilde harfler de�i�keni ad�yla array a��p
                                             //input de�erimizi hi�likle virg�llere ay�rd�k [H, e, l, l, o, o, o]
          System.out.println(Arrays.toString(harfler));

          Map<String,Integer> map1 =new HashMap<>();

          for (String each: harfler) {//gidip harfler dedi�imiz konteyn�rdan her bir kelimeyi al�p gelecek

               if(!map1.containsKey(each)){//map s�n�f�ndan map1 e�er getirilen each key ini(1. k�s�m string) kapsam�yorsa
                    map1.put(each,1);//each hi getirip map1 collection �m�za ilk i yani 1 i olarak ekleyecek

               }else //e�er i�eriyorsa;
                    map1.put(each,map1.get(each)+1);
                    //map1 e ekle(put) ilk each kelimenin harflerinin key i,
                    // virg�lden sonra ki k�s�m, map1 in value sini getir(valueler getle getirilir) ve 1 artt�r


          }
          return map1;
     }

     //2. yol llaa ��z�m� Character(char) olu�turrak ��zme frekans methodumuzun ad� olsun
     private static Map<Character, Integer> frekans(String inPut) {//methodumuuzu i�leme koyduk

         Map<Character, Integer> mapChar = new HashMap<>();//mapChar ad�nda map objesi olu�turduk
                                                            //Wrapper classdan Charter k�saltmasa� char olan nonprimit i i�leme koyduk
                                                            // ve  alta ge�
         for (int i = 0; i < inPut.length(); i++) {//for d�ng�s� ile method parametresi inPut u ba�tan sona tarad�k

             char c=inPut.charAt(i); //char c de�i�keni oluturarak tarad���m�z input kelimesini getirip index olarak c ye atad�k
             if(!mapChar.containsKey(c)){//sonra mapChari�inde c nin elemanlar� yok ise

                 mapChar.put(c,1);//gel i�ine key olarak harfi(c nin kar��l��� olan helloo nun herbir harfi) koy
                               // yan�nada ilk say�s� olan 1 i koy dedik, neden ilk say� i�ermiyorsa dedik,
                              //i�erse buraya girmez a�a�� gider says�y� 1 arrt�r�r
             }else//e�er i�eriyorsa
                 mapChar.put(c,mapChar.get(c)+1);
             //mapChar.put un i�ine koy key olan harfimiz c, virg�ilden sonra olan c de�erini getir ve 1 artt�r
         }
         return mapChar;
     }

}



