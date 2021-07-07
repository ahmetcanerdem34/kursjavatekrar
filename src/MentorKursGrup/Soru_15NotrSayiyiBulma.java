package MentorKursGrup;

import java.util.Scanner;

public class Soru_15NotrSayiyiBulma {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan bir tamsayý alýn eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn.
		// 0 ise ekrana “Nötr” yazdýrýn. 0 dan büyük ise ekrana “Pozitif” yazdýrýn.

		for (int i = 0; i < 3; i++) {
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Tamsayý giriniz :");
		int sayi=scan.nextInt();
		
		
		if(sayi<0) {
			System.out.println("negatif");
		
		}else if(sayi==0) {
			
			System.out.println("sayi Nötr dür");
		
		}else {
			
			System.out.println("girilen sayi pozitiftir");
			
//			Tamsayý giriniz :
//				3
//				girilen sayi pozitiftir
//				Tamsayý giriniz :
//				-3
//				negatif
//				Tamsayý giriniz :
//				0
//				sayi Nötr dür
		}
	}

}
}