package MentorKursGrup;

import java.util.Scanner;

public class Soru_36WhileBaslaSonaKadarYazdir {

	public static void main(String[] args) {
		
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		// biten t�m tamsay�lar� while loop kullanarak ekrana yazd�r�n�z.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("ba�lang�� de�eri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("biti� de�eri giriniz:");
		int bitis=scan.nextInt();
		
		
		
		
		while(baslangic<=bitis) {
			
			System.out.print(baslangic+",");
			baslangic++;
//			ba�lang�� de�eri giriniz:
//				3
//				biti� de�eri giriniz:
//				13
//				3,4,5,6,7,8,9,10,11,12,13,
		}

	}

}
