package MentorBizimHashHtableTreeMapler;

import java.util.HashMap;

public class HasMap_05_ContainsKeyMethodu {
    public static void main(String[] args) {


        //todo            Hashmap .containsKey--i�eriyor mu key anahtar kelimesi �nemli, key e g�re hareket eder
        //todo valuede ise cintainsValue alarak de�erleri kontrol eder

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon", "296 Euro");
        map.put("Ebay", "301 Euro");
        map.put("Saturn", "326 Euro");
        map.put("MediaMarkt", "340 Euro");
        map.put("Apple Store", "320 Euro");


        System.out.println("Saturn'de Ipad sat�l�yor mu?" + map.containsKey("Saturn"));//true
        System.out.println("teknoSA'da Ipad sat�l�yor mu?" + map.containsKey("teknoSA"));//false
    }
}