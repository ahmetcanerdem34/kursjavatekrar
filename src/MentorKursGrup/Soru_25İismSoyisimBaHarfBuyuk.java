package MentorKursGrup;

import java.util.Scanner;

public class Soru_25ÝismSoyisimBaHarfBuyuk {

	public static void main(String[] args) {
	
		// Kullanýcýdan ilk ve soy ismini alýn isim ve soy isminin ilk harflerini büyük harf olarak ekrana yazdýrýn.


		Scanner scan = new Scanner(System.in);
		System.out.println("isim giriniz:");
		String isim= scan.nextLine().toLowerCase();
		System.out.println("isim giriniz:");
		String soyÝsim= scan.nextLine().toLowerCase();
		
		
		
	System.out.println(isim.toUpperCase().substring(0, 1)+isim.substring(1) 
					 + soyÝsim.toUpperCase().substring(0, 1)+soyÝsim.substring(1));
//	    isim giriniz:
//		Kamuran 
//		isim giriniz:
//		Akkor
//		Kamuran Akkor
	}

}
