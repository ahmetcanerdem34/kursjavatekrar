package MentorKursGrup;

import java.util.Scanner;

public class Soru_24�simVeSoyisimHarfSayma {

	public static void main(String[] args) {
	
		
		// Kullanicidan isim ve soy ismini alin isim ve soy isminin ka� harften olustugunu ekrana yazdirin.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("isim  ve soy isim giriniz:");
		String isim= scan.nextLine().toLowerCase().replace(" ", "");
		
		System.out.println(isim.length());
//		isim  ve soy isim giriniz:
//			ahmet kaya
//			9
//			girilen ismim ve soyisim :9 harften olu�maktad�r
		
		
		int harfSayisi=isim.length();
		
		System.out.println("girilen ismim ve soyisim :"+ harfSayisi+" "+"harften olu�maktad�r");
	
//		    isim  ve soy isim giriniz:
//			Ahmet Can Erdem
//			girilen ismim ve soyisim :13 harften olu�maktad�r
		
//		isim  ve soy isim giriniz:
//			ibrahim karamollao�lu
//			girilen ismim ve soyisim :20 harften olu�mak
	
	}

}
