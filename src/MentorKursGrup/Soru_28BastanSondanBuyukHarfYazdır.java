package MentorKursGrup;

import java.util.Scanner;

public class Soru_28BastanSondanBuyukHarfYazd�r {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin bastan ikinci harfi ile sondan ikinci harfini
	    // b�y�k harf olarak ekrana yazd�r�n.


		Scanner scan = new Scanner(System.in);
		System.out.println("�lke isim giriniz:");
		String ulke= scan.nextLine().toLowerCase();
		
		
		System.out.println(ulke.toLowerCase().substring(0,1)+ulke.toUpperCase().substring(1, 2)
				       +ulke.toLowerCase().substring(2));
		
//		�lke isim giriniz:
//			kanada
//			kAnada
	}

}
