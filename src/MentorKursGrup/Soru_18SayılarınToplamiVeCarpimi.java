package MentorKursGrup;

import java.util.Scanner;

public class Soru_18Say�lar�nToplamiVeCarpimi {

	public static void main(String[] args) {
		
		
		// Kullanicida iki sayi alin
		// Esit ise toplamlarini ekrana yazdirin
		// Farkli ise carpimlarini ekrana yazdirin 
		
		
		for (int i = 0; i <4; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Say� giriniz :");
		int sayi1 = scan.nextInt();
		System.out.println("Say� giriniz :");
		int sayi2 = scan.nextInt();
		
		int topla;
		int carp;
		
		
		if(sayi1==sayi2) {
			
			topla=sayi1+sayi2;
			System.out.println(topla);
			System.out.println("say�lar�n toplam� :" +(sayi1+sayi2));
		
		}else {
			
			carp=sayi1*sayi2;
			System.out.println(carp);
			System.out.println("say�lar�n �arp�m� :"+(sayi1*sayi2));
			
//			Say� giriniz :
//				3
//				Say� giriniz :
//				4
//				12
//				say�lar�n �arp�m� :12
//				Say� giriniz :
//				5
//				Say� giriniz :
//				5
//				10
//				say�lar�n toplam� :10
//				Say� giriniz :
//				-5
//				Say� giriniz :
//				-6
//				30
//				say�lar�n �arp�m� :30
//				Say� giriniz :
//				-6
//				Say� giriniz :
//				5
//				-30
//				say�lar�n �arp�m� :-30
			
			
		}
	}

}
}
