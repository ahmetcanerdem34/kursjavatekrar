package MentorKursGrup;

import java.util.Scanner;

public class Soru_01KareninKenarUzun {

	public static void main(String[] args) {
		

		// Kullanýcýdan karenin kenar uzunluðunu isteyin ve sonra bu karenin alan ve
				// çevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
				// karenin alani a*a...cevresi 4a;
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Kenar uzunluðu girinz :");
		int uzunluk=scan.nextInt();
		int alan=uzunluk*uzunluk;
		int çevresi=uzunluk*4;
		
		
		if(uzunluk<=0) {
			
			System.out.println("karenin uzunluðu 0 a eþit ve küçük olamaz");
		}else {
			
			System.out.println("Karenin alaný :"+alan);
			System.out.println("karenin çevresi :"+çevresi);
		}
		
				

	}

}
