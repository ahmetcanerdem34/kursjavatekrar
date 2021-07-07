package MentorKursGrup;

import java.util.Iterator;
import java.util.Scanner;

public class Soru_30BaslangicBitisArasiÇift {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
	    // baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift tamsayýlarý ekrana yazdýrýn. for loop
		
		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç deðeri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("bitiþ deðeri giriniz:");
		int bitis=scan.nextInt();
		
		for (int i = baslangic; i < bitis; i++) {
			
			if(i%2==0) {
				
				System.out.print(i+",");
//				    baþlangýç deðeri giriniz:
//					3
//					bitiþ deðeri giriniz:
//					17
//					4,6,8,10,12,14,16,
			
			}
			
		}

	}

}
