package MentorKursGrup;

import java.util.Scanner;

public class Soru_36WhileBaslaSonaKadarYazdir {

	public static void main(String[] args) {
		
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		// biten tüm tamsayýlarý while loop kullanarak ekrana yazdýrýnýz.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç deðeri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("bitiþ deðeri giriniz:");
		int bitis=scan.nextInt();
		
		
		
		
		while(baslangic<=bitis) {
			
			System.out.print(baslangic+",");
			baslangic++;
//			baþlangýç deðeri giriniz:
//				3
//				bitiþ deðeri giriniz:
//				13
//				3,4,5,6,7,8,9,10,11,12,13,
		}

	}

}
