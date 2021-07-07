package MentorBizimHTableTReeMapSorulari;

import java.util.*;

public class HashMap_07_Soru {


    public static void main(String[] args) {

    // Asagida verilen map'de yazilim dili java olan kisi isimlerini bir liste olarak donduren
        // bir method yaziniz
        Map<Integer,String>map1 = new HashMap<>();
        map1.put(101, "Ali Can, java");
        map1.put(102, "Veli Yan, java");
        map1.put(103, "Ali Yan, C#");
        System.out.println(map1);  //{101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
                                    // [Ali, Veli]
        String istenenDil="Java";
        List<String>isimList =javaBilenler(map1,istenenDil);
          System.out.println(isimList); // [Ali Can, Veli Yan]
        //System.out.println(javaBilenler(map1,istenenDil));   // 2. yol olarak container olusturmadan
    }
    private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
        List<String>isimList= new ArrayList<>();
        for (String each: map1.values()) {
            String arr [] =each.split(", ");
            //{Ali Can, java}, {Veli Yan, java}, {Ali Yan, C#}
            //1.eleman           2.eleman           3.eleman
            if (arr[1].equalsIgnoreCase(istenenDil)){
                isimList.add(arr[0]);
                //isimList.add(arr[1]);
            }
        }
    return isimList;


    }
}

