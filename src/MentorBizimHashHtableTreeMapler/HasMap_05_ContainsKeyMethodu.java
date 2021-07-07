package MentorBizimHashHtableTreeMapler;

import java.util.HashMap;

public class HasMap_05_ContainsKeyMethodu {
    public static void main(String[] args) {


        //todo            Hashmap .containsKey--içeriyor mu key anahtar kelimesi önemli, key e göre hareket eder
        //todo valuede ise cintainsValue alarak deðerleri kontrol eder

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon", "296 Euro");
        map.put("Ebay", "301 Euro");
        map.put("Saturn", "326 Euro");
        map.put("MediaMarkt", "340 Euro");
        map.put("Apple Store", "320 Euro");


        System.out.println("Saturn'de Ipad satýlýyor mu?" + map.containsKey("Saturn"));//true
        System.out.println("teknoSA'da Ipad satýlýyor mu?" + map.containsKey("teknoSA"));//false
    }
}