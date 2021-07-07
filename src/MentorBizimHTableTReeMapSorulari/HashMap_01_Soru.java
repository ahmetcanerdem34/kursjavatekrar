package MentorBizimHTableTReeMapSorulari;

import java.util.HashMap;
import java.util.Map;

public class HashMap_01_Soru {

    public static void main(String[] args) {

        //ToDo 5 tane ulke ismi ve nufusunu olu�turuyoruz.(put)
        //ToDo 5 tane ulke ismi ve nufusunu yazd�r�yoruz. (country)
        //ToDo 5 tane ulke ismi yazd�r�yoruz. (keyset())
        //ToDo 5 tane ulke nufusunu yazd�r�yoruz. (values())
        //ToDo n�fuslar�n toplam�n� yazd�r�n.
        //ToDo ka� tane 50 milyondan �ok n�fuslu �lke var?
        //ToDo ka� tane 50 milyondan az n�fuslu �lke var?

        HashMap<String,Integer> ulke = new HashMap<>();

        ulke.put("ALMANYA",80);
        ulke.put("T�RK�YE",83);
        ulke.put("AMER�KA",250);
        ulke.put("FRANSA",65);
        ulke.put("KANADA",37);

        System.out.println("�lke isimleri ve Nufuslar� :"+ulke);

        System.out.println("�lke isimleri :"+ulke.keySet());

        System.out.println("�lkelerin Nufuslar� :"+ulke.values());



        int index=0;
        for (Integer buyukMu: ulke.values()){

            if(buyukMu>50){
               index++;

            }

        }
        System.out.println("Nufusu 50 M�LYONDA fazla olan �lke say�s� :"+index);

        System.out.println("Nufusu 50 milyondan az ulke sayisi :"+(ulke.size()-index));

        int nufus=0;
        for (Integer topla : ulke.values()){
            nufus+=topla;
        }
        System.out.println("N�fus toplami :"+nufus);


        for (Map.Entry<String,Integer> siralama: ulke.entrySet()){

            System.out.println(siralama);
        }
        for (String sira: ulke.keySet()){

            System.out.println(sira);
        }
        for (Integer sira: ulke.values()){

            System.out.println(sira);
        }


    }
}
