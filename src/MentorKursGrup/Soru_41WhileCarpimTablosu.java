package MentorKursGrup;

import java.util.Scanner;

public class Soru_41WhileCarpimTablosu {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir rakam al�n ve bu rakam icin �arp�m tablosunu ekrana yazd�r�n.
		// Kullan�c�n�n hata yapmad���n� farz edin.
		// Ornegin kullan�c� 3 girerse; 
		
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
