package DAY_08_nested�f;

import java.util.Scanner;

public class C4_Nested�f4 {

	public static void main(String[] args) {
		/*
		 * Soru 12) Kullan�c�dan 4 basamakli bir sayi girmesini isteyin. Girdi�i sayi
		 * 5�e b�l�n�yorsa son rakam�n� kontrol edin. Son rakam� 0 ise ekrana �5�e
		 * b�l�nen �ift say�� yazd�r�n. Son rakam� 0 de�il ise �5�e b�l�nen tek say��
		 * yazd�r�n. Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("4 basamakl� bir say� giriniz :");
		int sayi = scan.nextInt();
		String basamak = " ";

		if (sayi >= 1000 && sayi <= 9999) {// 4 basamakl� ise buray� �al��t�r, de�ilse a�a�� else ekle

			if (sayi % 5 == 0) {

				if (sayi % 10 == 0) {

					System.out.println("5' e b�l�nen �ift say�..");

				} else {
					System.out.println("5 e b�l�nen tek say�");

				}

			} else {

				System.out.println("tekrar deneyiniz");

			}

		}
		else {
			
			System.out.println("girdi�iniz say� 4 basamakl� de�il");
			
//			4 basamakl� bir say� giriniz :567
//			girdi�iniz say� 4 basamakl� de�il
			
//			4 basamakl� bir say� giriniz :5555
//			5 e b�l�nen tek say�


		}
	}

}
