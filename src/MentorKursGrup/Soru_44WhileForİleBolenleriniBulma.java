package MentorKursGrup;

import java.util.Scanner;

public class Soru_44WhileFor�leBolenleriniBulma {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir say� al�n ve bu say�n�n b�lenlerini ekrana yazd�r�n�z.
		// Ornegin; 12'nin b�lenleri 1, 2, 3, 4, 6, 12 dir. hem for-loop hem while-loop

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Say� giriniz");
		int sayi = scan.nextInt();
		
		int count1=0;
		int count2=0;
		
		for (int i = 1; i <=sayi; i++) {
			
			if(sayi%i==0) {
				
				System.out.println("say�y� b�len say� :"+i+" ");
				count1++;
				
			}else {
				
				System.out.println("say�y� b�lmeyen sayi :"+i +",");
				count2++;
			}
			
		}
		System.out.println("say�y� b�len say�lar�n toplam� ="+count1);
		System.out.println("say�y� b�lmeyen say�lar�n toplam� ="+count2);
//		Say� giriniz
//		18
//		say�y� b�len say� :1 
//		say�y� b�len say� :2 
//		say�y� b�len say� :3 
//		say�y� b�lmeyen sayi :4,
//		say�y� b�lmeyen sayi :5,
//		say�y� b�len say� :6 
//		say�y� b�lmeyen sayi :7,
//		say�y� b�lmeyen sayi :8,
//		say�y� b�len say� :9 
//		say�y� b�lmeyen sayi :10,
//		say�y� b�lmeyen sayi :11,
//		say�y� b�lmeyen sayi :12,
//		say�y� b�lmeyen sayi :13,
//		say�y� b�lmeyen sayi :14,
//		say�y� b�lmeyen sayi :15,
//		say�y� b�lmeyen sayi :16,
//		say�y� b�lmeyen sayi :17,
//		say�y� b�len say� :18 
//		say�y� b�len say�lar�n toplam� =6
//		say�y� b�lmeyen say�lar�n toplam� =12
	}

}
