package MentorKursGrup;

import java.util.Scanner;

public class Soru_38WhileBaslaSonaKadarToplaYazdir {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		// biten t�m tamsay�lar�n toplam�n� ekrana yazd�r�n. while loop ile

		Scanner scan = new Scanner(System.in);
		System.out.println("ba�lang�� de�eri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("biti� de�eri giriniz:");
		int bitis=scan.nextInt();
		
		int toplam=0;
		while(baslangic<=bitis) {
			
			toplam+=baslangic;
			baslangic++;
			
		}
		System.out.println(toplam);
//		ba�lang�� de�eri giriniz:
//			3
//			biti� de�eri giriniz:
//			33
//			558
		
		
	}

}
