package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_�fStCal�sma09_methodlu {

	public static void main(String[] args) {

		/*
		 * Problem Tan�m� Klavyeden iki say� alarak bu say�lar� mant�ksal olarak
		 * kar��la�t�ran kod �rne�ini yaz�n�z. Kullan�lacak olan operat�rler �unlard�r:
		 * == , != , < , > , <= , >=
		 * 
		 * �rnek Ekran ��kt�lar�: Birinci sayiyi giriniz: 5 ikinci sayiyi giriniz: 10
		 * sayilar esit degildir sayilar farklidir ilk sayi kucuktur ikinci sayi kucuk
		 * degildir ilk sayi kucuk esittir ikinci sayi kucuk esittir
		 * 
		 * Birinci sayiyi giriniz: 10 ikinci sayiyi giriniz: 10 sayilar esittir sayilar
		 * farkli degildir ilk sayi kucuk degildir ikinci sayi kucuk degildir ilk sayi
		 * kucuk esittir ikinci sayi kucuk esittir
		 */

		sayiKarsilastir();
		
		System.out.println("*****************");
		
		sayiKarsilastir();
		
		System.out.println("*****************");
		
		sayiKarsilastir();
		
//		bir tamsay� giriniz :10
//		12
//		 sayilar esit degildir
//		*****************
//		bir tamsay� giriniz :15
//		-3
//		 sayilar esit degildir
//		*****************
//		bir tamsay� giriniz :10
//		10
//		sayilar esittir


	}

	public static void sayiKarsilastir() {

		Scanner scan = new Scanner(System.in);
		System.out.print("bir tamsay� giriniz :");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		if (sayi1 == sayi2) {

			System.out.println("sayilar esittir");

		} else if (sayi1 != sayi2) {

			System.out.println(" sayilar esit degildir");

		} else if (sayi1 > sayi2) {

			System.out.println("ilk sayi kucuk degildir");

		} else if (sayi2 > sayi1) {

			System.out.println(" ikinci sayi kucuk degildir");

		} else if (sayi1 <= sayi2) {
			System.out.println(" ilk sayi kucuk esittir");

		} else
			System.out.println(" ikinci sayi kucuk esittir");

	}

}
