package MentorKursGrup;

import java.util.Scanner;

public class Soru_29BaslangýctanBitiseKadarYazdir {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		// biten tüm tamsayýlarý ekrana yazdýrýn. for loop

		
		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç deðeri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("bitiþ deðeri giriniz:");
		int bitis=scan.nextInt();
		
		for (int i = baslangic; i <=bitis; i++) {
			
			System.out.print(i+" ");
			
//			    baþlangýç deðeri giriniz:
//				2
//				bitiþ deðeri giriniz:
//				22
//				2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 
			
		}
		
		
	}

}
