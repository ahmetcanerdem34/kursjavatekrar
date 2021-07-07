package MentorBizimHashHtableTreeMapler;

import java.util.HashMap;
import java.util.Map;

public class HasMap_11_ValueleriToplama {

    public static void main(String[] args) {

        //todo            Hashmap Value'larý toplama

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);

        int toplam = 0;
        for (Map.Entry<String, Integer> sum : map.entrySet()) {
            toplam += sum.getValue();
        }
        System.out.println("Fiyatlarýn toplamý =" + toplam);

    }
}
