package MentorBizimHashHtableTreeMapler;

import java.util.HashMap;

public class HasMap_06_ContainsValueMethodu {
    public static void main(String[] args) {



//todo            Hashmap .containsValue-----> bu de�er var m� anlam�nda

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon", "296 Euro");
        map.put("Ebay", "301 Euro");
        map.put("Saturn", "326 Euro");
        map.put("MediaMarkt", "340 Euro");
        map.put("Apple Store", "320 Euro");


        System.out.println("296 Euro'ya Ipad var m�?" + map.containsValue("296 Euro"));//True
        System.out.println("200 Euro'ya Ipad var m�?" + map.containsValue("200 Euro"));//false
    }
}
