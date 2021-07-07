package MentorKursGrup;

import java.util.Scanner;

public class Soru_03DikdörtgenlerPrizmasý {

	public static void main(String[] args) {
		
		
				// Boyutlarý kullanýcýdan alýnan bir dikdörtgenler prizmasýnýn hacmini hesaplayan bir
				// program yazýnýz.
				// Not: Dikdörtgenler Prizmasýnýn Hacmi: En x Boy x Yükseklik

		Scanner scan= new Scanner (System.in);
		System.out.println("En uzunluðu giriniz :");
		int en=scan.nextInt();
		System.out.println("Boy  girinz :");
		int boy=scan.nextInt();
		System.out.println("Yukseklik uzunluðu girinz :");
		int yukseklik=scan.nextInt();
		
		System.out.println("dikdörtgenler prizmasýnýn hacmi :"+en*boy*yukseklik);
//			En uzunluðu girinz :
//			4
//			Boy  girinz :
//			5
//			Yukseklik uzunluðu girinz :
//			8
//			dikdörtgenler prizmasýnýn hacmi :160
		
		
		while(en>=1 && boy>=1 && yukseklik>=1) {
			
			
			System.out.println(en*boy*yukseklik);
			break;
			
//			   En uzunluðu giriniz :
//				3
//				Boy  girinz :
//				4
//				Yukseklik uzunluðu girinz :
//				5
//				60
			
		}
	}

}
