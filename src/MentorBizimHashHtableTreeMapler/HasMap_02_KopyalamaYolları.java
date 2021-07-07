package MentorBizimHashHtableTreeMapler;

import java.util.HashMap;

public class HasMap_02_KopyalamaYollarý {

    public static void main(String[] args) {

        /*
HashMap<String, String> map = new HashMap<>(Arrays.asList("Amazon", "296 Euro"));-->þeklinde assaigment yapýlamaz.
    çünkü List ve Set COLLECTION interface'nin nesnesidir. ancak Map COLLECTION interface'nin nesnesi olmadýðý için
    Arrays.asList("Amazon", "296 Euro") metodu kullanýlamaz
 */

        HashMap<String,String> map = new HashMap<>();

        map.put("Amazon","296 Euro");
        map.put("Ebay", "301 Euro");
        map.put("Saturn", "326 Euro");
        map.put("MediaMarkt", "340 Euro");
        map.put("Apple Store", "320 Euro");

        HashMap<String, String> map2 = new HashMap<>();
        System.out.println("----1.YOL-----");

        map2= new HashMap<>(map);//yeni map2 map'i elamnlarýný map den parametre ile aldý
        System.out.println("map2 = " + map2);


        System.out.println("-----2.YOL-------");
        map2.putAll(map);
        System.out.println("map2 = " + map2);


    }
}
