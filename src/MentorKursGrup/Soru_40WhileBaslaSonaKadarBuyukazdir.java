package MentorKursGrup;

import java.util.Scanner;

public class Soru_40WhileBaslaSonaKadarBuyukazdir {

	public static void main(String[] args) {
	
		
		// Kullan�c�dan ba�lang�� ve biti� harflerini al�n ve ba�lang�� harfinden ba�lay�p biti� harfinde
		// biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n. Kullan�c�n�n hata yapmad���n� farz edin.

			
		Scanner scan = new Scanner(System.in);
		System.out.println("ba�lang�� harf giriniz:");
		char basharf=scan.next().toUpperCase().charAt(0);
		System.out.println("son harf giriniz:");
		char sonharf=scan.next().toUpperCase().charAt(0);
		
		
		while(basharf<sonharf) {
			
			for (char i = basharf; i < sonharf; i++) {
				
				System.out.print(i+" ");
				basharf++;
			}
//			ba�lang�� harf giriniz:
//				a
//				son harf giriniz:
//				l
//				A B C D E F G H I J K 
		}
		
		
		
		
	}

}
