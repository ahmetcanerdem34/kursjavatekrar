package MentorKursGrup;

import java.util.Scanner;

public class Soru_21HaftaninGununuBulma {

	public static void main(String[] args) {
	
		// Kullanici haftanin gun numarasini girsin. Programiniz gunun ismini yazsin.
		
		
		for (int i = 0; i < 7; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Gun say�s� giriniz :");
		int sayi=scan.nextInt();
		
		if(sayi>=1 && sayi<=7) {
			
		
		
		switch(sayi) {
		
		case 1 : System.out.println("Pazartesi"); break;
		case 2 : System.out.println("Sal�"); break;
		case 3 : System.out.println("�ar�amba"); break;
		case 4 : System.out.println("Per�embe"); break;
		case 5 : System.out.println("Cuma"); break;
		case 6 : System.out.println("Cumartesi"); break;
		case 7 : System.out.println("Pazar"); break;
		
		}
		}else {
			System.out.println("g�nsay�s� 0 olamaz");
			
//			Gun say�s� giriniz :
//				0
//				g�nsay�s� 0 olamaz
//				Gun say�s� giriniz :
//				3
//				�ar�amba
//				Gun say�s� giriniz :
//				4
//				Per�embe
//				Gun say�s� giriniz :
//				5
//				Cuma
//				Gun say�s� giriniz :
//				6
//				Cumartesi
//				Gun say�s� giriniz :
//				7
//				Pazar
//				Gun say�s� giriniz :
		}
		}
	}

}
