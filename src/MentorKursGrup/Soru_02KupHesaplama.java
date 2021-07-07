package MentorKursGrup;

import java.util.Scanner;

public class Soru_02KupHesaplama {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan alýnan bir sayýnýn küpünü hesaplayan bir program yazýnýz.  kup==> kenar*kenar*kenar;
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Kenar uzunluðu girinz :");
		int uzunluk=scan.nextInt();
		
		System.out.println("küp hesaplama :"+uzunluk*uzunluk*uzunluk);
//		Kenar uzunluðu girinz :
//			3
//			27
	}

}
