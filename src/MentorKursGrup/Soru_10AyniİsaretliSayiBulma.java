package MentorKursGrup;

import java.util.Scanner;

public class Soru_10Ayni�saretliSayiBulma {

	public static void main(String[] args) {
		
		
		
		// Kullan�c�dan iki say� al�n e�er say�lar�n i�aretleri ayn� ise ekrana �Ayn� i�aretli� yazd�r�n.
		// Say�lar�n i�aretleri farkl� ise ekrana �Farkl� i�aretli� yazd�r�n.

		
		Scanner scan=new Scanner (System.in);
		System.out.println("sayi giriniz :");
		int sayi1 = scan.nextInt();
		System.out.println("yeni sayi giriniz :");
		int sayi2= scan.nextInt();
		
		if(sayi1<0  && sayi2<0) {
			
			System.out.println("girilen iki say�da negatif");
		
		}else if(sayi1<0 && sayi2>0)  {
			
			System.out.println("girilen ilk say� negatif");
		
		}else if(sayi1>0 && sayi2<0) {
			
			System.out.println("girilen ikinci say� negatif");
		
		}else if(sayi1==0 || sayi2==0) {
			
			System.out.println("girilen iki say� da s�f�r e�it");
		
		}else {
			
			System.out.println("her iki say�da pozitif");
			
//			sayi giriniz :
//				0
//				yeni sayi giriniz :
//				0
//				girilen iki say� da s�f�r e�it
			
//			sayi giriniz :
//				-1
//				yeni sayi giriniz :
//				6
//				girilen ilk say� negatif
		}
	}

}
