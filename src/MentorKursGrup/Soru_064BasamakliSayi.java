package MentorKursGrup;

import java.util.Scanner;

public class Soru_064BasamakliSayi {

	public static void main(String[] args) {
		
		
				// Kullan�c�n�n girdi�i 4 basamakl� say�n�n ilk ve son rakam�n�n toplam�n�
				// ekrana yazd�ran bir program yaz�n�z.


		Scanner scan=new Scanner(System.in);
		System.out.println("4 basamkal� sayi giriniz :");
		int sayi=scan.nextInt();
		
		int ilkBasamak=sayi%10;
		
		int sonBasamak=sayi/1000;
		
		System.out.println(ilkBasamak+sonBasamak);
//		4 basamkal� sayi giriniz :
//			3456
//			9

	}

}
