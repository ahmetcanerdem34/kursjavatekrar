package MentorKursGrup;

import java.util.Scanner;

public class Soru_26UlkeİsmiKısaltması {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ülke isim giriniz:");
		String ulke= scan.nextLine().toUpperCase();
		
		if(ulke.equalsIgnoreCase("amerika")) {
			
			System.out.println("USA");
		
		}else if(ulke.equalsIgnoreCase("ingiltere")) {
			
			System.out.println("UK");
		
		}else if(ulke.equalsIgnoreCase("almanya")) {
			
			System.out.println("DE");
		}else {
			
			System.out.println("NE");
			
//			    Ülke isim giriniz:
//				almanya
//				DE
//				Ülke isim giriniz:
//				ingiltere
//				UK
//				Ülke isim giriniz:
//				amerika
//				USA
//				Ülke isim giriniz:
//				fransa
//				NE
		}
	
		}
		
		

	}

}
