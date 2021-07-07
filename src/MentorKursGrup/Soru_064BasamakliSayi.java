package MentorKursGrup;

import java.util.Scanner;

public class Soru_064BasamakliSayi {

	public static void main(String[] args) {
		
		
				// Kullanýcýnýn girdiði 4 basamaklý sayýnýn ilk ve son rakamýnýn toplamýný
				// ekrana yazdýran bir program yazýnýz.


		Scanner scan=new Scanner(System.in);
		System.out.println("4 basamkalý sayi giriniz :");
		int sayi=scan.nextInt();
		
		int ilkBasamak=sayi%10;
		
		int sonBasamak=sayi/1000;
		
		System.out.println(ilkBasamak+sonBasamak);
//		4 basamkalý sayi giriniz :
//			3456
//			9

	}

}
