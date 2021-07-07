package MentorBizimHashHtableTreeMapler;

import java.util.HashMap;

public class HasMap_07_getMethodu {
    public static void main(String[] args) {

        //todo            Hashmap .get  Spesifik bir Key'i elde etmemize yarýyor.

        HashMap<String, String> map = new HashMap<>();
        //        Key        Value
        map.put("Amazon", "296 Euro");
        map.put("Ebay", "301 Euro");
        map.put("Saturn", "326 Euro");
        map.put("MediaMarkt", "340 Euro");
        map.put("Apple Store", "320 Euro");

        System.out.println("Amazon'da Ipad ne kadar? - " + map.get("Amazon"));//Amazon key'nin value'sini getirir.


        System.out.println(map.get("Ebay"));
        System.out.println(map.get("MediaMarkt"));

        /*

Amazon'da Ipad ne kadar? - 296 Euro
301 Euro
340 Euro
         */

    }
}
