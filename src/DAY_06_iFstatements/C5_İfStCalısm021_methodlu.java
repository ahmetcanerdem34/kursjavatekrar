package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_ÝfStCalýsm021_methodlu {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
		 * olduðunu, deðilse sessiz harf olduðunu ekrana yazdýrsýn. Girdiði deðer harf
		 * deðilse yada 1 karakterden fazla ise hata mesajý göstersin. (Test girilen
		 * harfi büyük yada küçüklüðüne duyarlýdýr.)
		 * 
		 * Sesli harfler: a,e,i,o,u
		 * 
		 * Test Data: a
		 * 
		 * Beklenen Çýktý: a harfi sesli harfdir.
		 * 
		 * Test Data: d
		 * 
		 * Beklenen Çýktý: d harfi sesiz harftir.
		 * 
		 * Test Data: we yada %
		 * 
		 * Beklenen Çýktý: Yanlis karakter girdiniz!
		 * 
		 */

		

		Scanner scan = new Scanner(System.in);
		System.out.print("bir harf giriniz :");
		String str = scan.nextLine().toLowerCase();

			if (str.length()==1) {
				System.out.println("sesli harf");
				
			}
			if((str.charAt(0)=='a')) {
				
			}
				
				
	
}

						
}					











