package MentorKursGrup;

import java.util.Scanner;

public class Soru_27�lk�kiHarfBuyukYazdir {

	public static void main(String[] args) {
		
		// Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin ilk iki harfini b�y�k harf olarak ekrana yazd�r�n.

		for (int i = 0; i < 4; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�lke isim giriniz:");
		String ulke= scan.nextLine().toLowerCase();
		
		
		System.out.println(ulke.toUpperCase().substring(0, 2)+ulke.substring(2));
		
		
//		�lke isim giriniz:
//			makedonya
//			MAkedonya
//			�lke isim giriniz:
//			tunus
//			TUnus
//			�lke isim giriniz:
//			fas
//			FAs
//			�lke isim giriniz:

	}

}
}