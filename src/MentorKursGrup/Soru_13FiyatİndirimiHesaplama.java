package MentorKursGrup;

import java.util.Scanner;

public class Soru_13FiyatÝndirimiHesaplama {

	public static void main(String[] args) {
		
		// Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. Eðer urun miktarý 1000 den fazla ise
		// Kullanýcýya %10 indirim yapýn ve ödemesi gereken toplam parayý ekrana yazdýrýn. Diðer durumlarda
		// ödemesi gereken toplam parayý herhangi bir indirim yapmadan ekrana yazdýrýn.
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Kaç kilo Alacaksýnýz :");
		int kg=scan.nextInt();
		System.out.println("Birim fiyatý giriniz :");
		int birimFiyat=scan.nextInt();
		
		int indirim;
		int odeme;
		
		if(kg>1000) {
			
			indirim=(birimFiyat*10)/100;
			odeme=(birimFiyat-indirim)*kg;
			
			System.out.println("ödenecek turtar :"+odeme);
		}else{
			
			odeme=kg*birimFiyat;
			
			System.out.println(odeme);
		}
		

		
	}

}
