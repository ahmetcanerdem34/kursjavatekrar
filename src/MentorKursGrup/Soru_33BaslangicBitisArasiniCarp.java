package MentorKursGrup;

import java.util.Iterator;
import java.util.Scanner;

public class Soru_33BaslangicBitisArasiniCarp {

	public static void main(String[] args) {
		
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		// biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn. for loop
		
		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç deðeri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("bitiþ deðeri giriniz:");
		int bitis=scan.nextInt();
		
		int carp=1;
		int topla=0;
		for (int i = baslangic; i < bitis; i++) {
			
			carp=carp*i;
			topla=topla+carp;
		}
		System.out.println("1 den 5 e kadar olan sayýlarýn carpýmý :"+carp);
		System.out.println("1 den 5 e kadar sayýlarýn çarpýmýnýn toplamý :"+topla);
//		    baþlangýç deðeri giriniz:
//			1
//			bitiþ deðeri giriniz:
//			5
//			1 den 5 e kadar olan sayýlarýn carpýmý :24
//			1 den 5 e kadar sayýlarýn çarpýmýnýn toplamý :33

	}

}
