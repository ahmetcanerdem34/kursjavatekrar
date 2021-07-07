package MentorKursGrup;

import java.util.Scanner;

public class Soru_27ÝlkÝkiHarfBuyukYazdir {

	public static void main(String[] args) {
		
		// Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdýrýn.

		for (int i = 0; i < 4; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ülke isim giriniz:");
		String ulke= scan.nextLine().toLowerCase();
		
		
		System.out.println(ulke.toUpperCase().substring(0, 2)+ulke.substring(2));
		
		
//		Ülke isim giriniz:
//			makedonya
//			MAkedonya
//			Ülke isim giriniz:
//			tunus
//			TUnus
//			Ülke isim giriniz:
//			fas
//			FAs
//			Ülke isim giriniz:

	}

}
}