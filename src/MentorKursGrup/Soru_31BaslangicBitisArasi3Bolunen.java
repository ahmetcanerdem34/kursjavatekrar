package MentorKursGrup;

import java.util.Scanner;

public class Soru_31BaslangicBitisArasi3Bolunen {

	public static void main(String[] args) {
	
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
		// baþlayýp bitiþ deðerinde veya öncesinde biten tüm 3 ile bölünebilen tamsayýlarý ekrana yazdýrýn. for loop

		
		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç deðeri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("bitiþ deðeri giriniz:");
		int bitis=scan.nextInt();
		
		for (int i = baslangic; i < bitis; i++) {
			
			if(i%3==0) {
				
				System.out.print(i+",");
//				    baþlangýç deðeri giriniz:
//					2
//					bitiþ deðeri giriniz:
//					19
//					3,6,9,12,15,18,
			}
			
		}
	}

}
