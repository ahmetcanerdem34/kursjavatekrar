package MentorKursGrup;

import java.util.Scanner;

public class Soru_11RakamVeSayiBulma {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir tamsay� al�n e�er tamsay� 10 dan kucuk ve 0�dan b�y�k e�it ise ekrana
		// �Rakam� yazd�r�n. Di�er durumlarda ekrana �Say�� yazd�r�n.

		
		Scanner scan=new Scanner (System.in);
		System.out.println("Tamsayi giriniz :");
		int sayi = scan.nextInt();
		
		if(sayi>=0 && sayi<10 ) {
			
			System.out.println("grilen sayi rakam d�r");
			
		}else {
			
			System.out.println("girilen say� Say� d�r");
//			Tamsayi giriniz :
//				4
//				grilen sayi rakam d�r
//			Tamsayi giriniz :
//				12
//				girilen say� Say� d�r
		}

	}

}
