package MentorKursGrup;

import java.util.Scanner;

public class Soru_02KupHesaplama {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan al�nan bir say�n�n k�p�n� hesaplayan bir program yaz�n�z.  kup==> kenar*kenar*kenar;
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Kenar uzunlu�u girinz :");
		int uzunluk=scan.nextInt();
		
		System.out.println("k�p hesaplama :"+uzunluk*uzunluk*uzunluk);
//		Kenar uzunlu�u girinz :
//			3
//			27
	}

}
