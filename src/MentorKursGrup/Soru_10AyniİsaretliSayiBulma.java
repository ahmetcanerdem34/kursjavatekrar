package MentorKursGrup;

import java.util.Scanner;

public class Soru_10AyniÝsaretliSayiBulma {

	public static void main(String[] args) {
		
		
		
		// Kullanýcýdan iki sayý alýn eðer sayýlarýn iþaretleri ayný ise ekrana “Ayný iþaretli” yazdýrýn.
		// Sayýlarýn iþaretleri farklý ise ekrana “Farklý iþaretli” yazdýrýn.

		
		Scanner scan=new Scanner (System.in);
		System.out.println("sayi giriniz :");
		int sayi1 = scan.nextInt();
		System.out.println("yeni sayi giriniz :");
		int sayi2= scan.nextInt();
		
		if(sayi1<0  && sayi2<0) {
			
			System.out.println("girilen iki sayýda negatif");
		
		}else if(sayi1<0 && sayi2>0)  {
			
			System.out.println("girilen ilk sayý negatif");
		
		}else if(sayi1>0 && sayi2<0) {
			
			System.out.println("girilen ikinci sayý negatif");
		
		}else if(sayi1==0 || sayi2==0) {
			
			System.out.println("girilen iki sayý da sýfýr eþit");
		
		}else {
			
			System.out.println("her iki sayýda pozitif");
			
//			sayi giriniz :
//				0
//				yeni sayi giriniz :
//				0
//				girilen iki sayý da sýfýr eþit
			
//			sayi giriniz :
//				-1
//				yeni sayi giriniz :
//				6
//				girilen ilk sayý negatif
		}
	}

}
