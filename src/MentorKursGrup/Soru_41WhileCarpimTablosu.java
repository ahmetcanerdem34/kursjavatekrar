package MentorKursGrup;

import java.util.Scanner;

public class Soru_41WhileCarpimTablosu {

	public static void main(String[] args) {
		
		// Kullanýcýdan bir rakam alýn ve bu rakam icin çarpým tablosunu ekrana yazdýrýn.
		// Kullanýcýnýn hata yapmadýðýný farz edin.
		// Ornegin kullanýcý 3 girerse; 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("rakam  giriniz:");
		int rakam=scan.nextInt();
		
		int bas=1;
		
		
		while(bas<=rakam) {
			
		System.out.print(rakam*bas+",");
			bas++;
		
		}
	
	

	}

}
