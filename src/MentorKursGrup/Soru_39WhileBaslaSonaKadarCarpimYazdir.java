package MentorKursGrup;

import java.util.Scanner;

public class Soru_39WhileBaslaSonaKadarCarpimYazdir {

	public static void main(String[] args) {
	
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		// biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn, while loop ile
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç deðeri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("bitiþ deðeri giriniz:");
		int bitis=scan.nextInt();
		
		int carp=1;
		
		while(baslangic<bitis) {
			
			for (int i = baslangic; i < bitis; i++) {
				
				carp=carp*i;//1 1 2 2 3 6 4 24
				baslangic++;//1 2 3 4 5
				
			}
			
			System.out.println(carp);
//			baþlangýç deðeri giriniz:
//				1
//				bitiþ deðeri giriniz:
//				5
//				24
			
		}
	
		
	}

}
