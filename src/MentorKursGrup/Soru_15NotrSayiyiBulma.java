package MentorKursGrup;

import java.util.Scanner;

public class Soru_15NotrSayiyiBulma {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan bir tamsay� al�n e�er tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n.
		// 0 ise ekrana �N�tr� yazd�r�n. 0 dan b�y�k ise ekrana �Pozitif� yazd�r�n.

		for (int i = 0; i < 3; i++) {
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Tamsay� giriniz :");
		int sayi=scan.nextInt();
		
		
		if(sayi<0) {
			System.out.println("negatif");
		
		}else if(sayi==0) {
			
			System.out.println("sayi N�tr d�r");
		
		}else {
			
			System.out.println("girilen sayi pozitiftir");
			
//			Tamsay� giriniz :
//				3
//				girilen sayi pozitiftir
//				Tamsay� giriniz :
//				-3
//				negatif
//				Tamsay� giriniz :
//				0
//				sayi N�tr d�r
		}
	}

}
}