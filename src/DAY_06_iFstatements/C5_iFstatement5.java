package DAY_06_iFstatements;

import java.util.Iterator;
import java.util.Scanner;

public class C5_iFstatement5 {

	public static void main(String[] args) {
		/*
		 * Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar
		 * icin kutsal gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun”
		 * yazdirin. “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
		 * 
		 */

		
			
	for (int i = 0; i <3; i++) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("gün ismi giriniz :");
		String gun = scan.nextLine().toLowerCase();
		
	
		
		if(gun.equals("cuma")) {
			
			System.out.println("Cuma günü, Muslumanlar icin kutsal gundür" );

		}
		
		if(gun.equals("cumartesi")) {
			
			System.out.println("Cumartesi günü Yahudiler için kutsal gündür.");
		}
		
		if(gun.equals("pazar")) {
			
			System.out.println("Pazar günü Hristiyanlar için kutsal gündür");
			
//			gün ismi giriniz :cuma
//			Cuma günü, Muslumanlar icin kutsal gundür
//			gün ismi giriniz :cumartesi
//			Cumartesi günü Yahudiler için kutsal gündür.
//			gün ismi giriniz :pazar
//			Pazar günü Hristiyanlar için kutsal gündür
			
			scan.close();
		}
	}

	}
}
