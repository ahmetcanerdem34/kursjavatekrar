package DAY_08_nestedİf;

import java.util.Scanner;

public class C4_Nestedİf4 {

	public static void main(String[] args) {
		/*
		 * Soru 12) Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi
		 * 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e
		 * bölünen çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı”
		 * yazdırın. Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("4 basamaklı bir sayı giriniz :");
		int sayi = scan.nextInt();
		String basamak = " ";

		if (sayi >= 1000 && sayi <= 9999) {// 4 basamaklı ise burayı çalıştır, değilse aşağı else ekle

			if (sayi % 5 == 0) {

				if (sayi % 10 == 0) {

					System.out.println("5' e bölünen çift sayı..");

				} else {
					System.out.println("5 e bölünen tek sayı");

				}

			} else {

				System.out.println("tekrar deneyiniz");

			}

		}
		else {
			
			System.out.println("girdiğiniz sayı 4 basamaklı değil");
			
//			4 basamaklı bir sayı giriniz :567
//			girdiğiniz sayı 4 basamaklı değil
			
//			4 basamaklı bir sayı giriniz :5555
//			5 e bölünen tek sayı


		}
	}

}
