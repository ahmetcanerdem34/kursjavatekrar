package MentorBizimHashHtableTreeMapler;

import java.util.HashMap;

public class HasMap_04_TemizlemeMethodu {
    public static void main(String[] args) {



//todo            Hashmap bo�altma .clear

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon", "296 Euro");
        map.put("Ebay", "301 Euro");
        map.put("Saturn", "326 Euro");
        map.put("MediaMarkt", "340 Euro");
        map.put("Apple Store", "320 Euro");

        System.out.println(".clear'dan �nce Map: " + map);
        map.clear();
        System.out.println(".clear'dan sonra Map: " + map);
        System.out.println(map.isEmpty());//true

    }
}
