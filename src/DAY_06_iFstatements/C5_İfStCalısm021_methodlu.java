package DAY_06_iFstatements;

import java.util.Scanner;

public class C5_�fStCal�sm021_methodlu {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
		 * oldu�unu, de�ilse sessiz harf oldu�unu ekrana yazd�rs�n. Girdi�i de�er harf
		 * de�ilse yada 1 karakterden fazla ise hata mesaj� g�stersin. (Test girilen
		 * harfi b�y�k yada k���kl���ne duyarl�d�r.)
		 * 
		 * Sesli harfler: a,e,i,o,u
		 * 
		 * Test Data: a
		 * 
		 * Beklenen ��kt�: a harfi sesli harfdir.
		 * 
		 * Test Data: d
		 * 
		 * Beklenen ��kt�: d harfi sesiz harftir.
		 * 
		 * Test Data: we yada %
		 * 
		 * Beklenen ��kt�: Yanlis karakter girdiniz!
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











