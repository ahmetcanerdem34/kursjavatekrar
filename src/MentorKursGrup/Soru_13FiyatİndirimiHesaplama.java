package MentorKursGrup;

import java.util.Scanner;

public class Soru_13Fiyat�ndirimiHesaplama {

	public static void main(String[] args) {
		
		// Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. E�er urun miktar� 1000 den fazla ise
		// Kullan�c�ya %10 indirim yap�n ve �demesi gereken toplam paray� ekrana yazd�r�n. Di�er durumlarda
		// �demesi gereken toplam paray� herhangi bir indirim yapmadan ekrana yazd�r�n.
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Ka� kilo Alacaks�n�z :");
		int kg=scan.nextInt();
		System.out.println("Birim fiyat� giriniz :");
		int birimFiyat=scan.nextInt();
		
		int indirim;
		int odeme;
		
		if(kg>1000) {
			
			indirim=(birimFiyat*10)/100;
			odeme=(birimFiyat-indirim)*kg;
			
			System.out.println("�denecek turtar :"+odeme);
		}else{
			
			odeme=kg*birimFiyat;
			
			System.out.println(odeme);
		}
		

		
	}

}
