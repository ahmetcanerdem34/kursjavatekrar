package MentorKursGrup;

import java.util.Scanner;

public class Soru_03Dikd�rtgenlerPrizmas� {

	public static void main(String[] args) {
		
		
				// Boyutlar� kullan�c�dan al�nan bir dikd�rtgenler prizmas�n�n hacmini hesaplayan bir
				// program yaz�n�z.
				// Not: Dikd�rtgenler Prizmas�n�n Hacmi: En x Boy x Y�kseklik

		Scanner scan= new Scanner (System.in);
		System.out.println("En uzunlu�u giriniz :");
		int en=scan.nextInt();
		System.out.println("Boy  girinz :");
		int boy=scan.nextInt();
		System.out.println("Yukseklik uzunlu�u girinz :");
		int yukseklik=scan.nextInt();
		
		System.out.println("dikd�rtgenler prizmas�n�n hacmi :"+en*boy*yukseklik);
//			En uzunlu�u girinz :
//			4
//			Boy  girinz :
//			5
//			Yukseklik uzunlu�u girinz :
//			8
//			dikd�rtgenler prizmas�n�n hacmi :160
		
		
		while(en>=1 && boy>=1 && yukseklik>=1) {
			
			
			System.out.println(en*boy*yukseklik);
			break;
			
//			   En uzunlu�u giriniz :
//				3
//				Boy  girinz :
//				4
//				Yukseklik uzunlu�u girinz :
//				5
//				60
			
		}
	}

}
