package DAY_06_iFstatements;

import java.util.Iterator;
import java.util.Scanner;

public class C5_iFstatement5 {

	public static void main(String[] args) {
		/*
		 * Soru 5) Kullanicidan bir gun alin eger gun �Cuma� ise ekrana �Muslumanlar
		 * icin kutsal gun� yazdirin. �Cumartesi� ise ekrana �Yahudiler icin kutsal gun�
		 * yazdirin. �Pazar� ise ekrana �Hiristiyanlar icin kutsal gun� yazdirin
		 * 
		 */

		
			
	for (int i = 0; i <3; i++) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("g�n ismi giriniz :");
		String gun = scan.nextLine().toLowerCase();
		
	
		
		if(gun.equals("cuma")) {
			
			System.out.println("Cuma g�n�, Muslumanlar icin kutsal gund�r" );

		}
		
		if(gun.equals("cumartesi")) {
			
			System.out.println("Cumartesi g�n� Yahudiler i�in kutsal g�nd�r.");
		}
		
		if(gun.equals("pazar")) {
			
			System.out.println("Pazar g�n� Hristiyanlar i�in kutsal g�nd�r");
			
//			g�n ismi giriniz :cuma
//			Cuma g�n�, Muslumanlar icin kutsal gund�r
//			g�n ismi giriniz :cumartesi
//			Cumartesi g�n� Yahudiler i�in kutsal g�nd�r.
//			g�n ismi giriniz :pazar
//			Pazar g�n� Hristiyanlar i�in kutsal g�nd�r
			
			scan.close();
		}
	}

	}
}
