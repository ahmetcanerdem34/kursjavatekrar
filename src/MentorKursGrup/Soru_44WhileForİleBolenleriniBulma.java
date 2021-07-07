package MentorKursGrup;

import java.util.Scanner;

public class Soru_44WhileForÝleBolenleriniBulma {

	public static void main(String[] args) {
		
		// Kullanýcýdan bir sayý alýn ve bu sayýnýn bölenlerini ekrana yazdýrýnýz.
		// Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir. hem for-loop hem while-loop

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý giriniz");
		int sayi = scan.nextInt();
		
		int count1=0;
		int count2=0;
		
		for (int i = 1; i <=sayi; i++) {
			
			if(sayi%i==0) {
				
				System.out.println("sayýyý bölen sayý :"+i+" ");
				count1++;
				
			}else {
				
				System.out.println("sayýyý bölmeyen sayi :"+i +",");
				count2++;
			}
			
		}
		System.out.println("sayýyý bölen sayýlarýn toplamý ="+count1);
		System.out.println("sayýyý bölmeyen sayýlarýn toplamý ="+count2);
//		Sayý giriniz
//		18
//		sayýyý bölen sayý :1 
//		sayýyý bölen sayý :2 
//		sayýyý bölen sayý :3 
//		sayýyý bölmeyen sayi :4,
//		sayýyý bölmeyen sayi :5,
//		sayýyý bölen sayý :6 
//		sayýyý bölmeyen sayi :7,
//		sayýyý bölmeyen sayi :8,
//		sayýyý bölen sayý :9 
//		sayýyý bölmeyen sayi :10,
//		sayýyý bölmeyen sayi :11,
//		sayýyý bölmeyen sayi :12,
//		sayýyý bölmeyen sayi :13,
//		sayýyý bölmeyen sayi :14,
//		sayýyý bölmeyen sayi :15,
//		sayýyý bölmeyen sayi :16,
//		sayýyý bölmeyen sayi :17,
//		sayýyý bölen sayý :18 
//		sayýyý bölen sayýlarýn toplamý =6
//		sayýyý bölmeyen sayýlarýn toplamý =12
	}

}
