package MentorKursGrup;

import java.util.Scanner;

public class Soru_39WhileBaslaSonaKadarCarpimYazdir {

	public static void main(String[] args) {
	
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		// biten t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n, while loop ile
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ba�lang�� de�eri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("biti� de�eri giriniz:");
		int bitis=scan.nextInt();
		
		int carp=1;
		
		while(baslangic<bitis) {
			
			for (int i = baslangic; i < bitis; i++) {
				
				carp=carp*i;//1 1 2 2 3 6 4 24
				baslangic++;//1 2 3 4 5
				
			}
			
			System.out.println(carp);
//			ba�lang�� de�eri giriniz:
//				1
//				biti� de�eri giriniz:
//				5
//				24
			
		}
	
		
	}

}
