package MentorKursGrup;

import java.util.Scanner;

public class Soru_37WhileBaslaSonaKadar�iftYazdir {

	public static void main(String[] args) {
		
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan
		// ba�lay�p biti� de�erinde veya �ncesinde biten t�m �ift tamsay�lar� while loop kullanarak
		// ekrana yazd�r�n�z.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("ba�lang�� de�eri giriniz:");
		int baslangic=scan.nextInt();
		System.out.println("biti� de�eri giriniz:");
		int bitis=scan.nextInt();
		
		while(baslangic<=bitis) {
			
			if(baslangic%2==0) {
				
				System.out.print(baslangic+",");
//				    ba�lang�� de�eri giriniz:
//					3
//					biti� de�eri giriniz:
//					33
//					4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,
			}
			baslangic++;
		}
		

	}

}
