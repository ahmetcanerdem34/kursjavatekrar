package MentorKursGrup;

import java.util.Scanner;

public class Soru_24ÝsimVeSoyisimHarfSayma {

	public static void main(String[] args) {
	
		
		// Kullanicidan isim ve soy ismini alin isim ve soy isminin kaç harften olustugunu ekrana yazdirin.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("isim  ve soy isim giriniz:");
		String isim= scan.nextLine().toLowerCase().replace(" ", "");
		
		System.out.println(isim.length());
//		isim  ve soy isim giriniz:
//			ahmet kaya
//			9
//			girilen ismim ve soyisim :9 harften oluþmaktadýr
		
		
		int harfSayisi=isim.length();
		
		System.out.println("girilen ismim ve soyisim :"+ harfSayisi+" "+"harften oluþmaktadýr");
	
//		    isim  ve soy isim giriniz:
//			Ahmet Can Erdem
//			girilen ismim ve soyisim :13 harften oluþmaktadýr
		
//		isim  ve soy isim giriniz:
//			ibrahim karamollaoðlu
//			girilen ismim ve soyisim :20 harften oluþmak
	
	}

}
