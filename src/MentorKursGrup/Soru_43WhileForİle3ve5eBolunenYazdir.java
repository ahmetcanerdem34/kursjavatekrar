package MentorKursGrup;

import java.util.Scanner;

public class Soru_43WhileFor�le3ve5eBolunenYazdir {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden
		// ba�lay�p biti� de�erinde
		// biten 3 ve 5 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z. hem for-loop
		// hem while-loop

		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� de�eri giriniz");
		int baslangic = scan.nextInt();
		System.out.println("Biti� de�eri giriniz");
		int bitis = scan.nextInt();

		for (int i = baslangic; i < bitis; i++) {

			if (i % 3 == 0) {

				System.out.println("3 e b�l�nenler :" + i + " ");

			} else if (i % 5 == 0) {

				System.out.println("5 e b�l�nenler :" + i + " ");

			} else {

				System.out.println("ikisinede b�l�nmeyener :" + i + " ");
//				Ba�lang�� de�eri giriniz
//				1
//				Biti� de�eri giriniz
//				15
//				ikisinede b�l�nmeyener :1 
//				ikisinede b�l�nmeyener :2 
//				3 e b�l�nenler :3 
//				ikisinede b�l�nmeyener :4 
//				5 e b�l�nenler :5 
//				3 e b�l�nenler :6 
//				ikisinede b�l�nmeyener :7 
//				ikisinede b�l�nmeyener :8 
//				3 e b�l�nenler :9 
//				5 e b�l�nenler :10 
//				ikisinede b�l�nmeyener :11 
//				3 e b�l�nenler :12 
//				ikisinede b�l�nmeyener :13 
//				ikisinede b�l�nmeyener :14 
			}

		}

		while (baslangic < bitis) {

			if (baslangic % 3 == 0) {

				System.out.println("3 e b�l�nenler :" + baslangic + " ");

			} else if (baslangic % 5 == 0) {

				System.out.println("5 e b�l�nenler :" + baslangic + " ");

			} else {

				System.out.println("ikisinede b�l�nmeyener :" + baslangic + " ");

			}
			baslangic++;

//			Ba�lang�� de�eri giriniz
//			1
//			Biti� de�eri giriniz
//			18
//			ikisinede b�l�nmeyener :1 
//			ikisinede b�l�nmeyener :2 
//			3 e b�l�nenler :3 
//			ikisinede b�l�nmeyener :4 
//			5 e b�l�nenler :5 
//			3 e b�l�nenler :6 
//			ikisinede b�l�nmeyener :7 
//			ikisinede b�l�nmeyener :8 
//			3 e b�l�nenler :9 
//			5 e b�l�nenler :10 
//			ikisinede b�l�nmeyener :11 
//			3 e b�l�nenler :12 
//			ikisinede b�l�nmeyener :13 
//			ikisinede b�l�nmeyener :14 
//			3 e b�l�nenler :15 
//			ikisinede b�l�nmeyener :16 
//			ikisinede b�l�nmeyener :17 
		}

	}

}
