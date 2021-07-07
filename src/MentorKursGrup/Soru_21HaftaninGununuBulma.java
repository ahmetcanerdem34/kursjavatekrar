package MentorKursGrup;

import java.util.Scanner;

public class Soru_21HaftaninGununuBulma {

	public static void main(String[] args) {
	
		// Kullanici haftanin gun numarasini girsin. Programiniz gunun ismini yazsin.
		
		
		for (int i = 0; i < 7; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Gun sayýsý giriniz :");
		int sayi=scan.nextInt();
		
		if(sayi>=1 && sayi<=7) {
			
		
		
		switch(sayi) {
		
		case 1 : System.out.println("Pazartesi"); break;
		case 2 : System.out.println("Salý"); break;
		case 3 : System.out.println("Çarþamba"); break;
		case 4 : System.out.println("Perþembe"); break;
		case 5 : System.out.println("Cuma"); break;
		case 6 : System.out.println("Cumartesi"); break;
		case 7 : System.out.println("Pazar"); break;
		
		}
		}else {
			System.out.println("günsayýsý 0 olamaz");
			
//			Gun sayýsý giriniz :
//				0
//				günsayýsý 0 olamaz
//				Gun sayýsý giriniz :
//				3
//				Çarþamba
//				Gun sayýsý giriniz :
//				4
//				Perþembe
//				Gun sayýsý giriniz :
//				5
//				Cuma
//				Gun sayýsý giriniz :
//				6
//				Cumartesi
//				Gun sayýsý giriniz :
//				7
//				Pazar
//				Gun sayýsý giriniz :
		}
		}
	}

}
