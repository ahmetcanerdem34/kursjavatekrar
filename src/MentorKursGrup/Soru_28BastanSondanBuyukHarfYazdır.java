package MentorKursGrup;

import java.util.Scanner;

public class Soru_28BastanSondanBuyukHarfYazdýr {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin bastan ikinci harfi ile sondan ikinci harfini
	    // büyük harf olarak ekrana yazdýrýn.


		Scanner scan = new Scanner(System.in);
		System.out.println("Ülke isim giriniz:");
		String ulke= scan.nextLine().toLowerCase();
		
		
		System.out.println(ulke.toLowerCase().substring(0,1)+ulke.toUpperCase().substring(1, 2)
				       +ulke.toLowerCase().substring(2));
		
//		Ülke isim giriniz:
//			kanada
//			kAnada
	}

}
