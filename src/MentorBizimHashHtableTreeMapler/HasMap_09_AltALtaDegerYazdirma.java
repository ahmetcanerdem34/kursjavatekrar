package MentorBizimHashHtableTreeMapler;

import java.util.HashMap;
import java.util.Map;

public class HasMap_09_AltALtaDegerYazdirma {
    public static void main(String[] args) {

        //todo            Hashmap Alt alta Value yazd�rma

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon", "296 Euro");
        map.put("Ebay", "301 Euro");
        map.put("Saturn", "326 Euro");
        map.put("MediaMarkt", "340 Euro");
        map.put("Apple Store", "320 Euro");

        System.out.println(map.values());

        for (Map.Entry<String, String> yeni : map.entrySet()) {//herbir giri� yani key i getirip yeni ye atad�k yeninin
                                                                //de�erlerini yazd�rd�k

            System.out.println("Value: " + yeni.getValue());

            }
        }
    }

