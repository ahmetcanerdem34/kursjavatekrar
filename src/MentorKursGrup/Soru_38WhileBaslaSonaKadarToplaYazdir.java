package MentorKursGrup;

import java.util.Scanner;

public class Soru_38WhileBaslaSonaKadarToplaYazdir {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		// biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn. while loop ile

		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç deðeri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("bitiþ deðeri giriniz:");
		int bitis=scan.nextInt();
		
		int toplam=0;
		while(baslangic<=bitis) {
			
			toplam+=baslangic;
			baslangic++;
			
		}
		System.out.println(toplam);
//		baþlangýç deðeri giriniz:
//			3
//			bitiþ deðeri giriniz:
//			33
//			558
		
		
	}

}
