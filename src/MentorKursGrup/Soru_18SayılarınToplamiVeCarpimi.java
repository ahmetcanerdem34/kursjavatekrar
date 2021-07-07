package MentorKursGrup;

import java.util.Scanner;

public class Soru_18SayýlarýnToplamiVeCarpimi {

	public static void main(String[] args) {
		
		
		// Kullanicida iki sayi alin
		// Esit ise toplamlarini ekrana yazdirin
		// Farkli ise carpimlarini ekrana yazdirin 
		
		
		for (int i = 0; i <4; i++) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý giriniz :");
		int sayi1 = scan.nextInt();
		System.out.println("Sayý giriniz :");
		int sayi2 = scan.nextInt();
		
		int topla;
		int carp;
		
		
		if(sayi1==sayi2) {
			
			topla=sayi1+sayi2;
			System.out.println(topla);
			System.out.println("sayýlarýn toplamý :" +(sayi1+sayi2));
		
		}else {
			
			carp=sayi1*sayi2;
			System.out.println(carp);
			System.out.println("sayýlarýn çarpýmý :"+(sayi1*sayi2));
			
//			Sayý giriniz :
//				3
//				Sayý giriniz :
//				4
//				12
//				sayýlarýn çarpýmý :12
//				Sayý giriniz :
//				5
//				Sayý giriniz :
//				5
//				10
//				sayýlarýn toplamý :10
//				Sayý giriniz :
//				-5
//				Sayý giriniz :
//				-6
//				30
//				sayýlarýn çarpýmý :30
//				Sayý giriniz :
//				-6
//				Sayý giriniz :
//				5
//				-30
//				sayýlarýn çarpýmý :-30
			
			
		}
	}

}
}
