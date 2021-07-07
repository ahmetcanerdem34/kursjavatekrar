package MentorBizimSetler;

import java.util.HashSet;

public class SetlerSoru_03 {

	  /*
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alacaksiniz.

    Çýktý--> sonuc = 44.69
     */

	public static void main(String[] args) {
		
		HashSet<Double> hs = new HashSet<>();
		
		double arr[] = {3.23 , 3.10 , 5.12 , 10.12 , 23.12};

		System.out.println(setOlustur(hs,arr));

		System.out.println(toplaminiAl(hs));

	}

	
		
	public static HashSet<Double> setOlustur(HashSet<Double> hset, double arr[]) {
		
		for (double each : arr) {
			
			hset.add(each);
			
		}
		
		return hset;
		
	}

	public static double toplaminiAl(HashSet<Double> hs) {
		double toplm=0;
		for (Double each : hs) {
			
			toplm+=each;
			
		}
		return toplm;
		
	}

}
