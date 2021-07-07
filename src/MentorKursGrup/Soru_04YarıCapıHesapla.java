package MentorKursGrup;

import java.util.Scanner;

public class Soru_04YarýCapýHesapla {

	public static void main(String[] args) {
		
				// Yarýçapý kullanýcýdan alýnan bir dairenin çevresini ve alanýný hesaplayan
				// bir program yazýnýz. (float kullanýnýz)
				// Not 1: pi sayýsý: 3.14159
				// Not 2: Alan: 3.14159 x radius x radius
				// Not 3: Cevre: 2 x 3.14159 x radius

		Scanner scan= new Scanner (System.in);
		System.out.println("yarçap  giriniz :");
		float yariCap=scan.nextInt();
		
		
		float pi=3.14159f;
		float alan;
		float cevre;
		
		if(yariCap>=1) {
			
		alan=pi*yariCap*yariCap;
		cevre=2*pi*yariCap;
		
		System.out.println(alan);
		System.out.println(cevre);
			
		}else {
			
			System.out.println("uzunluk negatif veya 0 olamaz");
//			yarçap  giriniz :
//				5
//				78.53975
//				31.415901
		}
	}

}
