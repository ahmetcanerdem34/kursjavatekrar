package day_18_whileLoop;

import java.util.Scanner;

public class C1_WhileCalisma02 {

	public static void main(String[] args) {
		
		
		/*  Problem Tanýmý
        Verilen iki sayýnýn kombinasyonunu bulan kodu yazýnýz.
        Hatýrlatma C(n,r) = n! / (r!(n-r)!)
        Ekran Çýktýsý
        Birinci sayýyý giriniz: 15
        Ikinci sayýyý giriniz: 4
        Kombinasyon: 1365
        Birinci sayýyý giriniz: 5
        Ikinci sayýyý giriniz: 3
        Kombinasyon: 10
      */
		
		//int verirseniz kapasitesi karþýlamaz girilen sayýlarýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("sayý giriniz");
		long a=scan.nextInt();
		System.out.println("sayý giriniz");
		long b=scan.nextInt();
		
		faktoriyel(a);
		kombi(a,b);
		
	
}

	public static void kombi(long a, long b) {
		
		long sonuc;
		sonuc=faktoriyel(a)/((faktoriyel(b)*(a-b)));
		
		System.out.println("kombinasyon : "+sonuc);
		
	}

	public static long faktoriyel(long sayi) {
		long faktr=1;
		for (long i = 0; i < sayi; i++) {
			
			faktr*=i;
			
		}
		return faktr;
		
	}
	
	
	
}