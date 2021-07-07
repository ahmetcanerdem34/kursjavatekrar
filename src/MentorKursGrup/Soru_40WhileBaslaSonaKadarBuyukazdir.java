package MentorKursGrup;

import java.util.Scanner;

public class Soru_40WhileBaslaSonaKadarBuyukazdir {

	public static void main(String[] args) {
	
		
		// Kullanýcýdan baþlangýç ve bitiþ harflerini alýn ve baþlangýç harfinden baþlayýp bitiþ harfinde
		// biten tüm harfleri büyük harf olarak ekrana yazdýrýn. Kullanýcýnýn hata yapmadýðýný farz edin.

			
		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç harf giriniz:");
		char basharf=scan.next().toUpperCase().charAt(0);
		System.out.println("son harf giriniz:");
		char sonharf=scan.next().toUpperCase().charAt(0);
		
		
		while(basharf<sonharf) {
			
			for (char i = basharf; i < sonharf; i++) {
				
				System.out.print(i+" ");
				basharf++;
			}
//			baþlangýç harf giriniz:
//				a
//				son harf giriniz:
//				l
//				A B C D E F G H I J K 
		}
		
		
		
		
	}

}
