package MentorKursGrup;

import java.util.Scanner;

public class Soru_34StringiBastanSonaBuyukYaz {

	public static void main(String[] args) {
		
		// Kullanýcýdan baþlangýç ve bitiþ harflerini alýn ve baþlangýç harfinden baþlayýp bitiþ harfinde
		// biten tüm harfleri büyük harf olarak ekrana yazdýrýn. for loop

		
		Scanner scan = new Scanner(System.in);
		System.out.println("baþlngýç harf deðeri giriniz:");
		char ilk=scan.next().toUpperCase().charAt(0);
		System.out.println("bitiþ harf deðeri giriniz:");
		char son=scan.next().toUpperCase().charAt(0);
		
		String yeni="";
		for (char i = ilk; i <=son; i++) {
			
			yeni+=i;
			System.out.print(i+",");
//			    baþlngýç harf deðeri giriniz:
//				a
//				bitiþ harf deðeri giriniz:
//				k
//				A,B,C,D,E,F,G,H,I,J,K,
			
		}
		
	}

}
