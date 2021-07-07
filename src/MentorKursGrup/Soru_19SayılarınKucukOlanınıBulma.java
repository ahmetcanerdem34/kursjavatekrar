package MentorKursGrup;

import java.util.Scanner;

public class Soru_19SayýlarýnKucukOlanýnýBulma {

	public static void main(String[] args) {
		
		
		// Kullanicidan iki sayi alini ve kucuk olani ekrana yazdiriniz
		
		for (int i = 0; i < 4; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý giriniz :");
		int sayi1 = scan.nextInt();
		System.out.println("Sayý giriniz :");
		int sayi2 = scan.nextInt();
		
		if(sayi1<sayi2) {
			System.out.println("sayi 1 kucuktur");
			
		}else if(sayi2<sayi1) {
			
			System.out.println("sayi 2 kucuktur");
		
		}else {
			
			System.out.println("sayi 1, sayi 2 ye eþittir");
			
//			Sayý giriniz :
//				4
//				Sayý giriniz :
//				5
//				sayi 1 kucuktur
//				Sayý giriniz :
//				-2
//				Sayý giriniz :
//				3
//				sayi 1 kucuktur
//				Sayý giriniz :
//				5
//				Sayý giriniz :
//				2
//				sayi 2 kucuktur
//				Sayý giriniz :
//				-3
//				Sayý giriniz :
//				-2
//				sayi 1 kucuktur
		}
	}

}
}