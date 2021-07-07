package MentorBizimHTableTReeMapSorulari;

import java.util.HashMap;
import java.util.Map;

public class HashMap_01_Soru {

    public static void main(String[] args) {

        //ToDo 5 tane ulke ismi ve nufusunu oluþturuyoruz.(put)
        //ToDo 5 tane ulke ismi ve nufusunu yazdýrýyoruz. (country)
        //ToDo 5 tane ulke ismi yazdýrýyoruz. (keyset())
        //ToDo 5 tane ulke nufusunu yazdýrýyoruz. (values())
        //ToDo nüfuslarýn toplamýný yazdýrýn.
        //ToDo kaç tane 50 milyondan çok nüfuslu ülke var?
        //ToDo kaç tane 50 milyondan az nüfuslu ülke var?

        HashMap<String,Integer> ulke = new HashMap<>();

        ulke.put("ALMANYA",80);
        ulke.put("TÜRKÝYE",83);
        ulke.put("AMERÝKA",250);
        ulke.put("FRANSA",65);
        ulke.put("KANADA",37);

        System.out.println("Ülke isimleri ve Nufuslarý :"+ulke);

        System.out.println("Ülke isimleri :"+ulke.keySet());

        System.out.println("Ülkelerin Nufuslarý :"+ulke.values());



        int index=0;
        for (Integer buyukMu: ulke.values()){

            if(buyukMu>50){
               index++;

            }

        }
        System.out.println("Nufusu 50 MÝLYONDA fazla olan ülke sayýsý :"+index);

        System.out.println("Nufusu 50 milyondan az ulke sayisi :"+(ulke.size()-index));

        int nufus=0;
        for (Integer topla : ulke.values()){
            nufus+=topla;
        }
        System.out.println("Nüfus toplami :"+nufus);


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
