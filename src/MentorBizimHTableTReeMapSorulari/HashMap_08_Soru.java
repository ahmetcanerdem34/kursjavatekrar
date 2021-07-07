package MentorBizimHTableTReeMapSorulari;

import java.util.*;

public class HashMap_08_Soru {

     public static void main(String[] args) {

          // Verilen bir Stringdeki harfleri ve harflerin kacar kez kullanildigini
          // return eden bir method yaziniz
          //  Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3

//1. yol Array sýnýfýndan faydalanarak yapalým

          String inPut="Hellooo";

          Map<String, Integer> map = harfSayisi(inPut); //neden hashmap yaptýk, çünkü önce harfi alacaðýz
                                                       //ona birde string sayý atayarak saymaya çalýþacaðýz
          System.out.println("1. yol :" + map);//1. yol :{e=1, H=1, l=2, o=3}

           Map<Character,Integer> mapChar = frekans(inPut);//frekans adýnda bir method oluþturup parametree olarak inPut girdik
                                                        // Map collectionuna eþitledik

         System.out.println("2. yol"+mapChar);//2. yol{e=1, H=1, l=2, o=3}
     }




    private static Map<String, Integer> harfSayisi(String inPut) {
        String harfler []=inPut.split("");// bu þekilde harfler deðiþkeni adýyla array açýp
                                             //input deðerimizi hiçlikle virgüllere ayýrdýk [H, e, l, l, o, o, o]
          System.out.println(Arrays.toString(harfler));

          Map<String,Integer> map1 =new HashMap<>();

          for (String each: harfler) {//gidip harfler dediðimiz konteynýrdan her bir kelimeyi alýp gelecek

               if(!map1.containsKey(each)){//map sýnýfýndan map1 eðer getirilen each key ini(1. kýsým string) kapsamýyorsa
                    map1.put(each,1);//each hi getirip map1 collection ýmýza ilk i yani 1 i olarak ekleyecek

               }else //eðer içeriyorsa;
                    map1.put(each,map1.get(each)+1);
                    //map1 e ekle(put) ilk each kelimenin harflerinin key i,
                    // virgülden sonra ki kýsým, map1 in value sini getir(valueler getle getirilir) ve 1 arttýr


          }
          return map1;
     }

     //2. yol llaa çözümü Character(char) oluþturrak çözme frekans methodumuzun adý olsun
     private static Map<Character, Integer> frekans(String inPut) {//methodumuuzu iþleme koyduk

         Map<Character, Integer> mapChar = new HashMap<>();//mapChar adýnda map objesi oluþturduk
                                                            //Wrapper classdan Charter kýsaltmasaý char olan nonprimit i iþleme koyduk
                                                            // ve  alta geç
         for (int i = 0; i < inPut.length(); i++) {//for döngüsü ile method parametresi inPut u baþtan sona taradýk

             char c=inPut.charAt(i); //char c deðiþkeni oluturarak taradýðýmýz input kelimesini getirip index olarak c ye atadýk
             if(!mapChar.containsKey(c)){//sonra mapChariçinde c nin elemanlarý yok ise

                 mapChar.put(c,1);//gel içine key olarak harfi(c nin karþýlýðý olan helloo nun herbir harfi) koy
                               // yanýnada ilk sayýsý olan 1 i koy dedik, neden ilk sayý içermiyorsa dedik,
                              //içerse buraya girmez aþaðý gider saysýyý 1 arrtýrýr
             }else//eðer içeriyorsa
                 mapChar.put(c,mapChar.get(c)+1);
             //mapChar.put un içine koy key olan harfimiz c, virgüilden sonra olan c deðerini getir ve 1 arttýr
         }
         return mapChar;
     }

}



