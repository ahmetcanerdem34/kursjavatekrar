package MentorKursGrup;

import java.util.Scanner;

public class Soru_37WhileBaslaSonaKadarÇiftYazdir {

	public static void main(String[] args) {
		
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
		// baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift tamsayýlarý while loop kullanarak
		// ekrana yazdýrýnýz.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("baþlangýç deðeri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("bitiþ deðeri giriniz:");
		int bitis=scan.nextInt();
		
		while(baslangic<=bitis) {
			
			if(baslangic%2==0) {
				
				System.out.print(baslangic+",");
//				    baþlangýç deðeri giriniz:
//					3
//					bitiþ deðeri giriniz:
//					33
//					4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,
			}
			baslangic++;
		}
		

	}

}
