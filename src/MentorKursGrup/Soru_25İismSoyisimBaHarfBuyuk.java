package MentorKursGrup;

import java.util.Scanner;

public class Soru_25�ismSoyisimBaHarfBuyuk {

	public static void main(String[] args) {
	
		// Kullan�c�dan ilk ve soy ismini al�n isim ve soy isminin ilk harflerini b�y�k harf olarak ekrana yazd�r�n.


		Scanner scan = new Scanner(System.in);
		System.out.println("isim giriniz:");
		String isim= scan.nextLine().toLowerCase();
		System.out.println("isim giriniz:");
		String soy�sim= scan.nextLine().toLowerCase();
		
		
		
	System.out.println(isim.toUpperCase().substring(0, 1)+isim.substring(1) 
					 + soy�sim.toUpperCase().substring(0, 1)+soy�sim.substring(1));
//	    isim giriniz:
//		Kamuran 
//		isim giriniz:
//		Akkor
//		Kamuran Akkor
	}

}
