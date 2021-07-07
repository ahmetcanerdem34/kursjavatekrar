package MentorKursGrup;

import java.util.Scanner;

public class Soru_32BaslangicBitisArasiniTopla {

	public static void main(String[] args) {
		
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		// biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn. for loop
		
		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç deðeri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("bitiþ deðeri giriniz:");
		int bitis=scan.nextInt();
		
		int topla=0;
		for (int i = baslangic; i < bitis; i++) {
			
			topla+=i;
			
		}
		System.out.println(topla);
//		baþlangýç deðeri giriniz:
//			2
//			bitiþ deðeri giriniz:
//			34
//			560
		

	}

}
