package MentorKursGrup;

import java.util.Scanner;

public class Soru_19Say�lar�nKucukOlan�n�Bulma {

	public static void main(String[] args) {
		
		
		// Kullanicidan iki sayi alini ve kucuk olani ekrana yazdiriniz
		
		for (int i = 0; i < 4; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Say� giriniz :");
		int sayi1 = scan.nextInt();
		System.out.println("Say� giriniz :");
		int sayi2 = scan.nextInt();
		
		if(sayi1<sayi2) {
			System.out.println("sayi 1 kucuktur");
			
		}else if(sayi2<sayi1) {
			
			System.out.println("sayi 2 kucuktur");
		
		}else {
			
			System.out.println("sayi 1, sayi 2 ye e�ittir");
			
//			Say� giriniz :
//				4
//				Say� giriniz :
//				5
//				sayi 1 kucuktur
//				Say� giriniz :
//				-2
//				Say� giriniz :
//				3
//				sayi 1 kucuktur
//				Say� giriniz :
//				5
//				Say� giriniz :
//				2
//				sayi 2 kucuktur
//				Say� giriniz :
//				-3
//				Say� giriniz :
//				-2
//				sayi 1 kucuktur
		}
	}

}
}