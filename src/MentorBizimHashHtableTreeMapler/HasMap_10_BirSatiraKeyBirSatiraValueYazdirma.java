package MentorBizimHashHtableTreeMapler;

import java.util.HashMap;

public class HasMap_10_BirSatiraKeyBirSatiraValueYazdirma {

    public static void main(String[] args) {


//todo            Hashmap bir satýra Key'leri diðer satýra Value'larý yazdýrma

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);

        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }


    }
}
