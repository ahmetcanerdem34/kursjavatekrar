package MentorBizimHashHtableTreeMapler;

import java.util.HashMap;

public class HasMap_08_KeyValueDegerYazdirma {
    public static void main(String[] args) {

        //todo           Hashmap Key ve Value yazd�rma.

        HashMap<String, String> map = new HashMap<>();
//                Key           Value
        map.put("Amazon", "296 Euro");
        map.put("Ebay", "301 Euro");
        map.put("Saturn", "326 Euro");
        map.put("MediaMarkt", "340 Euro");
        map.put("Apple Store", "320 Euro");

        System.out.println("map de�erler :"+map.values());

        System.out.println("map anahtar de�erler :"+map.keySet());
/*
map de�erler :[320 Euro, 326 Euro, 301 Euro, 340 Euro, 296 Euro]
map anahtar de�erler :[Apple Store, Saturn, Ebay, MediaMarkt, Amazon]
 */



    }
}
