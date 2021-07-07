package day_18_whileLoop;

import java.util.Iterator;

public class C1_WhileCalisma01 {

	public static void main(String[] args) {
		
		 /*  Problem Tanýmý
        Verilen bir sayýnýn faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazýnýz.
        Örnek Ekran Çýktýlarý
        Bir sayi giriniz: 6
        Faktöriyeli: 720
        Bir sayý giriniz: 3
        Faktöriyeli 6
     */
		
		int sayi =6;
		
		int carpim=1;
		for (int i = 1; i < sayi; i++) {
	
			carpim=carpim*i;
		}
		System.out.println(carpim);
	}

}
