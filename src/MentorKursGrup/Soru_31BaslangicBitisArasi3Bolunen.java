package MentorKursGrup;

import java.util.Scanner;

public class Soru_31BaslangicBitisArasi3Bolunen {

	public static void main(String[] args) {
	
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan
		// ba�lay�p biti� de�erinde veya �ncesinde biten t�m 3 ile b�l�nebilen tamsay�lar� ekrana yazd�r�n. for loop

		
		Scanner scan = new Scanner(System.in);
		System.out.println("ba�lang�� de�eri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("biti� de�eri giriniz:");
		int bitis=scan.nextInt();
		
		for (int i = baslangic; i < bitis; i++) {
			
			if(i%3==0) {
				
				System.out.print(i+",");
//				    ba�lang�� de�eri giriniz:
//					2
//					biti� de�eri giriniz:
//					19
//					3,6,9,12,15,18,
			}
			
		}
	}

}
