package MentorBizimHashHtableTreeMapler;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashMap_01_Nedir {

    public static void main(String[] args) {

        //todo       Hashmap Mantýðý
        // Map bir interface'dir. Map interface'inin 3 tane child class'i vardir
        /* 1) HashMap: HasMap key-value yapisini kullanir. Key ve value
         *             programci tarafindan yazilir.
         *             Key ve value'da null degeri kullanilabilir. Key'de
         *             1'den fazla null degeri kullanilirsa Java son kullanilan
         *             null'i kabul eder. Value'da 1'den fazla null degeri
         *             kullanilabilir.
         *             HashMap console'a yazdirildiginda hem key degerleri hem de
         *             value degerleri aralarina = sembolu konularak yazdirilir
         *             HashMap'ler ekrana yazdirirken rastgele siralama yapar
         *             HasMap map'ler arasinda en hizlisidir.
         *             HashMap'ler "thread safe" degildir.
         */
        HashMap<String, String> map = new HashMap<>();
        //   KEY           VALUE
        map.put("Amazon", "296 Euro");
        map.put(null, "200 Euro");//null key kabul eder
        map.put("TeknoSA", null);//null value kabul eder
        map.put("Ebay", "278 Euro");
        map.put("Saturn", "300 Euro");
        map.put("Mediamarkt", "310 Euro");
        map.put("Apple Store", "340 Euro");
        map.put("Apple Store", "300 Euro");//"Apple Store" anahtarýndaki deðer "300 Euro" olarak güncellendi.
        // Ayni key kullanildiginda ustune yazar.

        System.out.println(map);



        /* HashTable: HashMap ile hemen hemen aynidir
		 *            1)HashTable console'a yazdirildiginda HashMap gibi
		 *            rastgele siralamada yazdirilir
		 *            Farklari:
		 *            1) HashTable key ve value'larda null'a musaade etmez.
		 *            2) HashTable thread safe'dir.Bir kac isi ayni anda yapabilir.
		 *            3) HashTable daha yavastir.
		 *			  4) HashMap ve TreeMap synchronized ve thread-safe degildir.
		    			Map'ler arasindan synchronized ve thread-safe olan bir map'e ihtiyac vardir.
					    Bu yuzden Hashtable olusturulmustur.
		 */

        Hashtable<String, String> hTable = new Hashtable<>();
        hTable.put("Dil", "Kalp");
        hTable.put("Gonul", "Kalp");
        hTable.put("Dil", "Tad alma organi");
        hTable.put("Ali", "");//"" null olmadigindan problem yok
        //==> hTable.put(null, "Agizlik");//Run Time Error verir
        //==> hTable.put("Kanaat", null);//Run Time Error verir
        //Ayni key degerini tekrar kullanirsaniz son value'yu kabul eder
        System.out.println(hTable);//{Dil=Tad alma organi, Gonul=Kalp, Ali=}

        //HashMap'de kullandigimiz methodlarin tamami HashTable'da da kullanilir

        /* TreeMap: 1) TreeMap key'lerde null kullanmaya musaade etmez(NullPointerException throws) ama
		 *             value'larda istedigimiz kadar null kullanmaya istenildiði kadar musaade eder
		 *          2) TreeMap elemanlari natural order'a gore siralar
		 *          3) TreeMap en yavaslaridir
					4) TreeMap'ler syncronized ve thread-safe degildirler.
		 */

        TreeMap<Integer, String> tm1 =new TreeMap<>();
        tm1.put(101, "Ali");
        tm1.put(105, "Bahadir");
        tm1.put(104, "Ceylan");
        tm1.put(102, "Ayhan");
        tm1.put(103, "Seyhan");
        System.out.println(tm1) ; // {101=Ali, 102=Ayhan, 103=Seyhan, 104=Ceylan, 105=Bahadir}

        tm1.put(100, null);
        tm1.put(106, null);
        tm1.put(107, null);
        System.out.println(tm1); // {100=null, 101=Ali, 102=Ayhan, 103=Seyhan, 104=Ceylan, 105=Bahadir, 106=null, 107=null}

        // tm1.put(null, "Ceyhan"); NullPointerException throws

        // ceilingKey(95) method'u keyler arasinda 95'e esit olan varsa 95'i return eder
        // esit olan yoksa 95'den buyuk en kucuk key'i return eder. 95 veya 95'den buyuk yoksa null return eder.
        System.out.println(tm1.ceilingKey(95));
        System.out.println(tm1.ceilingEntry(108)); //null

        //ascending order: Artan siralama
        //descending order: Azalan siralama
        System.out.println(tm1.descendingKeySet()); // [107, 106, 105, 104, 103, 102, 101, 100]
        System.out.println(tm1.keySet()); // [100, 101, 102, 103, 104, 105, 106, 107]

        System.out.println(tm1.firstKey()); //100
        System.out.println(tm1.lastKey()); // 107
    }
}


