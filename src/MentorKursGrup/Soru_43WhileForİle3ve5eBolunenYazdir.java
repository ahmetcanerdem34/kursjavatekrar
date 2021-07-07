package MentorKursGrup;

import java.util.Scanner;

public class Soru_43WhileForÝle3ve5eBolunenYazdir {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden
		// baþlayýp bitiþ deðerinde
		// biten 3 ve 5 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz. hem for-loop
		// hem while-loop

		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðeri giriniz");
		int baslangic = scan.nextInt();
		System.out.println("Bitiþ deðeri giriniz");
		int bitis = scan.nextInt();

		for (int i = baslangic; i < bitis; i++) {

			if (i % 3 == 0) {

				System.out.println("3 e bölünenler :" + i + " ");

			} else if (i % 5 == 0) {

				System.out.println("5 e bölünenler :" + i + " ");

			} else {

				System.out.println("ikisinede bölünmeyener :" + i + " ");
//				Baþlangýç deðeri giriniz
//				1
//				Bitiþ deðeri giriniz
//				15
//				ikisinede bölünmeyener :1 
//				ikisinede bölünmeyener :2 
//				3 e bölünenler :3 
//				ikisinede bölünmeyener :4 
//				5 e bölünenler :5 
//				3 e bölünenler :6 
//				ikisinede bölünmeyener :7 
//				ikisinede bölünmeyener :8 
//				3 e bölünenler :9 
//				5 e bölünenler :10 
//				ikisinede bölünmeyener :11 
//				3 e bölünenler :12 
//				ikisinede bölünmeyener :13 
//				ikisinede bölünmeyener :14 
			}

		}

		while (baslangic < bitis) {

			if (baslangic % 3 == 0) {

				System.out.println("3 e bölünenler :" + baslangic + " ");

			} else if (baslangic % 5 == 0) {

				System.out.println("5 e bölünenler :" + baslangic + " ");

			} else {

				System.out.println("ikisinede bölünmeyener :" + baslangic + " ");

			}
			baslangic++;

//			Baþlangýç deðeri giriniz
//			1
//			Bitiþ deðeri giriniz
//			18
//			ikisinede bölünmeyener :1 
//			ikisinede bölünmeyener :2 
//			3 e bölünenler :3 
//			ikisinede bölünmeyener :4 
//			5 e bölünenler :5 
//			3 e bölünenler :6 
//			ikisinede bölünmeyener :7 
//			ikisinede bölünmeyener :8 
//			3 e bölünenler :9 
//			5 e bölünenler :10 
//			ikisinede bölünmeyener :11 
//			3 e bölünenler :12 
//			ikisinede bölünmeyener :13 
//			ikisinede bölünmeyener :14 
//			3 e bölünenler :15 
//			ikisinede bölünmeyener :16 
//			ikisinede bölünmeyener :17 
		}

	}

}
