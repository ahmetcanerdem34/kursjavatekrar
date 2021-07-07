package MentorKursGrup;

import java.util.Scanner;

public class Soru_09GunBulma {

	public static void main(String[] args) {
		
		
			// Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
			// “Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. “Pazar” ise ekrana
			// “Hýristiyanlar icin kutsal gün” yazdýrýn
			
		Scanner scan=new Scanner (System.in);
		System.out.println("harf giriniz :");
		String gun= scan.next().toUpperCase();
		
		switch (gun) {
		
		case "CUMA" : System.out.println("“Müslümanlar icin kutsal gün”");break;
		
		case "CUMARTESÝ" :System.out.println("“Yahudiler icin kutsal gün”");break;
		
		case "PAZAR" : System.out.println("“Hýristiyanlar icin kutsal gün” ");break;
		
		default : System.out.println("yanlýþ gün girdiniz");
		
//		harf giriniz :
//			cuma
//			“Müslümanlar icin kutsal gün”
//		harf giriniz :
//			salý
//			yanlýþ gün girdiniz
		}

	}

}
