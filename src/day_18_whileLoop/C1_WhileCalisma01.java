package day_18_whileLoop;

import java.util.Iterator;

public class C1_WhileCalisma01 {

	public static void main(String[] args) {
		
		 /*  Problem Tan�m�
        Verilen bir say�n�n fakt�riyelini �zyineli (recursive) olarak
        hespalayan fonksiyonu yaz�n�z.
        �rnek Ekran ��kt�lar�
        Bir sayi giriniz: 6
        Fakt�riyeli: 720
        Bir say� giriniz: 3
        Fakt�riyeli 6
     */
		
		int sayi =6;
		
		int carpim=1;
		for (int i = 1; i < sayi; i++) {
	
			carpim=carpim*i;
		}
		System.out.println(carpim);
	}

}
