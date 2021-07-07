package MentorKursGrup;

import java.util.Scanner;

public class Soru_11RakamVeSayiBulma {

	public static void main(String[] args) {
		
		// Kullanıcıdan bir tamsayı alın eğer tamsayı 10 dan kucuk ve 0’dan büyük eşit ise ekrana
		// “Rakam” yazdırın. Diğer durumlarda ekrana “Sayı” yazdırın.

		
		Scanner scan=new Scanner (System.in);
		System.out.println("Tamsayi giriniz :");
		int sayi = scan.nextInt();
		
		if(sayi>=0 && sayi<10 ) {
			
			System.out.println("grilen sayi rakam dır");
			
		}else {
			
			System.out.println("girilen sayı Sayı dır");
//			Tamsayi giriniz :
//				4
//				grilen sayi rakam dır
//			Tamsayi giriniz :
//				12
//				girilen sayı Sayı dır
		}

	}

}
