package MentorKursGrup;

import java.util.Scanner;

public class Soru_26Ulke�smiK�saltmas� {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�lke isim giriniz:");
		String ulke= scan.nextLine().toUpperCase();
		
		if(ulke.equalsIgnoreCase("amerika")) {
			
			System.out.println("USA");
		
		}else if(ulke.equalsIgnoreCase("ingiltere")) {
			
			System.out.println("UK");
		
		}else if(ulke.equalsIgnoreCase("almanya")) {
			
			System.out.println("DE");
		}else {
			
			System.out.println("NE");
			
//			    �lke isim giriniz:
//				almanya
//				DE
//				�lke isim giriniz:
//				ingiltere
//				UK
//				�lke isim giriniz:
//				amerika
//				USA
//				�lke isim giriniz:
//				fransa
//				NE
		}
	
		}
		
		

	}

}
