package MentorKursGrup;

import java.util.Scanner;

public class Soru_32BaslangicBitisArasiniTopla {

	public static void main(String[] args) {
		
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		// biten t�m tamsay�lar�n toplam�n� ekrana yazd�r�n. for loop
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ba�lang�� de�eri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("biti� de�eri giriniz:");
		int bitis=scan.nextInt();
		
		int topla=0;
		for (int i = baslangic; i < bitis; i++) {
			
			topla+=i;
			
		}
		System.out.println(topla);
//		ba�lang�� de�eri giriniz:
//			2
//			biti� de�eri giriniz:
//			34
//			560
		

	}

}
