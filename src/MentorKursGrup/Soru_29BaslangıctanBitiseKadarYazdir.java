package MentorKursGrup;

import java.util.Scanner;

public class Soru_29Baslang�ctanBitiseKadarYazdir {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		// biten t�m tamsay�lar� ekrana yazd�r�n. for loop

		
		Scanner scan = new Scanner(System.in);
		System.out.println("ba�lang�� de�eri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("biti� de�eri giriniz:");
		int bitis=scan.nextInt();
		
		for (int i = baslangic; i <=bitis; i++) {
			
			System.out.print(i+" ");
			
//			    ba�lang�� de�eri giriniz:
//				2
//				biti� de�eri giriniz:
//				22
//				2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 
			
		}
		
		
	}

}
